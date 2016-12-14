package com.tomcat.dao;

import com.tomcat.model.TbAuthItemChild;
import com.tomcat.model.TbAuthItemChildExample;
import java.util.List;

public interface TbAuthItemChildDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int countByExample(TbAuthItemChildExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByExample(TbAuthItemChildExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insert(TbAuthItemChild record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insertSelective(TbAuthItemChild record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExample(TbAuthItemChildExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    TbAuthItemChild selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleSelective(TbAuthItemChild record, TbAuthItemChildExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExample(TbAuthItemChild record, TbAuthItemChildExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeySelective(TbAuthItemChild record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_item_child
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKey(TbAuthItemChild record);
}