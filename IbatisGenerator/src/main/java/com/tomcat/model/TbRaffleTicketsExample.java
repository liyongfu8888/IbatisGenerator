package com.tomcat.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TbRaffleTicketsExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbRaffleTicketsExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected TbRaffleTicketsExample(TbRaffleTicketsExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_raffle_tickets
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return this;
        }

        public Criteria andNumberIn(List values) {
            addCriterion("number in", values, "number");
            return this;
        }

        public Criteria andNumberNotIn(List values) {
            addCriterion("number not in", values, "number");
            return this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List values) {
            addCriterion("user_id in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List values) {
            addCriterion("user_id not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return this;
        }

        public Criteria andStatusIn(List values) {
            addCriterion("status in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List values) {
            addCriterion("status not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List values) {
            addCriterion("remark in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List values) {
            addCriterion("remark not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return this;
        }

        public Criteria andCreateTimeIn(List values) {
            addCriterion("create_time in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotIn(List values) {
            addCriterion("create_time not in", values, "createTime");
            return this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return this;
        }

        public Criteria andExpiredTimeIsNull() {
            addCriterion("expired_time is null");
            return this;
        }

        public Criteria andExpiredTimeIsNotNull() {
            addCriterion("expired_time is not null");
            return this;
        }

        public Criteria andExpiredTimeEqualTo(Integer value) {
            addCriterion("expired_time =", value, "expiredTime");
            return this;
        }

        public Criteria andExpiredTimeNotEqualTo(Integer value) {
            addCriterion("expired_time <>", value, "expiredTime");
            return this;
        }

        public Criteria andExpiredTimeGreaterThan(Integer value) {
            addCriterion("expired_time >", value, "expiredTime");
            return this;
        }

        public Criteria andExpiredTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("expired_time >=", value, "expiredTime");
            return this;
        }

        public Criteria andExpiredTimeLessThan(Integer value) {
            addCriterion("expired_time <", value, "expiredTime");
            return this;
        }

        public Criteria andExpiredTimeLessThanOrEqualTo(Integer value) {
            addCriterion("expired_time <=", value, "expiredTime");
            return this;
        }

        public Criteria andExpiredTimeIn(List values) {
            addCriterion("expired_time in", values, "expiredTime");
            return this;
        }

        public Criteria andExpiredTimeNotIn(List values) {
            addCriterion("expired_time not in", values, "expiredTime");
            return this;
        }

        public Criteria andExpiredTimeBetween(Integer value1, Integer value2) {
            addCriterion("expired_time between", value1, value2, "expiredTime");
            return this;
        }

        public Criteria andExpiredTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("expired_time not between", value1, value2, "expiredTime");
            return this;
        }

        public Criteria andUseTimeIsNull() {
            addCriterion("use_time is null");
            return this;
        }

        public Criteria andUseTimeIsNotNull() {
            addCriterion("use_time is not null");
            return this;
        }

        public Criteria andUseTimeEqualTo(Integer value) {
            addCriterion("use_time =", value, "useTime");
            return this;
        }

        public Criteria andUseTimeNotEqualTo(Integer value) {
            addCriterion("use_time <>", value, "useTime");
            return this;
        }

        public Criteria andUseTimeGreaterThan(Integer value) {
            addCriterion("use_time >", value, "useTime");
            return this;
        }

        public Criteria andUseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_time >=", value, "useTime");
            return this;
        }

        public Criteria andUseTimeLessThan(Integer value) {
            addCriterion("use_time <", value, "useTime");
            return this;
        }

        public Criteria andUseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("use_time <=", value, "useTime");
            return this;
        }

        public Criteria andUseTimeIn(List values) {
            addCriterion("use_time in", values, "useTime");
            return this;
        }

        public Criteria andUseTimeNotIn(List values) {
            addCriterion("use_time not in", values, "useTime");
            return this;
        }

        public Criteria andUseTimeBetween(Integer value1, Integer value2) {
            addCriterion("use_time between", value1, value2, "useTime");
            return this;
        }

        public Criteria andUseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("use_time not between", value1, value2, "useTime");
            return this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeIn(List values) {
            addCriterion("update_time in", values, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotIn(List values) {
            addCriterion("update_time not in", values, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return this;
        }
    }
}