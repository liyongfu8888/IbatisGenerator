package com.tomcat.dao.impl;

import com.tomcat.dao.TbUserAccountLogDAO;
import com.tomcat.model.TbUserAccountLog;
import com.tomcat.model.TbUserAccountLogExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbUserAccountLogDAOImpl extends SqlMapClientDaoSupport implements TbUserAccountLogDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbUserAccountLogDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbUserAccountLogExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_user_account_log.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbUserAccountLogExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_user_account_log.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbUserAccountLog key = new TbUserAccountLog();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_user_account_log.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbUserAccountLog record) {
        getSqlMapClientTemplate().insert("tb_user_account_log.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbUserAccountLog record) {
        getSqlMapClientTemplate().insert("tb_user_account_log.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbUserAccountLogExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_user_account_log.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbUserAccountLog selectByPrimaryKey(Integer id) {
        TbUserAccountLog key = new TbUserAccountLog();
        key.setId(id);
        TbUserAccountLog record = (TbUserAccountLog) getSqlMapClientTemplate().queryForObject("tb_user_account_log.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbUserAccountLog record, TbUserAccountLogExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_user_account_log.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbUserAccountLog record, TbUserAccountLogExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_user_account_log.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbUserAccountLog record) {
        int rows = getSqlMapClientTemplate().update("tb_user_account_log.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbUserAccountLog record) {
        int rows = getSqlMapClientTemplate().update("tb_user_account_log.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_user_account_log
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbUserAccountLogExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbUserAccountLogExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}