package com.hnqj.controller;

import com.hnqj.core.PageData;
import com.hnqj.core.ResultUtils;
import com.hnqj.core.TableReturn;
import com.hnqj.core.TreeReturn;
import com.hnqj.model.Dict;
import com.hnqj.model.Distribution;
import com.hnqj.model.Sysusermgr;
import com.hnqj.services.DictServices;
import com.hnqj.services.SysusermgrServices;
import net.sourceforge.pinyin4j.PinyinHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.reflect.generics.tree.Tree;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import static com.hnqj.core.EncodeUtil.encodeMD5;
import static com.hnqj.core.ResultUtils.toJson;

/**
 * 张威 2017/11
 * 字典管理
 */
@Controller
@RequestMapping("/dictionaries")
public class DictionariesController extends  BaseController{
    @Autowired
    DictServices dictServices;
    /**
     * 跳转到字典管理页面
     * @return
     */
    @RequestMapping("/toDictionariesList.do")
    public String toDictionariesList(){
        return "sys/dictionarieslist";
    }

    //初始化数据列表
    @RequestMapping("/getDictList.do")
    public String getUserList(HttpServletRequest request, HttpServletResponse response, Model model) {
        logger.info("字典查看");

        String treeId = request.getParameter("treeId") == null ? "" : request.getParameter("treeId");
        int currentPage = request.getParameter("offset") == null ? 0 : Integer.parseInt(request.getParameter("offset"));
        // 每页行数
        int showCount = request.getParameter("limit") == null ? 0 : Integer.parseInt(request.getParameter("limit"));
        TableReturn tablereturn = new TableReturn();
        PageData pageData = new PageData();
        pageData.put("offset", currentPage);
        pageData.put("limit", showCount);
        List<Dict> list = null;
        List<Dict> listCount = null;
        if(treeId.equalsIgnoreCase("")) {//没有选择树节点的查询
            pageData.put("parentId", "0");
            list=dictServices.getAllDict(pageData);
            listCount=dictServices.selectDictList("0");
        }else{
            pageData.put("parentId",treeId);
            list=dictServices.getAllDict(pageData);
            listCount=dictServices.selectDictList(treeId);
        }
        List<Map<String, Object>> hashMaps=new ArrayList<>();
        for(Dict dict:list){
            Map<String, Object> map = new HashMap<>();
            map.put("uid",dict.getUid());
            map.put("groupname",dict.getGroupname());
            map.put("keyname",dict.getKeyname());
            map.put("keyvalue",dict.getKeyvalue());
            if(dict.getParentid().equalsIgnoreCase("0")){
                map.put("parentid","");
            }else{
                map.put("parentid",dictServices.getDictforId(dict.getParentid()).getKeyname());
            }
            map.put("remarket",dict.getRemarket());
            hashMaps.add(map);
        }
        tablereturn.setRows(hashMaps);
        tablereturn.setTotal(listCount.size());
        ResultUtils.write(response, toJson(tablereturn));
        return null;
    }

    // 添加
    @RequestMapping("/addDict.do")
    public String addDict(HttpServletRequest request, HttpServletResponse response) {
        logger.info("addDict");
        String groupname = request.getParameter("groupname") == null ? "" : request.getParameter("groupname");
        String keyname = request.getParameter("keyname") == null ? "" : request.getParameter("keyname");
        String keyvalue = request.getParameter("keyvalue") == null ? "" : request.getParameter("keyvalue");
        String parentid = request.getParameter("parentid") == null ? "" : request.getParameter("parentid");//部门ID
        String remarket = request.getParameter("remarket") == null ? "" : request.getParameter("remarket");//部门ID
        PageData dictPageData = new PageData();
        dictPageData.put("uid", UUID.randomUUID().toString());
        dictPageData.put("groupname", groupname);
        dictPageData.put("keyname", keyname);
        dictPageData.put("keyvalue", keyvalue);
        dictPageData.put("parentid", parentid);
        dictPageData.put("remarket", remarket);
        try {
            dictServices.addDict(dictPageData);
            ResultUtils.writeSuccess(response);
        } catch (Exception e) {
            logger.error("addDict e=" + e.getMessage());
            ResultUtils.writeFailed(response);
        }
        return null;
    }
    /**
     * 通过ID获取一条记录
     */
    @RequestMapping("/getDictById.do")
    public void getDictById(HttpServletRequest request, HttpServletResponse response){
        String ids = request.getParameter("ids") == null ? "" : request.getParameter("ids");
        try {
            Dict dict= dictServices.getDictforId(ids);
            List<Map<String, Object>> hashMaps=new ArrayList<>();
            Map<String, Object> map = new HashMap<>();
            map.put("groupname",dict.getGroupname());
            map.put("keyname",dict.getKeyname());
            map.put("keyvalue",dict.getKeyvalue());
            map.put("parentid",dict.getParentid());
            if(dict.getParentid().equalsIgnoreCase("0")){
                map.put("parentid","0");
                map.put("parentName","");
            }else{
                Dict dict1=dictServices.getDictforId(dict.getParentid());
                map.put("parentid",dict1.getUid());
                map.put("parentName",dict1.getGroupname());
            }
            map.put("remarket",dict.getRemarket());
            hashMaps.add(map);
            ResultUtils.write(response, toJson(hashMaps));
        } catch (Exception e) {
            logger.error("getDictById e=" + e.toString());
            ResultUtils.writeFailed(response);
        }
    }
    /**
     * 修改
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/updateDict.do")
    public String updateDict(HttpServletRequest request, HttpServletResponse response){
        logger.debug("updateDict");
        String uid = request.getParameter("uid") == null ? "" : request.getParameter("uid");
        String groupname = request.getParameter("groupname") == null ? "" : request.getParameter("groupname");
        String keyname = request.getParameter("keyname") == null ? "" : request.getParameter("keyname");
        String keyvalue = request.getParameter("keyvalue") == null ? "" : request.getParameter("keyvalue");
        String parentid = request.getParameter("parentid") == null ? "" : request.getParameter("parentid");//部门ID
        String remarket = request.getParameter("remarket") == null ? "" : request.getParameter("remarket");//部门ID
        PageData dictPageData = new PageData();
        dictPageData.put("uid", uid);
        dictPageData.put("groupname", groupname);
        dictPageData.put("keyname", keyname);
        dictPageData.put("keyvalue", keyvalue);
        dictPageData.put("parentid", parentid);
        dictPageData.put("remarket", remarket);
        try {
            dictServices.updateDict(dictPageData);
            ResultUtils.writeSuccess(response);
        } catch (Exception e) {
            logger.error("updateDict e=" + e.getMessage());
            ResultUtils.writeFailed(response);
        }
        return null;
    }
    /**
     * 删除
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping("/delDictById.do")
    @Transactional
    public String delDictById(HttpServletRequest request, HttpServletResponse response, Model model){
        logger.debug("delDictById");
        try{
            String ids = request.getParameter("ids") == null ? "" : request.getParameter("ids");
            dictServices.delDictByFid(ids);
            dictServices.delChildByFid(ids);
            ResultUtils.writeSuccess(response);
        } catch (Exception e) {
            logger.error("delDictById e="+e.getMessage());
            ResultUtils.writeFailed(response);
        }
        return null;
    }
    /**
     *父菜单列表
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/getParentModule.do")
    public String getParentModule(HttpServletRequest request, HttpServletResponse response) {
        logger.debug("getParentModule");
        try {
            List<Dict> dictList = dictServices.getParentModule();
            ResultUtils.write(response, toJson(dictList));
        } catch (Exception e) {
            logger.error("getParentModule e=" + e.toString());
            ResultUtils.writeFailed(response);
        }
        return null;
    }
    /**
     * 树
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/getDictTree.do")
    public String getUnitTree(HttpServletRequest request, HttpServletResponse response){
        List<Dict> dictList=dictServices.selectDictLists();//获取所有数据
        List<TreeReturn> Trees= new ArrayList<TreeReturn>();
        for(Dict dict:dictList){
            TreeReturn tree=new TreeReturn();
            tree.setId(dict.getUid());
            tree.setpId(dict.getParentid());
            tree.setName(dict.getKeyname());
            Trees.add(tree);
        }
        ResultUtils.write(response,Trees);
        return null;
    }
    /**
     * 获取节点及子节点
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/getDictForKeyval.do")
    public String getDictForKeyval(HttpServletRequest request, HttpServletResponse response){
        String ids = request.getParameter("keys") == null ? "" : request.getParameter("keys");
        List<Dict> list=dictServices.getDictForKeys(ids);//获取所有数据
        List<TreeReturn> Trees= new ArrayList<TreeReturn>();
        for(Dict dict:list){
            TreeReturn tree=new TreeReturn();
            tree.setId(dict.getUid());
            tree.setpId(dict.getParentid());
            tree.setName(dict.getKeyname());
            getTreeChilds(dict.getUid(),Trees);
            Trees.add(tree);
        }
        ResultUtils.write(response,Trees);
        return null;
    }
    private void getTreeChilds(String treeId, List<TreeReturn> trees){
        List<Dict> list=dictServices.selectDictList(treeId);//获取子节点

        for(Dict dict:list){
            TreeReturn tree=new TreeReturn();
            tree.setId(dict.getUid());
            tree.setpId(dict.getParentid());
            tree.setName(dict.getKeyname());
            getTreeChilds(dict.getUid(),trees);
            trees.add(tree);
        }

    }
}
