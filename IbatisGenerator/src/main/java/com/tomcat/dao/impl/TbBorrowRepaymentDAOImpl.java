package com.tomcat.dao.impl;

import com.tomcat.dao.TbBorrowRepaymentDAO;
import com.tomcat.model.TbBorrowRepayment;
import com.tomcat.model.TbBorrowRepaymentExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbBorrowRepaymentDAOImpl extends SqlMapClientDaoSupport implements TbBorrowRepaymentDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbBorrowRepaymentDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbBorrowRepaymentExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_borrow_repayment.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbBorrowRepaymentExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_borrow_repayment.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbBorrowRepayment key = new TbBorrowRepayment();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_borrow_repayment.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbBorrowRepayment record) {
        getSqlMapClientTemplate().insert("tb_borrow_repayment.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbBorrowRepayment record) {
        getSqlMapClientTemplate().insert("tb_borrow_repayment.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbBorrowRepaymentExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_borrow_repayment.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbBorrowRepayment selectByPrimaryKey(Integer id) {
        TbBorrowRepayment key = new TbBorrowRepayment();
        key.setId(id);
        TbBorrowRepayment record = (TbBorrowRepayment) getSqlMapClientTemplate().queryForObject("tb_borrow_repayment.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbBorrowRepayment record, TbBorrowRepaymentExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_borrow_repayment.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbBorrowRepayment record, TbBorrowRepaymentExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_borrow_repayment.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbBorrowRepayment record) {
        int rows = getSqlMapClientTemplate().update("tb_borrow_repayment.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbBorrowRepayment record) {
        int rows = getSqlMapClientTemplate().update("tb_borrow_repayment.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_borrow_repayment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbBorrowRepaymentExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbBorrowRepaymentExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}