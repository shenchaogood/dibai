package com.wuwutong.dibai.po;

import com.wuwutong.dibai.enums.SmsIdentifyCodeStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsIdentifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsIdentifyExample() {
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
        protected List<Criterion> statusCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            statusCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getStatusCriteria() {
            return statusCriteria;
        }

        protected void addStatusCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            statusCriteria.add(new Criterion(condition, value, "org.apache.ibatis.type.EnumOrdinalTypeHandler"));
            allCriteria = null;
        }

        protected void addStatusCriterion(String condition, SmsIdentifyCodeStatus value1, SmsIdentifyCodeStatus value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            statusCriteria.add(new Criterion(condition, value1, value2, "org.apache.ibatis.type.EnumOrdinalTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || statusCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(statusCriteria);
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

        public Criteria andToIsNull() {
            addCriterion("f_to is null");
            return (Criteria) this;
        }

        public Criteria andToIsNotNull() {
            addCriterion("f_to is not null");
            return (Criteria) this;
        }

        public Criteria andToEqualTo(String value) {
            addCriterion("f_to =", value, "to");
            return (Criteria) this;
        }

        public Criteria andToNotEqualTo(String value) {
            addCriterion("f_to <>", value, "to");
            return (Criteria) this;
        }

        public Criteria andToGreaterThan(String value) {
            addCriterion("f_to >", value, "to");
            return (Criteria) this;
        }

        public Criteria andToGreaterThanOrEqualTo(String value) {
            addCriterion("f_to >=", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLessThan(String value) {
            addCriterion("f_to <", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLessThanOrEqualTo(String value) {
            addCriterion("f_to <=", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLike(String value) {
            addCriterion("f_to like", value, "to");
            return (Criteria) this;
        }

        public Criteria andToNotLike(String value) {
            addCriterion("f_to not like", value, "to");
            return (Criteria) this;
        }

        public Criteria andToIn(List<String> values) {
            addCriterion("f_to in", values, "to");
            return (Criteria) this;
        }

        public Criteria andToNotIn(List<String> values) {
            addCriterion("f_to not in", values, "to");
            return (Criteria) this;
        }

        public Criteria andToBetween(String value1, String value2) {
            addCriterion("f_to between", value1, value2, "to");
            return (Criteria) this;
        }

        public Criteria andToNotBetween(String value1, String value2) {
            addCriterion("f_to not between", value1, value2, "to");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("f_app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("f_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("f_app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("f_app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("f_app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("f_app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("f_app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("f_app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("f_app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("f_app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("f_app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("f_app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("f_app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("f_app_id not between", value1, value2, "appId");
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("f_template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("f_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(String value) {
            addCriterion("f_template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(String value) {
            addCriterion("f_template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(String value) {
            addCriterion("f_template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("f_template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(String value) {
            addCriterion("f_template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("f_template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLike(String value) {
            addCriterion("f_template_id like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotLike(String value) {
            addCriterion("f_template_id not like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<String> values) {
            addCriterion("f_template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<String> values) {
            addCriterion("f_template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(String value1, String value2) {
            addCriterion("f_template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(String value1, String value2) {
            addCriterion("f_template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andDatasIsNull() {
            addCriterion("f_datas is null");
            return (Criteria) this;
        }

        public Criteria andDatasIsNotNull() {
            addCriterion("f_datas is not null");
            return (Criteria) this;
        }

        public Criteria andDatasEqualTo(String value) {
            addCriterion("f_datas =", value, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasNotEqualTo(String value) {
            addCriterion("f_datas <>", value, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasGreaterThan(String value) {
            addCriterion("f_datas >", value, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasGreaterThanOrEqualTo(String value) {
            addCriterion("f_datas >=", value, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasLessThan(String value) {
            addCriterion("f_datas <", value, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasLessThanOrEqualTo(String value) {
            addCriterion("f_datas <=", value, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasLike(String value) {
            addCriterion("f_datas like", value, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasNotLike(String value) {
            addCriterion("f_datas not like", value, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasIn(List<String> values) {
            addCriterion("f_datas in", values, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasNotIn(List<String> values) {
            addCriterion("f_datas not in", values, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasBetween(String value1, String value2) {
            addCriterion("f_datas between", value1, value2, "datas");
            return (Criteria) this;
        }

        public Criteria andDatasNotBetween(String value1, String value2) {
            addCriterion("f_datas not between", value1, value2, "datas");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("f_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("f_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("f_create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("f_create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("f_create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("f_create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("f_create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("f_create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("f_create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("f_create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("f_create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNull() {
            addCriterion("f_date_created is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("f_date_created is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterion("f_date_created =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterion("f_date_created <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterion("f_date_created >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("f_date_created >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterion("f_date_created <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterion("f_date_created <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterion("f_date_created in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterion("f_date_created not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterion("f_date_created between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterion("f_date_created not between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidIsNull() {
            addCriterion("f_sms_message_sid is null");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidIsNotNull() {
            addCriterion("f_sms_message_sid is not null");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidEqualTo(String value) {
            addCriterion("f_sms_message_sid =", value, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidNotEqualTo(String value) {
            addCriterion("f_sms_message_sid <>", value, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidGreaterThan(String value) {
            addCriterion("f_sms_message_sid >", value, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidGreaterThanOrEqualTo(String value) {
            addCriterion("f_sms_message_sid >=", value, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidLessThan(String value) {
            addCriterion("f_sms_message_sid <", value, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidLessThanOrEqualTo(String value) {
            addCriterion("f_sms_message_sid <=", value, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidLike(String value) {
            addCriterion("f_sms_message_sid like", value, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidNotLike(String value) {
            addCriterion("f_sms_message_sid not like", value, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidIn(List<String> values) {
            addCriterion("f_sms_message_sid in", values, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidNotIn(List<String> values) {
            addCriterion("f_sms_message_sid not in", values, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidBetween(String value1, String value2) {
            addCriterion("f_sms_message_sid between", value1, value2, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSidNotBetween(String value1, String value2) {
            addCriterion("f_sms_message_sid not between", value1, value2, "smsMessageSid");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNull() {
            addCriterion("f_status_code is null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNotNull() {
            addCriterion("f_status_code is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeEqualTo(String value) {
            addCriterion("f_status_code =", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotEqualTo(String value) {
            addCriterion("f_status_code <>", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThan(String value) {
            addCriterion("f_status_code >", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("f_status_code >=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThan(String value) {
            addCriterion("f_status_code <", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("f_status_code <=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLike(String value) {
            addCriterion("f_status_code like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotLike(String value) {
            addCriterion("f_status_code not like", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIn(List<String> values) {
            addCriterion("f_status_code in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotIn(List<String> values) {
            addCriterion("f_status_code not in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeBetween(String value1, String value2) {
            addCriterion("f_status_code between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotBetween(String value1, String value2) {
            addCriterion("f_status_code not between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("f_status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("f_status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(SmsIdentifyCodeStatus value) {
            addStatusCriterion("f_status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(SmsIdentifyCodeStatus value) {
            addStatusCriterion("f_status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(SmsIdentifyCodeStatus value) {
            addStatusCriterion("f_status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(SmsIdentifyCodeStatus value) {
            addStatusCriterion("f_status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(SmsIdentifyCodeStatus value) {
            addStatusCriterion("f_status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(SmsIdentifyCodeStatus value) {
            addStatusCriterion("f_status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<SmsIdentifyCodeStatus> values) {
            addStatusCriterion("f_status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<SmsIdentifyCodeStatus> values) {
            addStatusCriterion("f_status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(SmsIdentifyCodeStatus value1, SmsIdentifyCodeStatus value2) {
            addStatusCriterion("f_status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(SmsIdentifyCodeStatus value1, SmsIdentifyCodeStatus value2) {
            addStatusCriterion("f_status not between", value1, value2, "status");
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