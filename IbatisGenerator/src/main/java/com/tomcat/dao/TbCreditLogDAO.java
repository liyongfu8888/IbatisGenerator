package com.tomcat.dao;

import com.tomcat.model.TbCreditLog;
import com.tomcat.model.TbCreditLogExample;
import java.util.List;

public interface TbCreditLogDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int countByExample(TbCreditLogExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByExample(TbCreditLogExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insert(TbCreditLog record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insertSelective(TbCreditLog record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExample(TbCreditLogExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    TbCreditLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleSelective(TbCreditLog record, TbCreditLogExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExample(TbCreditLog record, TbCreditLogExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeySelective(TbCreditLog record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKey(TbCreditLog record);
}