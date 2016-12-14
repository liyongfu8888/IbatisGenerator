package com.tomcat.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TbInterestExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbInterestExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected TbInterestExample(TbInterestExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest
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
     * This method corresponds to the database table tb_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_interest
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_interest
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
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

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
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

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
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

        public Criteria andInterestRatioIsNull() {
            addCriterion("interest_ratio is null");
            return this;
        }

        public Criteria andInterestRatioIsNotNull() {
            addCriterion("interest_ratio is not null");
            return this;
        }

        public Criteria andInterestRatioEqualTo(BigDecimal value) {
            addCriterion("interest_ratio =", value, "interestRatio");
            return this;
        }

        public Criteria andInterestRatioNotEqualTo(BigDecimal value) {
            addCriterion("interest_ratio <>", value, "interestRatio");
            return this;
        }

        public Criteria andInterestRatioGreaterThan(BigDecimal value) {
            addCriterion("interest_ratio >", value, "interestRatio");
            return this;
        }

        public Criteria andInterestRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_ratio >=", value, "interestRatio");
            return this;
        }

        public Criteria andInterestRatioLessThan(BigDecimal value) {
            addCriterion("interest_ratio <", value, "interestRatio");
            return this;
        }

        public Criteria andInterestRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_ratio <=", value, "interestRatio");
            return this;
        }

        public Criteria andInterestRatioIn(List values) {
            addCriterion("interest_ratio in", values, "interestRatio");
            return this;
        }

        public Criteria andInterestRatioNotIn(List values) {
            addCriterion("interest_ratio not in", values, "interestRatio");
            return this;
        }

        public Criteria andInterestRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_ratio between", value1, value2, "interestRatio");
            return this;
        }

        public Criteria andInterestRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_ratio not between", value1, value2, "interestRatio");
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

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return this;
        }

        public Criteria andCreatedTimeEqualTo(Integer value) {
            addCriterion("created_time =", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeNotEqualTo(Integer value) {
            addCriterion("created_time <>", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeGreaterThan(Integer value) {
            addCriterion("created_time >", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_time >=", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeLessThan(Integer value) {
            addCriterion("created_time <", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("created_time <=", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeIn(List values) {
            addCriterion("created_time in", values, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeNotIn(List values) {
            addCriterion("created_time not in", values, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeBetween(Integer value1, Integer value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
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

        public Criteria andLoanTimeIsNull() {
            addCriterion("loan_time is null");
            return this;
        }

        public Criteria andLoanTimeIsNotNull() {
            addCriterion("loan_time is not null");
            return this;
        }

        public Criteria andLoanTimeEqualTo(Integer value) {
            addCriterion("loan_time =", value, "loanTime");
            return this;
        }

        public Criteria andLoanTimeNotEqualTo(Integer value) {
            addCriterion("loan_time <>", value, "loanTime");
            return this;
        }

        public Criteria andLoanTimeGreaterThan(Integer value) {
            addCriterion("loan_time >", value, "loanTime");
            return this;
        }

        public Criteria andLoanTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_time >=", value, "loanTime");
            return this;
        }

        public Criteria andLoanTimeLessThan(Integer value) {
            addCriterion("loan_time <", value, "loanTime");
            return this;
        }

        public Criteria andLoanTimeLessThanOrEqualTo(Integer value) {
            addCriterion("loan_time <=", value, "loanTime");
            return this;
        }

        public Criteria andLoanTimeIn(List values) {
            addCriterion("loan_time in", values, "loanTime");
            return this;
        }

        public Criteria andLoanTimeNotIn(List values) {
            addCriterion("loan_time not in", values, "loanTime");
            return this;
        }

        public Criteria andLoanTimeBetween(Integer value1, Integer value2) {
            addCriterion("loan_time between", value1, value2, "loanTime");
            return this;
        }

        public Criteria andLoanTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_time not between", value1, value2, "loanTime");
            return this;
        }

        public Criteria andUseInfoIsNull() {
            addCriterion("use_info is null");
            return this;
        }

        public Criteria andUseInfoIsNotNull() {
            addCriterion("use_info is not null");
            return this;
        }

        public Criteria andUseInfoEqualTo(String value) {
            addCriterion("use_info =", value, "useInfo");
            return this;
        }

        public Criteria andUseInfoNotEqualTo(String value) {
            addCriterion("use_info <>", value, "useInfo");
            return this;
        }

        public Criteria andUseInfoGreaterThan(String value) {
            addCriterion("use_info >", value, "useInfo");
            return this;
        }

        public Criteria andUseInfoGreaterThanOrEqualTo(String value) {
            addCriterion("use_info >=", value, "useInfo");
            return this;
        }

        public Criteria andUseInfoLessThan(String value) {
            addCriterion("use_info <", value, "useInfo");
            return this;
        }

        public Criteria andUseInfoLessThanOrEqualTo(String value) {
            addCriterion("use_info <=", value, "useInfo");
            return this;
        }

        public Criteria andUseInfoLike(String value) {
            addCriterion("use_info like", value, "useInfo");
            return this;
        }

        public Criteria andUseInfoNotLike(String value) {
            addCriterion("use_info not like", value, "useInfo");
            return this;
        }

        public Criteria andUseInfoIn(List values) {
            addCriterion("use_info in", values, "useInfo");
            return this;
        }

        public Criteria andUseInfoNotIn(List values) {
            addCriterion("use_info not in", values, "useInfo");
            return this;
        }

        public Criteria andUseInfoBetween(String value1, String value2) {
            addCriterion("use_info between", value1, value2, "useInfo");
            return this;
        }

        public Criteria andUseInfoNotBetween(String value1, String value2) {
            addCriterion("use_info not between", value1, value2, "useInfo");
            return this;
        }

        public Criteria andInterestNameIsNull() {
            addCriterion("interest_name is null");
            return this;
        }

        public Criteria andInterestNameIsNotNull() {
            addCriterion("interest_name is not null");
            return this;
        }

        public Criteria andInterestNameEqualTo(String value) {
            addCriterion("interest_name =", value, "interestName");
            return this;
        }

        public Criteria andInterestNameNotEqualTo(String value) {
            addCriterion("interest_name <>", value, "interestName");
            return this;
        }

        public Criteria andInterestNameGreaterThan(String value) {
            addCriterion("interest_name >", value, "interestName");
            return this;
        }

        public Criteria andInterestNameGreaterThanOrEqualTo(String value) {
            addCriterion("interest_name >=", value, "interestName");
            return this;
        }

        public Criteria andInterestNameLessThan(String value) {
            addCriterion("interest_name <", value, "interestName");
            return this;
        }

        public Criteria andInterestNameLessThanOrEqualTo(String value) {
            addCriterion("interest_name <=", value, "interestName");
            return this;
        }

        public Criteria andInterestNameLike(String value) {
            addCriterion("interest_name like", value, "interestName");
            return this;
        }

        public Criteria andInterestNameNotLike(String value) {
            addCriterion("interest_name not like", value, "interestName");
            return this;
        }

        public Criteria andInterestNameIn(List values) {
            addCriterion("interest_name in", values, "interestName");
            return this;
        }

        public Criteria andInterestNameNotIn(List values) {
            addCriterion("interest_name not in", values, "interestName");
            return this;
        }

        public Criteria andInterestNameBetween(String value1, String value2) {
            addCriterion("interest_name between", value1, value2, "interestName");
            return this;
        }

        public Criteria andInterestNameNotBetween(String value1, String value2) {
            addCriterion("interest_name not between", value1, value2, "interestName");
            return this;
        }

        public Criteria andBorrowIdIsNull() {
            addCriterion("borrow_id is null");
            return this;
        }

        public Criteria andBorrowIdIsNotNull() {
            addCriterion("borrow_id is not null");
            return this;
        }

        public Criteria andBorrowIdEqualTo(Integer value) {
            addCriterion("borrow_id =", value, "borrowId");
            return this;
        }

        public Criteria andBorrowIdNotEqualTo(Integer value) {
            addCriterion("borrow_id <>", value, "borrowId");
            return this;
        }

        public Criteria andBorrowIdGreaterThan(Integer value) {
            addCriterion("borrow_id >", value, "borrowId");
            return this;
        }

        public Criteria andBorrowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_id >=", value, "borrowId");
            return this;
        }

        public Criteria andBorrowIdLessThan(Integer value) {
            addCriterion("borrow_id <", value, "borrowId");
            return this;
        }

        public Criteria andBorrowIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_id <=", value, "borrowId");
            return this;
        }

        public Criteria andBorrowIdIn(List values) {
            addCriterion("borrow_id in", values, "borrowId");
            return this;
        }

        public Criteria andBorrowIdNotIn(List values) {
            addCriterion("borrow_id not in", values, "borrowId");
            return this;
        }

        public Criteria andBorrowIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_id between", value1, value2, "borrowId");
            return this;
        }

        public Criteria andBorrowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_id not between", value1, value2, "borrowId");
            return this;
        }

        public Criteria andTenderIdIsNull() {
            addCriterion("tender_id is null");
            return this;
        }

        public Criteria andTenderIdIsNotNull() {
            addCriterion("tender_id is not null");
            return this;
        }

        public Criteria andTenderIdEqualTo(Integer value) {
            addCriterion("tender_id =", value, "tenderId");
            return this;
        }

        public Criteria andTenderIdNotEqualTo(Integer value) {
            addCriterion("tender_id <>", value, "tenderId");
            return this;
        }

        public Criteria andTenderIdGreaterThan(Integer value) {
            addCriterion("tender_id >", value, "tenderId");
            return this;
        }

        public Criteria andTenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tender_id >=", value, "tenderId");
            return this;
        }

        public Criteria andTenderIdLessThan(Integer value) {
            addCriterion("tender_id <", value, "tenderId");
            return this;
        }

        public Criteria andTenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("tender_id <=", value, "tenderId");
            return this;
        }

        public Criteria andTenderIdIn(List values) {
            addCriterion("tender_id in", values, "tenderId");
            return this;
        }

        public Criteria andTenderIdNotIn(List values) {
            addCriterion("tender_id not in", values, "tenderId");
            return this;
        }

        public Criteria andTenderIdBetween(Integer value1, Integer value2) {
            addCriterion("tender_id between", value1, value2, "tenderId");
            return this;
        }

        public Criteria andTenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tender_id not between", value1, value2, "tenderId");
            return this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return this;
        }

        public Criteria andTypeIn(List values) {
            addCriterion("type in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List values) {
            addCriterion("type not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return this;
        }

        public Criteria andBorrowNameIsNull() {
            addCriterion("borrow_name is null");
            return this;
        }

        public Criteria andBorrowNameIsNotNull() {
            addCriterion("borrow_name is not null");
            return this;
        }

        public Criteria andBorrowNameEqualTo(String value) {
            addCriterion("borrow_name =", value, "borrowName");
            return this;
        }

        public Criteria andBorrowNameNotEqualTo(String value) {
            addCriterion("borrow_name <>", value, "borrowName");
            return this;
        }

        public Criteria andBorrowNameGreaterThan(String value) {
            addCriterion("borrow_name >", value, "borrowName");
            return this;
        }

        public Criteria andBorrowNameGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_name >=", value, "borrowName");
            return this;
        }

        public Criteria andBorrowNameLessThan(String value) {
            addCriterion("borrow_name <", value, "borrowName");
            return this;
        }

        public Criteria andBorrowNameLessThanOrEqualTo(String value) {
            addCriterion("borrow_name <=", value, "borrowName");
            return this;
        }

        public Criteria andBorrowNameLike(String value) {
            addCriterion("borrow_name like", value, "borrowName");
            return this;
        }

        public Criteria andBorrowNameNotLike(String value) {
            addCriterion("borrow_name not like", value, "borrowName");
            return this;
        }

        public Criteria andBorrowNameIn(List values) {
            addCriterion("borrow_name in", values, "borrowName");
            return this;
        }

        public Criteria andBorrowNameNotIn(List values) {
            addCriterion("borrow_name not in", values, "borrowName");
            return this;
        }

        public Criteria andBorrowNameBetween(String value1, String value2) {
            addCriterion("borrow_name between", value1, value2, "borrowName");
            return this;
        }

        public Criteria andBorrowNameNotBetween(String value1, String value2) {
            addCriterion("borrow_name not between", value1, value2, "borrowName");
            return this;
        }
    }
}