package com.tomcat.dao.impl;

import com.tomcat.dao.TbTenderInterestDAO;
import com.tomcat.model.TbTenderInterest;
import com.tomcat.model.TbTenderInterestExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbTenderInterestDAOImpl extends SqlMapClientDaoSupport implements TbTenderInterestDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbTenderInterestDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbTenderInterestExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_tender_interest.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbTenderInterestExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_tender_interest.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Long id) {
        TbTenderInterest key = new TbTenderInterest();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_tender_interest.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbTenderInterest record) {
        getSqlMapClientTemplate().insert("tb_tender_interest.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbTenderInterest record) {
        getSqlMapClientTemplate().insert("tb_tender_interest.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbTenderInterestExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_tender_interest.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbTenderInterest selectByPrimaryKey(Long id) {
        TbTenderInterest key = new TbTenderInterest();
        key.setId(id);
        TbTenderInterest record = (TbTenderInterest) getSqlMapClientTemplate().queryForObject("tb_tender_interest.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbTenderInterest record, TbTenderInterestExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_tender_interest.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbTenderInterest record, TbTenderInterestExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_tender_interest.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbTenderInterest record) {
        int rows = getSqlMapClientTemplate().update("tb_tender_interest.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbTenderInterest record) {
        int rows = getSqlMapClientTemplate().update("tb_tender_interest.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_tender_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbTenderInterestExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbTenderInterestExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}