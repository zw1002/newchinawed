package com.hnqj.model;

import java.math.BigDecimal;
import java.util.Date;

public class Distrirecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distrirecord.uid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distrirecord.dealid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String dealid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distrirecord.worksid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String worksid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distrirecord.level
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distrirecord.userid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distrirecord.proportion
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Float proportion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distrirecord.price
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distrirecord.state
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distrirecord.addtime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Date addtime;


    private String referee;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distrirecord.uid
     *
     * @return the value of tb_distrirecord.uid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distrirecord.uid
     *
     * @param uid the value for tb_distrirecord.uid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distrirecord.dealid
     *
     * @return the value of tb_distrirecord.dealid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getDealid() {
        return dealid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distrirecord.dealid
     *
     * @param dealid the value for tb_distrirecord.dealid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setDealid(String dealid) {
        this.dealid = dealid == null ? null : dealid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distrirecord.worksid
     *
     * @return the value of tb_distrirecord.worksid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getWorksid() {
        return worksid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distrirecord.worksid
     *
     * @param worksid the value for tb_distrirecord.worksid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setWorksid(String worksid) {
        this.worksid = worksid == null ? null : worksid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distrirecord.level
     *
     * @return the value of tb_distrirecord.level
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distrirecord.level
     *
     * @param level the value for tb_distrirecord.level
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distrirecord.userid
     *
     * @return the value of tb_distrirecord.userid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distrirecord.userid
     *
     * @param userid the value for tb_distrirecord.userid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distrirecord.proportion
     *
     * @return the value of tb_distrirecord.proportion
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Float getProportion() {
        return proportion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distrirecord.proportion
     *
     * @param proportion the value for tb_distrirecord.proportion
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setProportion(Float proportion) {
        this.proportion = proportion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distrirecord.price
     *
     * @return the value of tb_distrirecord.price
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distrirecord.price
     *
     * @param price the value for tb_distrirecord.price
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distrirecord.state
     *
     * @return the value of tb_distrirecord.state
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distrirecord.state
     *
     * @param state the value for tb_distrirecord.state
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distrirecord.addtime
     *
     * @return the value of tb_distrirecord.addtime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distrirecord.addtime
     *
     * @param addtime the value for tb_distrirecord.addtime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }
}