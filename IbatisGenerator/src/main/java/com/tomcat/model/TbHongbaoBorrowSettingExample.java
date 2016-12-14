package com.tomcat.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TbHongbaoBorrowSettingExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbHongbaoBorrowSettingExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected TbHongbaoBorrowSettingExample(TbHongbaoBorrowSettingExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
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
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_hongbao_borrow_setting
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_hongbao_borrow_setting
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

        public Criteria andBorrowTypeIsNull() {
            addCriterion("borrow_type is null");
            return this;
        }

        public Criteria andBorrowTypeIsNotNull() {
            addCriterion("borrow_type is not null");
            return this;
        }

        public Criteria andBorrowTypeEqualTo(Integer value) {
            addCriterion("borrow_type =", value, "borrowType");
            return this;
        }

        public Criteria andBorrowTypeNotEqualTo(Integer value) {
            addCriterion("borrow_type <>", value, "borrowType");
            return this;
        }

        public Criteria andBorrowTypeGreaterThan(Integer value) {
            addCriterion("borrow_type >", value, "borrowType");
            return this;
        }

        public Criteria andBorrowTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_type >=", value, "borrowType");
            return this;
        }

        public Criteria andBorrowTypeLessThan(Integer value) {
            addCriterion("borrow_type <", value, "borrowType");
            return this;
        }

        public Criteria andBorrowTypeLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_type <=", value, "borrowType");
            return this;
        }

        public Criteria andBorrowTypeIn(List values) {
            addCriterion("borrow_type in", values, "borrowType");
            return this;
        }

        public Criteria andBorrowTypeNotIn(List values) {
            addCriterion("borrow_type not in", values, "borrowType");
            return this;
        }

        public Criteria andBorrowTypeBetween(Integer value1, Integer value2) {
            addCriterion("borrow_type between", value1, value2, "borrowType");
            return this;
        }

        public Criteria andBorrowTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_type not between", value1, value2, "borrowType");
            return this;
        }

        public Criteria andHongbaoSettingIdIsNull() {
            addCriterion("hongbao_setting_id is null");
            return this;
        }

        public Criteria andHongbaoSettingIdIsNotNull() {
            addCriterion("hongbao_setting_id is not null");
            return this;
        }

        public Criteria andHongbaoSettingIdEqualTo(Integer value) {
            addCriterion("hongbao_setting_id =", value, "hongbaoSettingId");
            return this;
        }

        public Criteria andHongbaoSettingIdNotEqualTo(Integer value) {
            addCriterion("hongbao_setting_id <>", value, "hongbaoSettingId");
            return this;
        }

        public Criteria andHongbaoSettingIdGreaterThan(Integer value) {
            addCriterion("hongbao_setting_id >", value, "hongbaoSettingId");
            return this;
        }

        public Criteria andHongbaoSettingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hongbao_setting_id >=", value, "hongbaoSettingId");
            return this;
        }

        public Criteria andHongbaoSettingIdLessThan(Integer value) {
            addCriterion("hongbao_setting_id <", value, "hongbaoSettingId");
            return this;
        }

        public Criteria andHongbaoSettingIdLessThanOrEqualTo(Integer value) {
            addCriterion("hongbao_setting_id <=", value, "hongbaoSettingId");
            return this;
        }

        public Criteria andHongbaoSettingIdIn(List values) {
            addCriterion("hongbao_setting_id in", values, "hongbaoSettingId");
            return this;
        }

        public Criteria andHongbaoSettingIdNotIn(List values) {
            addCriterion("hongbao_setting_id not in", values, "hongbaoSettingId");
            return this;
        }

        public Criteria andHongbaoSettingIdBetween(Integer value1, Integer value2) {
            addCriterion("hongbao_setting_id between", value1, value2, "hongbaoSettingId");
            return this;
        }

        public Criteria andHongbaoSettingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hongbao_setting_id not between", value1, value2, "hongbaoSettingId");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
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

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return this;
        }
    }
}