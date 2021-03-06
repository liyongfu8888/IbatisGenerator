package com.tomcat.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TbFundFlowExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbFundFlowExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected TbFundFlowExample(TbFundFlowExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
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
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_fund_flow
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_fund_flow
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
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

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List values) {
            addCriterion("name in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List values) {
            addCriterion("name not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return this;
        }

        public Criteria andSrcIsNull() {
            addCriterion("src is null");
            return this;
        }

        public Criteria andSrcIsNotNull() {
            addCriterion("src is not null");
            return this;
        }

        public Criteria andSrcEqualTo(Integer value) {
            addCriterion("src =", value, "src");
            return this;
        }

        public Criteria andSrcNotEqualTo(Integer value) {
            addCriterion("src <>", value, "src");
            return this;
        }

        public Criteria andSrcGreaterThan(Integer value) {
            addCriterion("src >", value, "src");
            return this;
        }

        public Criteria andSrcGreaterThanOrEqualTo(Integer value) {
            addCriterion("src >=", value, "src");
            return this;
        }

        public Criteria andSrcLessThan(Integer value) {
            addCriterion("src <", value, "src");
            return this;
        }

        public Criteria andSrcLessThanOrEqualTo(Integer value) {
            addCriterion("src <=", value, "src");
            return this;
        }

        public Criteria andSrcIn(List values) {
            addCriterion("src in", values, "src");
            return this;
        }

        public Criteria andSrcNotIn(List values) {
            addCriterion("src not in", values, "src");
            return this;
        }

        public Criteria andSrcBetween(Integer value1, Integer value2) {
            addCriterion("src between", value1, value2, "src");
            return this;
        }

        public Criteria andSrcNotBetween(Integer value1, Integer value2) {
            addCriterion("src not between", value1, value2, "src");
            return this;
        }

        public Criteria andDestIsNull() {
            addCriterion("dest is null");
            return this;
        }

        public Criteria andDestIsNotNull() {
            addCriterion("dest is not null");
            return this;
        }

        public Criteria andDestEqualTo(Integer value) {
            addCriterion("dest =", value, "dest");
            return this;
        }

        public Criteria andDestNotEqualTo(Integer value) {
            addCriterion("dest <>", value, "dest");
            return this;
        }

        public Criteria andDestGreaterThan(Integer value) {
            addCriterion("dest >", value, "dest");
            return this;
        }

        public Criteria andDestGreaterThanOrEqualTo(Integer value) {
            addCriterion("dest >=", value, "dest");
            return this;
        }

        public Criteria andDestLessThan(Integer value) {
            addCriterion("dest <", value, "dest");
            return this;
        }

        public Criteria andDestLessThanOrEqualTo(Integer value) {
            addCriterion("dest <=", value, "dest");
            return this;
        }

        public Criteria andDestIn(List values) {
            addCriterion("dest in", values, "dest");
            return this;
        }

        public Criteria andDestNotIn(List values) {
            addCriterion("dest not in", values, "dest");
            return this;
        }

        public Criteria andDestBetween(Integer value1, Integer value2) {
            addCriterion("dest between", value1, value2, "dest");
            return this;
        }

        public Criteria andDestNotBetween(Integer value1, Integer value2) {
            addCriterion("dest not between", value1, value2, "dest");
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

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("created_by =", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("created_by >", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("created_by <", value, "createdBy");
            return this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "createdBy");
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

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
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

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return this;
        }

        public Criteria andUpdatedAtEqualTo(Integer value) {
            addCriterion("updated_at =", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtNotEqualTo(Integer value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtGreaterThan(Integer value) {
            addCriterion("updated_at >", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtLessThan(Integer value) {
            addCriterion("updated_at <", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtIn(List values) {
            addCriterion("updated_at in", values, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtNotIn(List values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtBetween(Integer value1, Integer value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return this;
        }
    }
}