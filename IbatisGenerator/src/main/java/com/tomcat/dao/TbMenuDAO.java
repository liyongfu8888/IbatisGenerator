package com.tomcat.dao;

import com.tomcat.model.TbMenu;
import com.tomcat.model.TbMenuExample;
import java.util.List;

public interface TbMenuDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int countByExample(TbMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByExample(TbMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insert(TbMenu record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insertSelective(TbMenu record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExampleWithBLOBs(TbMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExampleWithoutBLOBs(TbMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    TbMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleSelective(TbMenu record, TbMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleWithBLOBs(TbMenu record, TbMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleWithoutBLOBs(TbMenu record, TbMenuExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeySelective(TbMenu record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(TbMenu record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_menu
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeyWithoutBLOBs(TbMenu record);
}