package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class TypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTphotoIsNull() {
            addCriterion("tphoto is null");
            return (Criteria) this;
        }

        public Criteria andTphotoIsNotNull() {
            addCriterion("tphoto is not null");
            return (Criteria) this;
        }

        public Criteria andTphotoEqualTo(String value) {
            addCriterion("tphoto =", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotEqualTo(String value) {
            addCriterion("tphoto <>", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoGreaterThan(String value) {
            addCriterion("tphoto >", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoGreaterThanOrEqualTo(String value) {
            addCriterion("tphoto >=", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoLessThan(String value) {
            addCriterion("tphoto <", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoLessThanOrEqualTo(String value) {
            addCriterion("tphoto <=", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoLike(String value) {
            addCriterion("tphoto like", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotLike(String value) {
            addCriterion("tphoto not like", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoIn(List<String> values) {
            addCriterion("tphoto in", values, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotIn(List<String> values) {
            addCriterion("tphoto not in", values, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoBetween(String value1, String value2) {
            addCriterion("tphoto between", value1, value2, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotBetween(String value1, String value2) {
            addCriterion("tphoto not between", value1, value2, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTinfoIsNull() {
            addCriterion("tinfo is null");
            return (Criteria) this;
        }

        public Criteria andTinfoIsNotNull() {
            addCriterion("tinfo is not null");
            return (Criteria) this;
        }

        public Criteria andTinfoEqualTo(String value) {
            addCriterion("tinfo =", value, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoNotEqualTo(String value) {
            addCriterion("tinfo <>", value, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoGreaterThan(String value) {
            addCriterion("tinfo >", value, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoGreaterThanOrEqualTo(String value) {
            addCriterion("tinfo >=", value, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoLessThan(String value) {
            addCriterion("tinfo <", value, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoLessThanOrEqualTo(String value) {
            addCriterion("tinfo <=", value, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoLike(String value) {
            addCriterion("tinfo like", value, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoNotLike(String value) {
            addCriterion("tinfo not like", value, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoIn(List<String> values) {
            addCriterion("tinfo in", values, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoNotIn(List<String> values) {
            addCriterion("tinfo not in", values, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoBetween(String value1, String value2) {
            addCriterion("tinfo between", value1, value2, "tinfo");
            return (Criteria) this;
        }

        public Criteria andTinfoNotBetween(String value1, String value2) {
            addCriterion("tinfo not between", value1, value2, "tinfo");
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