package com.hnqj.model;

public class Proportions {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_proportions.uid
     *
     * @mbg.generated Sat Dec 02 20:44:18 CST 2017
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_proportions.dislevel
     *
     * @mbg.generated Sat Dec 02 20:44:18 CST 2017
     */
    private Integer dislevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_proportions.distprod
     *
     * @mbg.generated Sat Dec 02 20:44:18 CST 2017
     */
    private String distprod;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_proportions.uid
     *
     * @return the value of tb_proportions.uid
     *
     * @mbg.generated Sat Dec 02 20:44:18 CST 2017
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_proportions.uid
     *
     * @param uid the value for tb_proportions.uid
     *
     * @mbg.generated Sat Dec 02 20:44:18 CST 2017
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_proportions.dislevel
     *
     * @return the value of tb_proportions.dislevel
     *
     * @mbg.generated Sat Dec 02 20:44:18 CST 2017
     */
    public Integer getDislevel() {
        return dislevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_proportions.dislevel
     *
     * @param dislevel the value for tb_proportions.dislevel
     *
     * @mbg.generated Sat Dec 02 20:44:18 CST 2017
     */
    public void setDislevel(Integer dislevel) {
        this.dislevel = dislevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_proportions.distprod
     *
     * @return the value of tb_proportions.distprod
     *
     * @mbg.generated Sat Dec 02 20:44:18 CST 2017
     */
    public String getDistprod() {
        return distprod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_proportions.distprod
     *
     * @param distprod the value for tb_proportions.distprod
     *
     * @mbg.generated Sat Dec 02 20:44:18 CST 2017
     */
    public void setDistprod(String distprod) {
        this.distprod = distprod == null ? null : distprod.trim();
    }
}