package com.tomcat.model;

public class TbCity {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tb_city.id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tb_city.city_id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private Integer cityId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tb_city.city
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private String city;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column tb_city.parent_id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private Integer parentId;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tb_city.id
     *
     * @return the value of tb_city.id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tb_city.id
     *
     * @param id the value for tb_city.id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tb_city.city_id
     *
     * @return the value of tb_city.city_id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tb_city.city_id
     *
     * @param cityId the value for tb_city.city_id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tb_city.city
     *
     * @return the value of tb_city.city
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tb_city.city
     *
     * @param city the value for tb_city.city
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column tb_city.parent_id
     *
     * @return the value of tb_city.parent_id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column tb_city.parent_id
     *
     * @param parentId the value for tb_city.parent_id
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}