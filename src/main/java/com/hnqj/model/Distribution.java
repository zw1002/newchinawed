package com.hnqj.model;

public class Distribution {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distribution.uid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distribution.parentid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String parentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distribution.userseltid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String userseltid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_distribution.distprod
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String distprod;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distribution.uid
     *
     * @return the value of tb_distribution.uid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distribution.uid
     *
     * @param uid the value for tb_distribution.uid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distribution.parentid
     *
     * @return the value of tb_distribution.parentid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distribution.parentid
     *
     * @param parentid the value for tb_distribution.parentid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distribution.userseltid
     *
     * @return the value of tb_distribution.userseltid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getUserseltid() {
        return userseltid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distribution.userseltid
     *
     * @param userseltid the value for tb_distribution.userseltid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setUserseltid(String userseltid) {
        this.userseltid = userseltid == null ? null : userseltid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_distribution.distprod
     *
     * @return the value of tb_distribution.distprod
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getDistprod() {
        return distprod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_distribution.distprod
     *
     * @param distprod the value for tb_distribution.distprod
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setDistprod(String distprod) {
        this.distprod = distprod == null ? null : distprod.trim();
    }
}