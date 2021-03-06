package com.tomcat.dao;

import com.tomcat.model.TbFundFlow;
import com.tomcat.model.TbFundFlowExample;
import java.util.List;

public interface TbFundFlowDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int countByExample(TbFundFlowExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByExample(TbFundFlowExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insert(TbFundFlow record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insertSelective(TbFundFlow record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExampleWithBLOBs(TbFundFlowExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExampleWithoutBLOBs(TbFundFlowExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    TbFundFlow selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleSelective(TbFundFlow record, TbFundFlowExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleWithBLOBs(TbFundFlow record, TbFundFlowExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleWithoutBLOBs(TbFundFlow record, TbFundFlowExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeySelective(TbFundFlow record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(TbFundFlow record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeyWithoutBLOBs(TbFundFlow record);
}