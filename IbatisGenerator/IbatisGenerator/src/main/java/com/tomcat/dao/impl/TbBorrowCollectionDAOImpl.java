package com.tomcat.dao.impl;

import com.tomcat.dao.TbBorrowCollectionDAO;
import com.tomcat.model.TbBorrowCollection;
import com.tomcat.model.TbBorrowCollectionExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbBorrowCollectionDAOImpl extends SqlMapClientDaoSupport implements TbBorrowCollectionDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbBorrowCollectionDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbBorrowCollectionExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_borrow_collection.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbBorrowCollectionExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_borrow_collection.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbBorrowCollection key = new TbBorrowCollection();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_borrow_collection.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbBorrowCollection record) {
        getSqlMapClientTemplate().insert("tb_borrow_collection.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbBorrowCollection record) {
        getSqlMapClientTemplate().insert("tb_borrow_collection.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbBorrowCollectionExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_borrow_collection.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbBorrowCollection selectByPrimaryKey(Integer id) {
        TbBorrowCollection key = new TbBorrowCollection();
        key.setId(id);
        TbBorrowCollection record = (TbBorrowCollection) getSqlMapClientTemplate().queryForObject("tb_borrow_collection.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbBorrowCollection record, TbBorrowCollectionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_borrow_collection.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbBorrowCollection record, TbBorrowCollectionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_borrow_collection.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbBorrowCollection record) {
        int rows = getSqlMapClientTemplate().update("tb_borrow_collection.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbBorrowCollection record) {
        int rows = getSqlMapClientTemplate().update("tb_borrow_collection.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_borrow_collection
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbBorrowCollectionExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbBorrowCollectionExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}