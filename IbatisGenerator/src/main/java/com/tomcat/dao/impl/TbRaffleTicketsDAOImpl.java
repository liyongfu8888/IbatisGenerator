package com.tomcat.dao.impl;

import com.tomcat.dao.TbRaffleTicketsDAO;
import com.tomcat.model.TbRaffleTickets;
import com.tomcat.model.TbRaffleTicketsExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TbRaffleTicketsDAOImpl extends SqlMapClientDaoSupport implements TbRaffleTicketsDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbRaffleTicketsDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int countByExample(TbRaffleTicketsExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_raffle_tickets.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByExample(TbRaffleTicketsExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_raffle_tickets.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        TbRaffleTickets key = new TbRaffleTickets();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_raffle_tickets.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insert(TbRaffleTickets record) {
        getSqlMapClientTemplate().insert("tb_raffle_tickets.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void insertSelective(TbRaffleTickets record) {
        getSqlMapClientTemplate().insert("tb_raffle_tickets.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List selectByExample(TbRaffleTicketsExample example) {
        List list = getSqlMapClientTemplate().queryForList("tb_raffle_tickets.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbRaffleTickets selectByPrimaryKey(Integer id) {
        TbRaffleTickets key = new TbRaffleTickets();
        key.setId(id);
        TbRaffleTickets record = (TbRaffleTickets) getSqlMapClientTemplate().queryForObject("tb_raffle_tickets.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExampleSelective(TbRaffleTickets record, TbRaffleTicketsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_raffle_tickets.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByExample(TbRaffleTickets record, TbRaffleTicketsExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_raffle_tickets.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKeySelective(TbRaffleTickets record) {
        int rows = getSqlMapClientTemplate().update("tb_raffle_tickets.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public int updateByPrimaryKey(TbRaffleTickets record) {
        int rows = getSqlMapClientTemplate().update("tb_raffle_tickets.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    private static class UpdateByExampleParms extends TbRaffleTicketsExample {
        private Object record;

        public UpdateByExampleParms(Object record, TbRaffleTicketsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}