package com.tomcat.dao.impl;

import com.tomcat.dao.TbUserSigninDAO;
import com.tomcat.model.TbUserSignin;
import com.tomcat.model.TbUserSigninExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbUserSigninDAOImpl extends SqlMapClientDaoSupport implements TbUserSigninDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbUserSigninDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbUserSigninExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_user_signin.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbUserSigninExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_user_signin.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbUserSignin key = new TbUserSignin();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_user_signin.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbUserSignin record) {
        getSqlMapClientTemplate().insert("tb_user_signin.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbUserSignin record) {
        getSqlMapClientTemplate().insert("tb_user_signin.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbUserSigninExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_user_signin.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbUserSignin selectByPrimaryKey(Integer id) {
        TbUserSignin key = new TbUserSignin();
        key.setId(id);
        TbUserSignin record = (TbUserSignin) getSqlMapClientTemplate().queryForObject("tb_user_signin.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbUserSignin record, TbUserSigninExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_user_signin.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbUserSignin record, TbUserSigninExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_user_signin.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbUserSignin record) {
        int rows = getSqlMapClientTemplate().update("tb_user_signin.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbUserSignin record) {
        int rows = getSqlMapClientTemplate().update("tb_user_signin.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_user_signin
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbUserSigninExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbUserSigninExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}