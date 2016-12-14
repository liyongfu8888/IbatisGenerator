package com.tomcat.dao;

import com.tomcat.model.TbBorrowTender;
import com.tomcat.model.TbBorrowTenderExample;
import java.util.List;

public interface TbBorrowTenderDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int countByExample(TbBorrowTenderExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByExample(TbBorrowTenderExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insert(TbBorrowTender record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insertSelective(TbBorrowTender record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExample(TbBorrowTenderExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    TbBorrowTender selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleSelective(TbBorrowTender record, TbBorrowTenderExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExample(TbBorrowTender record, TbBorrowTenderExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeySelective(TbBorrowTender record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_borrow_tender
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKey(TbBorrowTender record);
}