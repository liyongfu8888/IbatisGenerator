package com.tomcat.dao;

import com.tomcat.model.TbInterestSetting;
import com.tomcat.model.TbInterestSettingExample;
import java.util.List;

public interface TbInterestSettingDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int countByExample(TbInterestSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByExample(TbInterestSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insert(TbInterestSetting record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insertSelective(TbInterestSetting record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExample(TbInterestSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    TbInterestSetting selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleSelective(TbInterestSetting record, TbInterestSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExample(TbInterestSetting record, TbInterestSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeySelective(TbInterestSetting record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKey(TbInterestSetting record);
}