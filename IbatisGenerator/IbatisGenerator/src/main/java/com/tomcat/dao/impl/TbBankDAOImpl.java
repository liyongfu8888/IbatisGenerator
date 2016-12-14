package com.tomcat.dao.impl;

import com.tomcat.dao.TbBankDAO;
import com.tomcat.model.TbBank;
import com.tomcat.model.TbBankExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbBankDAOImpl extends SqlMapClientDaoSupport implements TbBankDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbBankDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbBankExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_bank.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbBankExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_bank.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbBank key = new TbBank();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_bank.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbBank record) {
        getSqlMapClientTemplate().insert("tb_bank.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbBank record) {
        getSqlMapClientTemplate().insert("tb_bank.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbBankExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_bank.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbBank selectByPrimaryKey(Integer id) {
        TbBank key = new TbBank();
        key.setId(id);
        TbBank record = (TbBank) getSqlMapClientTemplate().queryForObject("tb_bank.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbBank record, TbBankExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_bank.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbBank record, TbBankExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_bank.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbBank record) {
        int rows = getSqlMapClientTemplate().update("tb_bank.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbBank record) {
        int rows = getSqlMapClientTemplate().update("tb_bank.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_bank
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbBankExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbBankExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}