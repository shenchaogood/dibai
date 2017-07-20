package com.wuwutong.dibai.po;

import com.wuwutong.dibai.enums.SmsIdentifyCodeStatus;
import java.io.Serializable;
import java.util.Date;

public class SmsIdentify implements Serializable {
    private Long id;

    private String to;

    private String appId;

    private String identifyCode;

    private String templateId;

    private String datas;

    private Date createTime;

    private Date dateCreated;

    private String smsMessageSid;

    private String statusCode;

    private SmsIdentifyCodeStatus status;

    private String queryStatusCode;

    private String receiver;

    private String sendStatus;

    private String sendTime;

    private String deliverStatus;

    private String receiveTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode == null ? null : identifyCode.trim();
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    public String getDatas() {
        return datas;
    }

    public void setDatas(String datas) {
        this.datas = datas == null ? null : datas.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getSmsMessageSid() {
        return smsMessageSid;
    }

    public void setSmsMessageSid(String smsMessageSid) {
        this.smsMessageSid = smsMessageSid == null ? null : smsMessageSid.trim();
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public SmsIdentifyCodeStatus getStatus() {
        return status;
    }

    public void setStatus(SmsIdentifyCodeStatus status) {
        this.status = status;
    }

    public String getQueryStatusCode() {
        return queryStatusCode;
    }

    public void setQueryStatusCode(String queryStatusCode) {
        this.queryStatusCode = queryStatusCode == null ? null : queryStatusCode.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime == null ? null : sendTime.trim();
    }

    public String getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(String deliverStatus) {
        this.deliverStatus = deliverStatus == null ? null : deliverStatus.trim();
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime == null ? null : receiveTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", to=").append(to);
        sb.append(", appId=").append(appId);
        sb.append(", identifyCode=").append(identifyCode);
        sb.append(", templateId=").append(templateId);
        sb.append(", datas=").append(datas);
        sb.append(", createTime=").append(createTime);
        sb.append(", dateCreated=").append(dateCreated);
        sb.append(", smsMessageSid=").append(smsMessageSid);
        sb.append(", statusCode=").append(statusCode);
        sb.append(", status=").append(status);
        sb.append(", queryStatusCode=").append(queryStatusCode);
        sb.append(", receiver=").append(receiver);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", deliverStatus=").append(deliverStatus);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SmsIdentify other = (SmsIdentify) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTo() == null ? other.getTo() == null : this.getTo().equals(other.getTo()))
            && (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
            && (this.getIdentifyCode() == null ? other.getIdentifyCode() == null : this.getIdentifyCode().equals(other.getIdentifyCode()))
            && (this.getTemplateId() == null ? other.getTemplateId() == null : this.getTemplateId().equals(other.getTemplateId()))
            && (this.getDatas() == null ? other.getDatas() == null : this.getDatas().equals(other.getDatas()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDateCreated() == null ? other.getDateCreated() == null : this.getDateCreated().equals(other.getDateCreated()))
            && (this.getSmsMessageSid() == null ? other.getSmsMessageSid() == null : this.getSmsMessageSid().equals(other.getSmsMessageSid()))
            && (this.getStatusCode() == null ? other.getStatusCode() == null : this.getStatusCode().equals(other.getStatusCode()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getQueryStatusCode() == null ? other.getQueryStatusCode() == null : this.getQueryStatusCode().equals(other.getQueryStatusCode()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getSendStatus() == null ? other.getSendStatus() == null : this.getSendStatus().equals(other.getSendStatus()))
            && (this.getSendTime() == null ? other.getSendTime() == null : this.getSendTime().equals(other.getSendTime()))
            && (this.getDeliverStatus() == null ? other.getDeliverStatus() == null : this.getDeliverStatus().equals(other.getDeliverStatus()))
            && (this.getReceiveTime() == null ? other.getReceiveTime() == null : this.getReceiveTime().equals(other.getReceiveTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTo() == null) ? 0 : getTo().hashCode());
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getIdentifyCode() == null) ? 0 : getIdentifyCode().hashCode());
        result = prime * result + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        result = prime * result + ((getDatas() == null) ? 0 : getDatas().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        result = prime * result + ((getSmsMessageSid() == null) ? 0 : getSmsMessageSid().hashCode());
        result = prime * result + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getQueryStatusCode() == null) ? 0 : getQueryStatusCode().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getSendStatus() == null) ? 0 : getSendStatus().hashCode());
        result = prime * result + ((getSendTime() == null) ? 0 : getSendTime().hashCode());
        result = prime * result + ((getDeliverStatus() == null) ? 0 : getDeliverStatus().hashCode());
        result = prime * result + ((getReceiveTime() == null) ? 0 : getReceiveTime().hashCode());
        return result;
    }
}