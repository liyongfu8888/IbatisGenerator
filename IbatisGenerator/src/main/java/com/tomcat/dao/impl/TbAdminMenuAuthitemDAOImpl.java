package com.tomcat.dao.impl;

import com.tomcat.dao.TbAdminMenuAuthitemDAO;
import com.tomcat.model.TbAdminMenuAuthitem;
import com.tomcat.model.TbAdminMenuAuthitemExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbAdminMenuAuthitemDAOImpl extends SqlMapClientDaoSupport implements TbAdminMenuAuthitemDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu_authitem
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbAdminMenuAuthitemDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu_authitem
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbAdminMenuAuthitemExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_admin_menu_authitem.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu_authitem
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbAdminMenuAuthitemExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_admin_menu_authitem.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu_authitem
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbAdminMenuAuthitem record) {
        getSqlMapClientTemplate().insert("tb_admin_menu_authitem.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu_authitem
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbAdminMenuAuthitem record) {
        getSqlMapClientTemplate().insert("tb_admin_menu_authitem.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu_authitem
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbAdminMenuAuthitemExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_admin_menu_authitem.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu_authitem
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbAdminMenuAuthitem record, TbAdminMenuAuthitemExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_admin_menu_authitem.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_admin_menu_authitem
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbAdminMenuAuthitem record, TbAdminMenuAuthitemExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_admin_menu_authitem.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_admin_menu_authitem
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbAdminMenuAuthitemExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbAdminMenuAuthitemExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}