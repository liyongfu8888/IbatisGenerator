package com.tomcat.dao.impl;

import com.tomcat.dao.TbHongbaoDAO;
import com.tomcat.model.TbHongbao;
import com.tomcat.model.TbHongbaoExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbHongbaoDAOImpl extends SqlMapClientDaoSupport implements TbHongbaoDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbHongbaoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbHongbaoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_hongbao.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbHongbaoExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_hongbao.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbHongbao key = new TbHongbao();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_hongbao.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbHongbao record) {
        getSqlMapClientTemplate().insert("tb_hongbao.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbHongbao record) {
        getSqlMapClientTemplate().insert("tb_hongbao.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbHongbaoExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_hongbao.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbHongbao selectByPrimaryKey(Integer id) {
        TbHongbao key = new TbHongbao();
        key.setId(id);
        TbHongbao record = (TbHongbao) getSqlMapClientTemplate().queryForObject("tb_hongbao.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbHongbao record, TbHongbaoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_hongbao.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbHongbao record, TbHongbaoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_hongbao.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbHongbao record) {
        int rows = getSqlMapClientTemplate().update("tb_hongbao.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbHongbao record) {
        int rows = getSqlMapClientTemplate().update("tb_hongbao.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_hongbao
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbHongbaoExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbHongbaoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}