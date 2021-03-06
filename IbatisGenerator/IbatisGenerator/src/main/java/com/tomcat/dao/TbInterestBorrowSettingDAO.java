package com.tomcat.dao;

import com.tomcat.model.TbInterestBorrowSetting;
import com.tomcat.model.TbInterestBorrowSettingExample;
import java.util.List;

public interface TbInterestBorrowSettingDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int countByExample(TbInterestBorrowSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByExample(TbInterestBorrowSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insert(TbInterestBorrowSetting record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insertSelective(TbInterestBorrowSetting record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExample(TbInterestBorrowSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    TbInterestBorrowSetting selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleSelective(TbInterestBorrowSetting record, TbInterestBorrowSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExample(TbInterestBorrowSetting record, TbInterestBorrowSettingExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeySelective(TbInterestBorrowSetting record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKey(TbInterestBorrowSetting record);
}