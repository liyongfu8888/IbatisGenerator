package com.tomcat.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TbCreditExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_credit
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_credit
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbCreditExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected TbCreditExample(TbCreditExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit
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
     * This method corresponds to the database table tb_credit
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_credit
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_credit
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

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return this;
        }

        public Criteria andValueEqualTo(Integer value) {
            addCriterion("value =", value, "value");
            return this;
        }

        public Criteria andValueNotEqualTo(Integer value) {
            addCriterion("value <>", value, "value");
            return this;
        }

        public Criteria andValueGreaterThan(Integer value) {
            addCriterion("value >", value, "value");
            return this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("value >=", value, "value");
            return this;
        }

        public Criteria andValueLessThan(Integer value) {
            addCriterion("value <", value, "value");
            return this;
        }

        public Criteria andValueLessThanOrEqualTo(Integer value) {
            addCriterion("value <=", value, "value");
            return this;
        }

        public Criteria andValueIn(List values) {
            addCriterion("value in", values, "value");
            return this;
        }

        public Criteria andValueNotIn(List values) {
            addCriterion("value not in", values, "value");
            return this;
        }

        public Criteria andValueBetween(Integer value1, Integer value2) {
            addCriterion("value between", value1, value2, "value");
            return this;
        }

        public Criteria andValueNotBetween(Integer value1, Integer value2) {
            addCriterion("value not between", value1, value2, "value");
            return this;
        }

        public Criteria andOpUserIsNull() {
            addCriterion("op_user is null");
            return this;
        }

        public Criteria andOpUserIsNotNull() {
            addCriterion("op_user is not null");
            return this;
        }

        public Criteria andOpUserEqualTo(Integer value) {
            addCriterion("op_user =", value, "opUser");
            return this;
        }

        public Criteria andOpUserNotEqualTo(Integer value) {
            addCriterion("op_user <>", value, "opUser");
            return this;
        }

        public Criteria andOpUserGreaterThan(Integer value) {
            addCriterion("op_user >", value, "opUser");
            return this;
        }

        public Criteria andOpUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_user >=", value, "opUser");
            return this;
        }

        public Criteria andOpUserLessThan(Integer value) {
            addCriterion("op_user <", value, "opUser");
            return this;
        }

        public Criteria andOpUserLessThanOrEqualTo(Integer value) {
            addCriterion("op_user <=", value, "opUser");
            return this;
        }

        public Criteria andOpUserIn(List values) {
            addCriterion("op_user in", values, "opUser");
            return this;
        }

        public Criteria andOpUserNotIn(List values) {
            addCriterion("op_user not in", values, "opUser");
            return this;
        }

        public Criteria andOpUserBetween(Integer value1, Integer value2) {
            addCriterion("op_user between", value1, value2, "opUser");
            return this;
        }

        public Criteria andOpUserNotBetween(Integer value1, Integer value2) {
            addCriterion("op_user not between", value1, value2, "opUser");
            return this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return this;
        }

        public Criteria andCreatedAtEqualTo(Integer value) {
            addCriterion("created_at =", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtNotEqualTo(Integer value) {
            addCriterion("created_at <>", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtGreaterThan(Integer value) {
            addCriterion("created_at >", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_at >=", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtLessThan(Integer value) {
            addCriterion("created_at <", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("created_at <=", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtIn(List values) {
            addCriterion("created_at in", values, "createdAt");
            return this;
        }

        public Criteria andCreatedAtNotIn(List values) {
            addCriterion("created_at not in", values, "createdAt");
            return this;
        }

        public Criteria andCreatedAtBetween(Integer value1, Integer value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return this;
        }

        public Criteria andCreatedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByIn(List values) {
            addCriterion("created_by in", values, "createdBy");
            return this;
        }

        public Criteria andCreatedByNotIn(List values) {
            addCriterion("created_by not in", values, "createdBy");
            return this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return this;
        }

        public Criteria andUpdateAtEqualTo(Integer value) {
            addCriterion("update_at =", value, "updateAt");
            return this;
        }

        public Criteria andUpdateAtNotEqualTo(Integer value) {
            addCriterion("update_at <>", value, "updateAt");
            return this;
        }

        public Criteria andUpdateAtGreaterThan(Integer value) {
            addCriterion("update_at >", value, "updateAt");
            return this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_at >=", value, "updateAt");
            return this;
        }

        public Criteria andUpdateAtLessThan(Integer value) {
            addCriterion("update_at <", value, "updateAt");
            return this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Integer value) {
            addCriterion("update_at <=", value, "updateAt");
            return this;
        }

        public Criteria andUpdateAtIn(List values) {
            addCriterion("update_at in", values, "updateAt");
            return this;
        }

        public Criteria andUpdateAtNotIn(List values) {
            addCriterion("update_at not in", values, "updateAt");
            return this;
        }

        public Criteria andUpdateAtBetween(Integer value1, Integer value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return this;
        }

        public Criteria andUpdateAtNotBetween(Integer value1, Integer value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return this;
        }

        public Criteria andUpdateByIn(List values) {
            addCriterion("update_by in", values, "updateBy");
            return this;
        }

        public Criteria andUpdateByNotIn(List values) {
            addCriterion("update_by not in", values, "updateBy");
            return this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return this;
        }
    }
}