package com.tomcat.model;

public class TbAuthItemWithBLOBs extends TbAuthItem {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tb_auth_item.description
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private String description;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tb_auth_item.data
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private String data;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tb_auth_item.description
     *
     * @return the value of tb_auth_item.description
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tb_auth_item.description
     *
     * @param description the value for tb_auth_item.description
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tb_auth_item.data
     *
     * @return the value of tb_auth_item.data
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public String getData() {
        return data;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tb_auth_item.data
     *
     * @param data the value for tb_auth_item.data
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setData(String data) {
        this.data = data;
    }
}