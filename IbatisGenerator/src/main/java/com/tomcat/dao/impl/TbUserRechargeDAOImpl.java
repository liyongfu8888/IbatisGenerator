package com.tomcat.dao.impl;

import com.tomcat.dao.TbUserRechargeDAO;
import com.tomcat.model.TbUserRecharge;
import com.tomcat.model.TbUserRechargeExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbUserRechargeDAOImpl extends SqlMapClientDaoSupport implements TbUserRechargeDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbUserRechargeDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbUserRechargeExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_user_recharge.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbUserRechargeExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_user_recharge.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbUserRecharge key = new TbUserRecharge();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_user_recharge.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbUserRecharge record) {
        getSqlMapClientTemplate().insert("tb_user_recharge.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbUserRecharge record) {
        getSqlMapClientTemplate().insert("tb_user_recharge.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExampleWithBLOBs(TbUserRechargeExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_user_recharge.ibatorgenerated_selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExampleWithoutBLOBs(TbUserRechargeExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_user_recharge.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbUserRecharge selectByPrimaryKey(Integer id) {
        TbUserRecharge key = new TbUserRecharge();
        key.setId(id);
        TbUserRecharge record = (TbUserRecharge) getSqlMapClientTemplate().queryForObject("tb_user_recharge.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbUserRecharge record, TbUserRechargeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_user_recharge.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleWithBLOBs(TbUserRecharge record, TbUserRechargeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_user_recharge.ibatorgenerated_updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleWithoutBLOBs(TbUserRecharge record, TbUserRechargeExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_user_recharge.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbUserRecharge record) {
        int rows = getSqlMapClientTemplate().update("tb_user_recharge.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeyWithBLOBs(TbUserRecharge record) {
        int rows = getSqlMapClientTemplate().update("tb_user_recharge.ibatorgenerated_updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeyWithoutBLOBs(TbUserRecharge record) {
        int rows = getSqlMapClientTemplate().update("tb_user_recharge.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_user_recharge
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbUserRechargeExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbUserRechargeExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}