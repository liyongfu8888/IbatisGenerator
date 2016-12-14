package com.tomcat.dao;

import com.tomcat.model.TbHongbaoSetting;
import com.tomcat.model.TbHongbaoSettingExample;
import java.util.List;

public interface TbHongbaoSettingDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int countByExample(TbHongbaoSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByExample(TbHongbaoSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insert(TbHongbaoSetting record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insertSelective(TbHongbaoSetting record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExample(TbHongbaoSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    TbHongbaoSetting selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleSelective(TbHongbaoSetting record, TbHongbaoSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExample(TbHongbaoSetting record, TbHongbaoSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeySelective(TbHongbaoSetting record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKey(TbHongbaoSetting record);
}