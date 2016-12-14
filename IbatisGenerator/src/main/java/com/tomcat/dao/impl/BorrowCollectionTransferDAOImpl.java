package com.tomcat.dao.impl;

import com.tomcat.dao.BorrowCollectionTransferDAO;
import com.tomcat.model.BorrowCollectionTransfer;
import com.tomcat.model.BorrowCollectionTransferExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class BorrowCollectionTransferDAOImpl extends SqlMapClientDaoSupport implements BorrowCollectionTransferDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public BorrowCollectionTransferDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(BorrowCollectionTransferExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("borrow_collection_transfer.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(BorrowCollectionTransferExample example) {
        int rows = getSqlMapClientTemplate().delete("borrow_collection_transfer.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        BorrowCollectionTransfer key = new BorrowCollectionTransfer();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("borrow_collection_transfer.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(BorrowCollectionTransfer record) {
        getSqlMapClientTemplate().insert("borrow_collection_transfer.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(BorrowCollectionTransfer record) {
        getSqlMapClientTemplate().insert("borrow_collection_transfer.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(BorrowCollectionTransferExample example) {
        List list = getSqlMapClientTemplate().queryForList("borrow_collection_transfer.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public BorrowCollectionTransfer selectByPrimaryKey(Integer id) {
        BorrowCollectionTransfer key = new BorrowCollectionTransfer();
        key.setId(id);
        BorrowCollectionTransfer record = (BorrowCollectionTransfer) getSqlMapClientTemplate().queryForObject("borrow_collection_transfer.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(BorrowCollectionTransfer record, BorrowCollectionTransferExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("borrow_collection_transfer.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(BorrowCollectionTransfer record, BorrowCollectionTransferExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("borrow_collection_transfer.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(BorrowCollectionTransfer record) {
        int rows = getSqlMapClientTemplate().update("borrow_collection_transfer.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(BorrowCollectionTransfer record) {
        int rows = getSqlMapClientTemplate().update("borrow_collection_transfer.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table borrow_collection_transfer
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends BorrowCollectionTransferExample {
        private Object record;

        public UpdateByExampleParms(Object record, BorrowCollectionTransferExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}