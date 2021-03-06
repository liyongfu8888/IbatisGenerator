package com.tomcat.dao;

import com.tomcat.model.TbAuthAssignment;
import com.tomcat.model.TbAuthAssignmentExample;
import com.tomcat.model.TbAuthAssignmentKey;
import java.util.List;

public interface TbAuthAssignmentDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int countByExample(TbAuthAssignmentExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByExample(TbAuthAssignmentExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int deleteByPrimaryKey(TbAuthAssignmentKey key);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insert(TbAuthAssignment record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    void insertSelective(TbAuthAssignment record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    List selectByExample(TbAuthAssignmentExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    TbAuthAssignment selectByPrimaryKey(TbAuthAssignmentKey key);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExampleSelective(TbAuthAssignment record, TbAuthAssignmentExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByExample(TbAuthAssignment record, TbAuthAssignmentExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKeySelective(TbAuthAssignment record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_auth_assignment
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    int updateByPrimaryKey(TbAuthAssignment record);
}