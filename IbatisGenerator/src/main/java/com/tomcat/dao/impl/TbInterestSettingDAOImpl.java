package com.tomcat.dao.impl;

import com.tomcat.dao.TbInterestSettingDAO;
import com.tomcat.model.TbInterestSetting;
import com.tomcat.model.TbInterestSettingExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbInterestSettingDAOImpl extends SqlMapClientDaoSupport implements TbInterestSettingDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbInterestSettingDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbInterestSettingExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_interest_setting.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbInterestSettingExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_interest_setting.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbInterestSetting key = new TbInterestSetting();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_interest_setting.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbInterestSetting record) {
        getSqlMapClientTemplate().insert("tb_interest_setting.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbInterestSetting record) {
        getSqlMapClientTemplate().insert("tb_interest_setting.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbInterestSettingExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_interest_setting.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbInterestSetting selectByPrimaryKey(Integer id) {
        TbInterestSetting key = new TbInterestSetting();
        key.setId(id);
        TbInterestSetting record = (TbInterestSetting) getSqlMapClientTemplate().queryForObject("tb_interest_setting.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbInterestSetting record, TbInterestSettingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_interest_setting.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbInterestSetting record, TbInterestSettingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_interest_setting.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbInterestSetting record) {
        int rows = getSqlMapClientTemplate().update("tb_interest_setting.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbInterestSetting record) {
        int rows = getSqlMapClientTemplate().update("tb_interest_setting.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_interest_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbInterestSettingExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbInterestSettingExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}