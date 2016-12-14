package com.tomcat.dao.impl;

import com.tomcat.dao.TbLotteryDAO;
import com.tomcat.model.TbLottery;
import com.tomcat.model.TbLotteryExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbLotteryDAOImpl extends SqlMapClientDaoSupport implements TbLotteryDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbLotteryDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbLotteryExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_lottery.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbLotteryExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_lottery.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbLottery key = new TbLottery();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_lottery.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbLottery record) {
        getSqlMapClientTemplate().insert("tb_lottery.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbLottery record) {
        getSqlMapClientTemplate().insert("tb_lottery.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbLotteryExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_lottery.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbLottery selectByPrimaryKey(Integer id) {
        TbLottery key = new TbLottery();
        key.setId(id);
        TbLottery record = (TbLottery) getSqlMapClientTemplate().queryForObject("tb_lottery.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbLottery record, TbLotteryExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_lottery.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbLottery record, TbLotteryExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_lottery.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbLottery record) {
        int rows = getSqlMapClientTemplate().update("tb_lottery.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbLottery record) {
        int rows = getSqlMapClientTemplate().update("tb_lottery.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_lottery
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbLotteryExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbLotteryExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}