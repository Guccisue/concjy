package com.ecps.seckill.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TFreightAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFreightAreaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFTempletidIsNull() {
            addCriterion("f_templetid is null");
            return (Criteria) this;
        }

        public Criteria andFTempletidIsNotNull() {
            addCriterion("f_templetid is not null");
            return (Criteria) this;
        }

        public Criteria andFTempletidEqualTo(Integer value) {
            addCriterion("f_templetid =", value, "fTempletid");
            return (Criteria) this;
        }

        public Criteria andFTempletidNotEqualTo(Integer value) {
            addCriterion("f_templetid <>", value, "fTempletid");
            return (Criteria) this;
        }

        public Criteria andFTempletidGreaterThan(Integer value) {
            addCriterion("f_templetid >", value, "fTempletid");
            return (Criteria) this;
        }

        public Criteria andFTempletidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_templetid >=", value, "fTempletid");
            return (Criteria) this;
        }

        public Criteria andFTempletidLessThan(Integer value) {
            addCriterion("f_templetid <", value, "fTempletid");
            return (Criteria) this;
        }

        public Criteria andFTempletidLessThanOrEqualTo(Integer value) {
            addCriterion("f_templetid <=", value, "fTempletid");
            return (Criteria) this;
        }

        public Criteria andFTempletidIn(List<Integer> values) {
            addCriterion("f_templetid in", values, "fTempletid");
            return (Criteria) this;
        }

        public Criteria andFTempletidNotIn(List<Integer> values) {
            addCriterion("f_templetid not in", values, "fTempletid");
            return (Criteria) this;
        }

        public Criteria andFTempletidBetween(Integer value1, Integer value2) {
            addCriterion("f_templetid between", value1, value2, "fTempletid");
            return (Criteria) this;
        }

        public Criteria andFTempletidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_templetid not between", value1, value2, "fTempletid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPIsNull() {
            addCriterion("p is null");
            return (Criteria) this;
        }

        public Criteria andPIsNotNull() {
            addCriterion("p is not null");
            return (Criteria) this;
        }

        public Criteria andPEqualTo(String value) {
            addCriterion("p =", value, "p");
            return (Criteria) this;
        }

        public Criteria andPNotEqualTo(String value) {
            addCriterion("p <>", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThan(String value) {
            addCriterion("p >", value, "p");
            return (Criteria) this;
        }

        public Criteria andPGreaterThanOrEqualTo(String value) {
            addCriterion("p >=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThan(String value) {
            addCriterion("p <", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLessThanOrEqualTo(String value) {
            addCriterion("p <=", value, "p");
            return (Criteria) this;
        }

        public Criteria andPLike(String value) {
            addCriterion("p like", value, "p");
            return (Criteria) this;
        }

        public Criteria andPNotLike(String value) {
            addCriterion("p not like", value, "p");
            return (Criteria) this;
        }

        public Criteria andPIn(List<String> values) {
            addCriterion("p in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPNotIn(List<String> values) {
            addCriterion("p not in", values, "p");
            return (Criteria) this;
        }

        public Criteria andPBetween(String value1, String value2) {
            addCriterion("p between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andPNotBetween(String value1, String value2) {
            addCriterion("p not between", value1, value2, "p");
            return (Criteria) this;
        }

        public Criteria andFirstcountIsNull() {
            addCriterion("firstcount is null");
            return (Criteria) this;
        }

        public Criteria andFirstcountIsNotNull() {
            addCriterion("firstcount is not null");
            return (Criteria) this;
        }

        public Criteria andFirstcountEqualTo(Integer value) {
            addCriterion("firstcount =", value, "firstcount");
            return (Criteria) this;
        }

        public Criteria andFirstcountNotEqualTo(Integer value) {
            addCriterion("firstcount <>", value, "firstcount");
            return (Criteria) this;
        }

        public Criteria andFirstcountGreaterThan(Integer value) {
            addCriterion("firstcount >", value, "firstcount");
            return (Criteria) this;
        }

        public Criteria andFirstcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstcount >=", value, "firstcount");
            return (Criteria) this;
        }

        public Criteria andFirstcountLessThan(Integer value) {
            addCriterion("firstcount <", value, "firstcount");
            return (Criteria) this;
        }

        public Criteria andFirstcountLessThanOrEqualTo(Integer value) {
            addCriterion("firstcount <=", value, "firstcount");
            return (Criteria) this;
        }

        public Criteria andFirstcountIn(List<Integer> values) {
            addCriterion("firstcount in", values, "firstcount");
            return (Criteria) this;
        }

        public Criteria andFirstcountNotIn(List<Integer> values) {
            addCriterion("firstcount not in", values, "firstcount");
            return (Criteria) this;
        }

        public Criteria andFirstcountBetween(Integer value1, Integer value2) {
            addCriterion("firstcount between", value1, value2, "firstcount");
            return (Criteria) this;
        }

        public Criteria andFirstcountNotBetween(Integer value1, Integer value2) {
            addCriterion("firstcount not between", value1, value2, "firstcount");
            return (Criteria) this;
        }

        public Criteria andFirstFreightIsNull() {
            addCriterion("first_freight is null");
            return (Criteria) this;
        }

        public Criteria andFirstFreightIsNotNull() {
            addCriterion("first_freight is not null");
            return (Criteria) this;
        }

        public Criteria andFirstFreightEqualTo(Double value) {
            addCriterion("first_freight =", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightNotEqualTo(Double value) {
            addCriterion("first_freight <>", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightGreaterThan(Double value) {
            addCriterion("first_freight >", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightGreaterThanOrEqualTo(Double value) {
            addCriterion("first_freight >=", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightLessThan(Double value) {
            addCriterion("first_freight <", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightLessThanOrEqualTo(Double value) {
            addCriterion("first_freight <=", value, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightIn(List<Double> values) {
            addCriterion("first_freight in", values, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightNotIn(List<Double> values) {
            addCriterion("first_freight not in", values, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightBetween(Double value1, Double value2) {
            addCriterion("first_freight between", value1, value2, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andFirstFreightNotBetween(Double value1, Double value2) {
            addCriterion("first_freight not between", value1, value2, "firstFreight");
            return (Criteria) this;
        }

        public Criteria andContinuationIsNull() {
            addCriterion("continuation is null");
            return (Criteria) this;
        }

        public Criteria andContinuationIsNotNull() {
            addCriterion("continuation is not null");
            return (Criteria) this;
        }

        public Criteria andContinuationEqualTo(Integer value) {
            addCriterion("continuation =", value, "continuation");
            return (Criteria) this;
        }

        public Criteria andContinuationNotEqualTo(Integer value) {
            addCriterion("continuation <>", value, "continuation");
            return (Criteria) this;
        }

        public Criteria andContinuationGreaterThan(Integer value) {
            addCriterion("continuation >", value, "continuation");
            return (Criteria) this;
        }

        public Criteria andContinuationGreaterThanOrEqualTo(Integer value) {
            addCriterion("continuation >=", value, "continuation");
            return (Criteria) this;
        }

        public Criteria andContinuationLessThan(Integer value) {
            addCriterion("continuation <", value, "continuation");
            return (Criteria) this;
        }

        public Criteria andContinuationLessThanOrEqualTo(Integer value) {
            addCriterion("continuation <=", value, "continuation");
            return (Criteria) this;
        }

        public Criteria andContinuationIn(List<Integer> values) {
            addCriterion("continuation in", values, "continuation");
            return (Criteria) this;
        }

        public Criteria andContinuationNotIn(List<Integer> values) {
            addCriterion("continuation not in", values, "continuation");
            return (Criteria) this;
        }

        public Criteria andContinuationBetween(Integer value1, Integer value2) {
            addCriterion("continuation between", value1, value2, "continuation");
            return (Criteria) this;
        }

        public Criteria andContinuationNotBetween(Integer value1, Integer value2) {
            addCriterion("continuation not between", value1, value2, "continuation");
            return (Criteria) this;
        }

        public Criteria andContinueFreightIsNull() {
            addCriterion("continue_freight is null");
            return (Criteria) this;
        }

        public Criteria andContinueFreightIsNotNull() {
            addCriterion("continue_freight is not null");
            return (Criteria) this;
        }

        public Criteria andContinueFreightEqualTo(Double value) {
            addCriterion("continue_freight =", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightNotEqualTo(Double value) {
            addCriterion("continue_freight <>", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightGreaterThan(Double value) {
            addCriterion("continue_freight >", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightGreaterThanOrEqualTo(Double value) {
            addCriterion("continue_freight >=", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightLessThan(Double value) {
            addCriterion("continue_freight <", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightLessThanOrEqualTo(Double value) {
            addCriterion("continue_freight <=", value, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightIn(List<Double> values) {
            addCriterion("continue_freight in", values, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightNotIn(List<Double> values) {
            addCriterion("continue_freight not in", values, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightBetween(Double value1, Double value2) {
            addCriterion("continue_freight between", value1, value2, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andContinueFreightNotBetween(Double value1, Double value2) {
            addCriterion("continue_freight not between", value1, value2, "continueFreight");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(Integer value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(Integer value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(Integer value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(Integer value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(Integer value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<Integer> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<Integer> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(Integer value1, Integer value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(Integer value1, Integer value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}