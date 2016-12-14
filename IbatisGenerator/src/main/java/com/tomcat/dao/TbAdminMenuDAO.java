package com.tomcat.dao;

import com.tomcat.model.TbAdminMenu;
import com.tomcat.model.TbAdminMenuExample;
import java.util.List;

public interface TbAdminMenuDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int countByExample(TbAdminMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByExample(TbAdminMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insert(TbAdminMenu record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insertSelective(TbAdminMenu record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExampleWithBLOBs(TbAdminMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExampleWithoutBLOBs(TbAdminMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    TbAdminMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleSelective(TbAdminMenu record, TbAdminMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleWithBLOBs(TbAdminMenu record, TbAdminMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleWithoutBLOBs(TbAdminMenu record, TbAdminMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeySelective(TbAdminMenu record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(TbAdminMenu record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeyWithoutBLOBs(TbAdminMenu record);
}