package com.tomcat.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TbUserAccountExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_user_account
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table tb_user_account
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public TbUserAccountExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected TbUserAccountExample(TbUserAccountExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account
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
     * This method corresponds to the database table tb_user_account
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tb_user_account
     *
     * @ibatorgenerated Fri Dec 09 14:23:08 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table tb_user_account
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

        public Criteria andMoneyTotalIsNull() {
            addCriterion("money_total is null");
            return this;
        }

        public Criteria andMoneyTotalIsNotNull() {
            addCriterion("money_total is not null");
            return this;
        }

        public Criteria andMoneyTotalEqualTo(BigDecimal value) {
            addCriterion("money_total =", value, "moneyTotal");
            return this;
        }

        public Criteria andMoneyTotalNotEqualTo(BigDecimal value) {
            addCriterion("money_total <>", value, "moneyTotal");
            return this;
        }

        public Criteria andMoneyTotalGreaterThan(BigDecimal value) {
            addCriterion("money_total >", value, "moneyTotal");
            return this;
        }

        public Criteria andMoneyTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_total >=", value, "moneyTotal");
            return this;
        }

        public Criteria andMoneyTotalLessThan(BigDecimal value) {
            addCriterion("money_total <", value, "moneyTotal");
            return this;
        }

        public Criteria andMoneyTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_total <=", value, "moneyTotal");
            return this;
        }

        public Criteria andMoneyTotalIn(List values) {
            addCriterion("money_total in", values, "moneyTotal");
            return this;
        }

        public Criteria andMoneyTotalNotIn(List values) {
            addCriterion("money_total not in", values, "moneyTotal");
            return this;
        }

        public Criteria andMoneyTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_total between", value1, value2, "moneyTotal");
            return this;
        }

        public Criteria andMoneyTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_total not between", value1, value2, "moneyTotal");
            return this;
        }

        public Criteria andMoneyUsableIsNull() {
            addCriterion("money_usable is null");
            return this;
        }

        public Criteria andMoneyUsableIsNotNull() {
            addCriterion("money_usable is not null");
            return this;
        }

        public Criteria andMoneyUsableEqualTo(BigDecimal value) {
            addCriterion("money_usable =", value, "moneyUsable");
            return this;
        }

        public Criteria andMoneyUsableNotEqualTo(BigDecimal value) {
            addCriterion("money_usable <>", value, "moneyUsable");
            return this;
        }

        public Criteria andMoneyUsableGreaterThan(BigDecimal value) {
            addCriterion("money_usable >", value, "moneyUsable");
            return this;
        }

        public Criteria andMoneyUsableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_usable >=", value, "moneyUsable");
            return this;
        }

        public Criteria andMoneyUsableLessThan(BigDecimal value) {
            addCriterion("money_usable <", value, "moneyUsable");
            return this;
        }

        public Criteria andMoneyUsableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_usable <=", value, "moneyUsable");
            return this;
        }

        public Criteria andMoneyUsableIn(List values) {
            addCriterion("money_usable in", values, "moneyUsable");
            return this;
        }

        public Criteria andMoneyUsableNotIn(List values) {
            addCriterion("money_usable not in", values, "moneyUsable");
            return this;
        }

        public Criteria andMoneyUsableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_usable between", value1, value2, "moneyUsable");
            return this;
        }

        public Criteria andMoneyUsableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_usable not between", value1, value2, "moneyUsable");
            return this;
        }

        public Criteria andMoneyTenderFreezeIsNull() {
            addCriterion("money_tender_freeze is null");
            return this;
        }

        public Criteria andMoneyTenderFreezeIsNotNull() {
            addCriterion("money_tender_freeze is not null");
            return this;
        }

        public Criteria andMoneyTenderFreezeEqualTo(BigDecimal value) {
            addCriterion("money_tender_freeze =", value, "moneyTenderFreeze");
            return this;
        }

        public Criteria andMoneyTenderFreezeNotEqualTo(BigDecimal value) {
            addCriterion("money_tender_freeze <>", value, "moneyTenderFreeze");
            return this;
        }

        public Criteria andMoneyTenderFreezeGreaterThan(BigDecimal value) {
            addCriterion("money_tender_freeze >", value, "moneyTenderFreeze");
            return this;
        }

        public Criteria andMoneyTenderFreezeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_tender_freeze >=", value, "moneyTenderFreeze");
            return this;
        }

        public Criteria andMoneyTenderFreezeLessThan(BigDecimal value) {
            addCriterion("money_tender_freeze <", value, "moneyTenderFreeze");
            return this;
        }

        public Criteria andMoneyTenderFreezeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_tender_freeze <=", value, "moneyTenderFreeze");
            return this;
        }

        public Criteria andMoneyTenderFreezeIn(List values) {
            addCriterion("money_tender_freeze in", values, "moneyTenderFreeze");
            return this;
        }

        public Criteria andMoneyTenderFreezeNotIn(List values) {
            addCriterion("money_tender_freeze not in", values, "moneyTenderFreeze");
            return this;
        }

        public Criteria andMoneyTenderFreezeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_tender_freeze between", value1, value2, "moneyTenderFreeze");
            return this;
        }

        public Criteria andMoneyTenderFreezeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_tender_freeze not between", value1, value2, "moneyTenderFreeze");
            return this;
        }

        public Criteria andMoneyCollectionIsNull() {
            addCriterion("money_collection is null");
            return this;
        }

        public Criteria andMoneyCollectionIsNotNull() {
            addCriterion("money_collection is not null");
            return this;
        }

        public Criteria andMoneyCollectionEqualTo(BigDecimal value) {
            addCriterion("money_collection =", value, "moneyCollection");
            return this;
        }

        public Criteria andMoneyCollectionNotEqualTo(BigDecimal value) {
            addCriterion("money_collection <>", value, "moneyCollection");
            return this;
        }

        public Criteria andMoneyCollectionGreaterThan(BigDecimal value) {
            addCriterion("money_collection >", value, "moneyCollection");
            return this;
        }

        public Criteria andMoneyCollectionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_collection >=", value, "moneyCollection");
            return this;
        }

        public Criteria andMoneyCollectionLessThan(BigDecimal value) {
            addCriterion("money_collection <", value, "moneyCollection");
            return this;
        }

        public Criteria andMoneyCollectionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_collection <=", value, "moneyCollection");
            return this;
        }

        public Criteria andMoneyCollectionIn(List values) {
            addCriterion("money_collection in", values, "moneyCollection");
            return this;
        }

        public Criteria andMoneyCollectionNotIn(List values) {
            addCriterion("money_collection not in", values, "moneyCollection");
            return this;
        }

        public Criteria andMoneyCollectionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_collection between", value1, value2, "moneyCollection");
            return this;
        }

        public Criteria andMoneyCollectionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_collection not between", value1, value2, "moneyCollection");
            return this;
        }

        public Criteria andProfitsTotalIsNull() {
            addCriterion("profits_total is null");
            return this;
        }

        public Criteria andProfitsTotalIsNotNull() {
            addCriterion("profits_total is not null");
            return this;
        }

        public Criteria andProfitsTotalEqualTo(BigDecimal value) {
            addCriterion("profits_total =", value, "profitsTotal");
            return this;
        }

        public Criteria andProfitsTotalNotEqualTo(BigDecimal value) {
            addCriterion("profits_total <>", value, "profitsTotal");
            return this;
        }

        public Criteria andProfitsTotalGreaterThan(BigDecimal value) {
            addCriterion("profits_total >", value, "profitsTotal");
            return this;
        }

        public Criteria andProfitsTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profits_total >=", value, "profitsTotal");
            return this;
        }

        public Criteria andProfitsTotalLessThan(BigDecimal value) {
            addCriterion("profits_total <", value, "profitsTotal");
            return this;
        }

        public Criteria andProfitsTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profits_total <=", value, "profitsTotal");
            return this;
        }

        public Criteria andProfitsTotalIn(List values) {
            addCriterion("profits_total in", values, "profitsTotal");
            return this;
        }

        public Criteria andProfitsTotalNotIn(List values) {
            addCriterion("profits_total not in", values, "profitsTotal");
            return this;
        }

        public Criteria andProfitsTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profits_total between", value1, value2, "profitsTotal");
            return this;
        }

        public Criteria andProfitsTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profits_total not between", value1, value2, "profitsTotal");
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

        public Criteria andSinaInterestAllIsNull() {
            addCriterion("sina_interest_all is null");
            return this;
        }

        public Criteria andSinaInterestAllIsNotNull() {
            addCriterion("sina_interest_all is not null");
            return this;
        }

        public Criteria andSinaInterestAllEqualTo(BigDecimal value) {
            addCriterion("sina_interest_all =", value, "sinaInterestAll");
            return this;
        }

        public Criteria andSinaInterestAllNotEqualTo(BigDecimal value) {
            addCriterion("sina_interest_all <>", value, "sinaInterestAll");
            return this;
        }

        public Criteria andSinaInterestAllGreaterThan(BigDecimal value) {
            addCriterion("sina_interest_all >", value, "sinaInterestAll");
            return this;
        }

        public Criteria andSinaInterestAllGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sina_interest_all >=", value, "sinaInterestAll");
            return this;
        }

        public Criteria andSinaInterestAllLessThan(BigDecimal value) {
            addCriterion("sina_interest_all <", value, "sinaInterestAll");
            return this;
        }

        public Criteria andSinaInterestAllLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sina_interest_all <=", value, "sinaInterestAll");
            return this;
        }

        public Criteria andSinaInterestAllIn(List values) {
            addCriterion("sina_interest_all in", values, "sinaInterestAll");
            return this;
        }

        public Criteria andSinaInterestAllNotIn(List values) {
            addCriterion("sina_interest_all not in", values, "sinaInterestAll");
            return this;
        }

        public Criteria andSinaInterestAllBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sina_interest_all between", value1, value2, "sinaInterestAll");
            return this;
        }

        public Criteria andSinaInterestAllNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sina_interest_all not between", value1, value2, "sinaInterestAll");
            return this;
        }

        public Criteria andSinaInterestLastIsNull() {
            addCriterion("sina_interest_last is null");
            return this;
        }

        public Criteria andSinaInterestLastIsNotNull() {
            addCriterion("sina_interest_last is not null");
            return this;
        }

        public Criteria andSinaInterestLastEqualTo(BigDecimal value) {
            addCriterion("sina_interest_last =", value, "sinaInterestLast");
            return this;
        }

        public Criteria andSinaInterestLastNotEqualTo(BigDecimal value) {
            addCriterion("sina_interest_last <>", value, "sinaInterestLast");
            return this;
        }

        public Criteria andSinaInterestLastGreaterThan(BigDecimal value) {
            addCriterion("sina_interest_last >", value, "sinaInterestLast");
            return this;
        }

        public Criteria andSinaInterestLastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sina_interest_last >=", value, "sinaInterestLast");
            return this;
        }

        public Criteria andSinaInterestLastLessThan(BigDecimal value) {
            addCriterion("sina_interest_last <", value, "sinaInterestLast");
            return this;
        }

        public Criteria andSinaInterestLastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sina_interest_last <=", value, "sinaInterestLast");
            return this;
        }

        public Criteria andSinaInterestLastIn(List values) {
            addCriterion("sina_interest_last in", values, "sinaInterestLast");
            return this;
        }

        public Criteria andSinaInterestLastNotIn(List values) {
            addCriterion("sina_interest_last not in", values, "sinaInterestLast");
            return this;
        }

        public Criteria andSinaInterestLastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sina_interest_last between", value1, value2, "sinaInterestLast");
            return this;
        }

        public Criteria andSinaInterestLastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sina_interest_last not between", value1, value2, "sinaInterestLast");
            return this;
        }
    }
}