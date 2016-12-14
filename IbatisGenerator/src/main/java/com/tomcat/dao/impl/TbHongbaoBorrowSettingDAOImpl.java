package com.tomcat.dao.impl;

import com.tomcat.dao.TbHongbaoBorrowSettingDAO;
import com.tomcat.model.TbHongbaoBorrowSetting;
import com.tomcat.model.TbHongbaoBorrowSettingExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbHongbaoBorrowSettingDAOImpl extends SqlMapClientDaoSupport implements TbHongbaoBorrowSettingDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbHongbaoBorrowSettingDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbHongbaoBorrowSettingExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_hongbao_borrow_setting.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbHongbaoBorrowSettingExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_hongbao_borrow_setting.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbHongbaoBorrowSetting key = new TbHongbaoBorrowSetting();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_hongbao_borrow_setting.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbHongbaoBorrowSetting record) {
        getSqlMapClientTemplate().insert("tb_hongbao_borrow_setting.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbHongbaoBorrowSetting record) {
        getSqlMapClientTemplate().insert("tb_hongbao_borrow_setting.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbHongbaoBorrowSettingExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_hongbao_borrow_setting.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbHongbaoBorrowSetting selectByPrimaryKey(Integer id) {
        TbHongbaoBorrowSetting key = new TbHongbaoBorrowSetting();
        key.setId(id);
        TbHongbaoBorrowSetting record = (TbHongbaoBorrowSetting) getSqlMapClientTemplate().queryForObject("tb_hongbao_borrow_setting.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbHongbaoBorrowSetting record, TbHongbaoBorrowSettingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_hongbao_borrow_setting.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbHongbaoBorrowSetting record, TbHongbaoBorrowSettingExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_hongbao_borrow_setting.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbHongbaoBorrowSetting record) {
        int rows = getSqlMapClientTemplate().update("tb_hongbao_borrow_setting.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbHongbaoBorrowSetting record) {
        int rows = getSqlMapClientTemplate().update("tb_hongbao_borrow_setting.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbHongbaoBorrowSettingExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbHongbaoBorrowSettingExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}