package com.tomcat.dao.impl;

import com.tomcat.dao.TbAdminLogDAO;
import com.tomcat.model.TbAdminLog;
import com.tomcat.model.TbAdminLogExample;
import com.tomcat.model.TbAdminLogWithBLOBs;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbAdminLogDAOImpl extends SqlMapClientDaoSupport implements TbAdminLogDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbAdminLogDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbAdminLogExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_admin_log.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbAdminLogExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_admin_log.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Long id) {
        TbAdminLog key = new TbAdminLog();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_admin_log.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbAdminLogWithBLOBs record) {
        getSqlMapClientTemplate().insert("tb_admin_log.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbAdminLogWithBLOBs record) {
        getSqlMapClientTemplate().insert("tb_admin_log.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExampleWithBLOBs(TbAdminLogExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_admin_log.ibatorgenerated_selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExampleWithoutBLOBs(TbAdminLogExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_admin_log.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbAdminLogWithBLOBs selectByPrimaryKey(Long id) {
        TbAdminLog key = new TbAdminLog();
        key.setId(id);
        TbAdminLogWithBLOBs record = (TbAdminLogWithBLOBs) getSqlMapClientTemplate().queryForObject("tb_admin_log.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbAdminLogWithBLOBs record, TbAdminLogExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_admin_log.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbAdminLogWithBLOBs record, TbAdminLogExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_admin_log.ibatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbAdminLog record, TbAdminLogExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_admin_log.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbAdminLogWithBLOBs record) {
        int rows = getSqlMapClientTemplate().update("tb_admin_log.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbAdminLogWithBLOBs record) {
        int rows = getSqlMapClientTemplate().update("tb_admin_log.ibatorgenerated_updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbAdminLog record) {
        int rows = getSqlMapClientTemplate().update("tb_admin_log.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_admin_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbAdminLogExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbAdminLogExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}