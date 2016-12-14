package com.tomcat.dao.impl;

import com.tomcat.dao.TbTrustCodeDAO;
import com.tomcat.model.TbTrustCode;
import com.tomcat.model.TbTrustCodeExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbTrustCodeDAOImpl extends SqlMapClientDaoSupport implements TbTrustCodeDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbTrustCodeDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbTrustCodeExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_trust_code.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbTrustCodeExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_trust_code.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbTrustCode key = new TbTrustCode();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_trust_code.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbTrustCode record) {
        getSqlMapClientTemplate().insert("tb_trust_code.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbTrustCode record) {
        getSqlMapClientTemplate().insert("tb_trust_code.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExampleWithBLOBs(TbTrustCodeExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_trust_code.ibatorgenerated_selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExampleWithoutBLOBs(TbTrustCodeExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_trust_code.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbTrustCode selectByPrimaryKey(Integer id) {
        TbTrustCode key = new TbTrustCode();
        key.setId(id);
        TbTrustCode record = (TbTrustCode) getSqlMapClientTemplate().queryForObject("tb_trust_code.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbTrustCode record, TbTrustCodeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_trust_code.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleWithBLOBs(TbTrustCode record, TbTrustCodeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_trust_code.ibatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleWithoutBLOBs(TbTrustCode record, TbTrustCodeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_trust_code.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbTrustCode record) {
        int rows = getSqlMapClientTemplate().update("tb_trust_code.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeyWithBLOBs(TbTrustCode record) {
        int rows = getSqlMapClientTemplate().update("tb_trust_code.ibatorgenerated_updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeyWithoutBLOBs(TbTrustCode record) {
        int rows = getSqlMapClientTemplate().update("tb_trust_code.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_trust_code
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbTrustCodeExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbTrustCodeExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}