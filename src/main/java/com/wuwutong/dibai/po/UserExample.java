package com.wuwutong.dibai.po;

import com.wuwutong.dibai.enums.AuthStatus;
import com.wuwutong.dibai.enums.UseStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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
        protected List<Criterion> authStatusCriteria;

        protected List<Criterion> useStatusCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            authStatusCriteria = new ArrayList<Criterion>();
            useStatusCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getAuthStatusCriteria() {
            return authStatusCriteria;
        }

        protected void addAuthStatusCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            authStatusCriteria.add(new Criterion(condition, value, "org.apache.ibatis.type.EnumOrdinalTypeHandler"));
            allCriteria = null;
        }

        protected void addAuthStatusCriterion(String condition, AuthStatus value1, AuthStatus value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            authStatusCriteria.add(new Criterion(condition, value1, value2, "org.apache.ibatis.type.EnumOrdinalTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getUseStatusCriteria() {
            return useStatusCriteria;
        }

        protected void addUseStatusCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            useStatusCriteria.add(new Criterion(condition, value, "org.apache.ibatis.type.EnumOrdinalTypeHandler"));
            allCriteria = null;
        }

        protected void addUseStatusCriterion(String condition, UseStatus value1, UseStatus value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            useStatusCriteria.add(new Criterion(condition, value1, value2, "org.apache.ibatis.type.EnumOrdinalTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || authStatusCriteria.size() > 0
                || useStatusCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(authStatusCriteria);
                allCriteria.addAll(useStatusCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("f_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("f_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("f_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("f_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("f_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("f_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("f_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("f_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("f_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("f_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeIsNull() {
            addCriterion("f_identify_code is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeIsNotNull() {
            addCriterion("f_identify_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeEqualTo(String value) {
            addCriterion("f_identify_code =", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotEqualTo(String value) {
            addCriterion("f_identify_code <>", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeGreaterThan(String value) {
            addCriterion("f_identify_code >", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_identify_code >=", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeLessThan(String value) {
            addCriterion("f_identify_code <", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeLessThanOrEqualTo(String value) {
            addCriterion("f_identify_code <=", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeLike(String value) {
            addCriterion("f_identify_code like", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotLike(String value) {
            addCriterion("f_identify_code not like", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeIn(List<String> values) {
            addCriterion("f_identify_code in", values, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotIn(List<String> values) {
            addCriterion("f_identify_code not in", values, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeBetween(String value1, String value2) {
            addCriterion("f_identify_code between", value1, value2, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotBetween(String value1, String value2) {
            addCriterion("f_identify_code not between", value1, value2, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("f_id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("f_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("f_id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("f_id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("f_id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("f_id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("f_id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("f_id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("f_id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("f_id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("f_id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("f_id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("f_id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("f_id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("f_mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("f_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("f_mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("f_mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("f_mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("f_mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("f_mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("f_mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("f_mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("f_mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("f_mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("f_mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("f_mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("f_mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNull() {
            addCriterion("f_invitation_code is null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNotNull() {
            addCriterion("f_invitation_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeEqualTo(String value) {
            addCriterion("f_invitation_code =", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotEqualTo(String value) {
            addCriterion("f_invitation_code <>", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThan(String value) {
            addCriterion("f_invitation_code >", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_invitation_code >=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThan(String value) {
            addCriterion("f_invitation_code <", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThanOrEqualTo(String value) {
            addCriterion("f_invitation_code <=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLike(String value) {
            addCriterion("f_invitation_code like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotLike(String value) {
            addCriterion("f_invitation_code not like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIn(List<String> values) {
            addCriterion("f_invitation_code in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotIn(List<String> values) {
            addCriterion("f_invitation_code not in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeBetween(String value1, String value2) {
            addCriterion("f_invitation_code between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotBetween(String value1, String value2) {
            addCriterion("f_invitation_code not between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("f_register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("f_register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("f_register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("f_register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("f_register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("f_register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("f_register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("f_register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("f_register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("f_register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("f_register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNull() {
            addCriterion("f_auth_time is null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNotNull() {
            addCriterion("f_auth_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeEqualTo(Date value) {
            addCriterion("f_auth_time =", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotEqualTo(Date value) {
            addCriterion("f_auth_time <>", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThan(Date value) {
            addCriterion("f_auth_time >", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_auth_time >=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThan(Date value) {
            addCriterion("f_auth_time <", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("f_auth_time <=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIn(List<Date> values) {
            addCriterion("f_auth_time in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotIn(List<Date> values) {
            addCriterion("f_auth_time not in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeBetween(Date value1, Date value2) {
            addCriterion("f_auth_time between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("f_auth_time not between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthStatusIsNull() {
            addCriterion("f_auth_status is null");
            return (Criteria) this;
        }

        public Criteria andAuthStatusIsNotNull() {
            addCriterion("f_auth_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuthStatusEqualTo(AuthStatus value) {
            addAuthStatusCriterion("f_auth_status =", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusNotEqualTo(AuthStatus value) {
            addAuthStatusCriterion("f_auth_status <>", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusGreaterThan(AuthStatus value) {
            addAuthStatusCriterion("f_auth_status >", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusGreaterThanOrEqualTo(AuthStatus value) {
            addAuthStatusCriterion("f_auth_status >=", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusLessThan(AuthStatus value) {
            addAuthStatusCriterion("f_auth_status <", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusLessThanOrEqualTo(AuthStatus value) {
            addAuthStatusCriterion("f_auth_status <=", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusIn(List<AuthStatus> values) {
            addAuthStatusCriterion("f_auth_status in", values, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusNotIn(List<AuthStatus> values) {
            addAuthStatusCriterion("f_auth_status not in", values, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusBetween(AuthStatus value1, AuthStatus value2) {
            addAuthStatusCriterion("f_auth_status between", value1, value2, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusNotBetween(AuthStatus value1, AuthStatus value2) {
            addAuthStatusCriterion("f_auth_status not between", value1, value2, "authStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusIsNull() {
            addCriterion("f_use_status is null");
            return (Criteria) this;
        }

        public Criteria andUseStatusIsNotNull() {
            addCriterion("f_use_status is not null");
            return (Criteria) this;
        }

        public Criteria andUseStatusEqualTo(UseStatus value) {
            addUseStatusCriterion("f_use_status =", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotEqualTo(UseStatus value) {
            addUseStatusCriterion("f_use_status <>", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusGreaterThan(UseStatus value) {
            addUseStatusCriterion("f_use_status >", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusGreaterThanOrEqualTo(UseStatus value) {
            addUseStatusCriterion("f_use_status >=", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusLessThan(UseStatus value) {
            addUseStatusCriterion("f_use_status <", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusLessThanOrEqualTo(UseStatus value) {
            addUseStatusCriterion("f_use_status <=", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusIn(List<UseStatus> values) {
            addUseStatusCriterion("f_use_status in", values, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotIn(List<UseStatus> values) {
            addUseStatusCriterion("f_use_status not in", values, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusBetween(UseStatus value1, UseStatus value2) {
            addUseStatusCriterion("f_use_status between", value1, value2, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotBetween(UseStatus value1, UseStatus value2) {
            addUseStatusCriterion("f_use_status not between", value1, value2, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseCountIsNull() {
            addCriterion("f_use_count is null");
            return (Criteria) this;
        }

        public Criteria andUseCountIsNotNull() {
            addCriterion("f_use_count is not null");
            return (Criteria) this;
        }

        public Criteria andUseCountEqualTo(Integer value) {
            addCriterion("f_use_count =", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountNotEqualTo(Integer value) {
            addCriterion("f_use_count <>", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountGreaterThan(Integer value) {
            addCriterion("f_use_count >", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_use_count >=", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountLessThan(Integer value) {
            addCriterion("f_use_count <", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountLessThanOrEqualTo(Integer value) {
            addCriterion("f_use_count <=", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountIn(List<Integer> values) {
            addCriterion("f_use_count in", values, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountNotIn(List<Integer> values) {
            addCriterion("f_use_count not in", values, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountBetween(Integer value1, Integer value2) {
            addCriterion("f_use_count between", value1, value2, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("f_use_count not between", value1, value2, "useCount");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("f_balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("f_balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Integer value) {
            addCriterion("f_balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Integer value) {
            addCriterion("f_balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Integer value) {
            addCriterion("f_balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Integer value) {
            addCriterion("f_balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("f_balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Integer> values) {
            addCriterion("f_balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Integer> values) {
            addCriterion("f_balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Integer value1, Integer value2) {
            addCriterion("f_balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("f_balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponIsNull() {
            addCriterion("f_discount_coupon is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponIsNotNull() {
            addCriterion("f_discount_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponEqualTo(Integer value) {
            addCriterion("f_discount_coupon =", value, "discountCoupon");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponNotEqualTo(Integer value) {
            addCriterion("f_discount_coupon <>", value, "discountCoupon");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponGreaterThan(Integer value) {
            addCriterion("f_discount_coupon >", value, "discountCoupon");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_discount_coupon >=", value, "discountCoupon");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponLessThan(Integer value) {
            addCriterion("f_discount_coupon <", value, "discountCoupon");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponLessThanOrEqualTo(Integer value) {
            addCriterion("f_discount_coupon <=", value, "discountCoupon");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponIn(List<Integer> values) {
            addCriterion("f_discount_coupon in", values, "discountCoupon");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponNotIn(List<Integer> values) {
            addCriterion("f_discount_coupon not in", values, "discountCoupon");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponBetween(Integer value1, Integer value2) {
            addCriterion("f_discount_coupon between", value1, value2, "discountCoupon");
            return (Criteria) this;
        }

        public Criteria andDiscountCouponNotBetween(Integer value1, Integer value2) {
            addCriterion("f_discount_coupon not between", value1, value2, "discountCoupon");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("f_credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("f_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Integer value) {
            addCriterion("f_credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Integer value) {
            addCriterion("f_credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Integer value) {
            addCriterion("f_credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Integer value) {
            addCriterion("f_credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Integer value) {
            addCriterion("f_credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Integer> values) {
            addCriterion("f_credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Integer> values) {
            addCriterion("f_credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Integer value1, Integer value2) {
            addCriterion("f_credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("f_credit not between", value1, value2, "credit");
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