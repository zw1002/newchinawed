package com.hnqj.model;

import java.util.Date;

public class Unsubscribe {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_unsubscribe.unsubid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String unsubid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_unsubscribe.orderid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Integer orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_unsubscribe.unsubtime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Date unsubtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_unsubscribe.checker
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String checker;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_unsubscribe.checktime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Date checktime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_unsubscribe.unsubstate
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String unsubstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_unsubscribe.price
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Long price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_unsubscribe.unsubid
     *
     * @return the value of tb_unsubscribe.unsubid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getUnsubid() {
        return unsubid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_unsubscribe.unsubid
     *
     * @param unsubid the value for tb_unsubscribe.unsubid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setUnsubid(String unsubid) {
        this.unsubid = unsubid == null ? null : unsubid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_unsubscribe.orderid
     *
     * @return the value of tb_unsubscribe.orderid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_unsubscribe.orderid
     *
     * @param orderid the value for tb_unsubscribe.orderid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_unsubscribe.unsubtime
     *
     * @return the value of tb_unsubscribe.unsubtime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Date getUnsubtime() {
        return unsubtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_unsubscribe.unsubtime
     *
     * @param unsubtime the value for tb_unsubscribe.unsubtime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setUnsubtime(Date unsubtime) {
        this.unsubtime = unsubtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_unsubscribe.checker
     *
     * @return the value of tb_unsubscribe.checker
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getChecker() {
        return checker;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_unsubscribe.checker
     *
     * @param checker the value for tb_unsubscribe.checker
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_unsubscribe.checktime
     *
     * @return the value of tb_unsubscribe.checktime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Date getChecktime() {
        return checktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_unsubscribe.checktime
     *
     * @param checktime the value for tb_unsubscribe.checktime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_unsubscribe.unsubstate
     *
     * @return the value of tb_unsubscribe.unsubstate
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getUnsubstate() {
        return unsubstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_unsubscribe.unsubstate
     *
     * @param unsubstate the value for tb_unsubscribe.unsubstate
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setUnsubstate(String unsubstate) {
        this.unsubstate = unsubstate == null ? null : unsubstate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_unsubscribe.price
     *
     * @return the value of tb_unsubscribe.price
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_unsubscribe.price
     *
     * @param price the value for tb_unsubscribe.price
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setPrice(Long price) {
        this.price = price;
    }
}