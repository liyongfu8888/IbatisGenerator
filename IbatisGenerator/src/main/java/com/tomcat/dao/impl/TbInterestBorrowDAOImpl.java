package com.tomcat.dao.impl;

import com.tomcat.dao.TbInterestBorrowDAO;
import com.tomcat.model.TbInterestBorrow;
import com.tomcat.model.TbInterestBorrowExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbInterestBorrowDAOImpl extends SqlMapClientDaoSupport implements TbInterestBorrowDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbInterestBorrowDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbInterestBorrowExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_interest_borrow.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbInterestBorrowExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_interest_borrow.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbInterestBorrow key = new TbInterestBorrow();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_interest_borrow.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbInterestBorrow record) {
        getSqlMapClientTemplate().insert("tb_interest_borrow.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbInterestBorrow record) {
        getSqlMapClientTemplate().insert("tb_interest_borrow.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbInterestBorrowExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_interest_borrow.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbInterestBorrow selectByPrimaryKey(Integer id) {
        TbInterestBorrow key = new TbInterestBorrow();
        key.setId(id);
        TbInterestBorrow record = (TbInterestBorrow) getSqlMapClientTemplate().queryForObject("tb_interest_borrow.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbInterestBorrow record, TbInterestBorrowExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_interest_borrow.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbInterestBorrow record, TbInterestBorrowExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_interest_borrow.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbInterestBorrow record) {
        int rows = getSqlMapClientTemplate().update("tb_interest_borrow.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbInterestBorrow record) {
        int rows = getSqlMapClientTemplate().update("tb_interest_borrow.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_interest_borrow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbInterestBorrowExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbInterestBorrowExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}