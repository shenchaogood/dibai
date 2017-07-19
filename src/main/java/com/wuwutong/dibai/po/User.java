package com.wuwutong.dibai.po;

import com.wuwutong.dibai.enums.AuthStatus;
import com.wuwutong.dibai.enums.UseStatus;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long id;

    private String identifyCode;

    private String idNumber;

    private String mobile;

    private String invitationCode;

    private Date registerTime;

    private Date authTime;

    private AuthStatus authStatus;

    private UseStatus useStatus;

    private Integer useCount;

    private Integer balance;

    private Integer discountCoupon;

    private Integer credit;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode == null ? null : identifyCode.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    public AuthStatus getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(AuthStatus authStatus) {
        this.authStatus = authStatus;
    }

    public UseStatus getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(UseStatus useStatus) {
        this.useStatus = useStatus;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(Integer discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", identifyCode=").append(identifyCode);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", mobile=").append(mobile);
        sb.append(", invitationCode=").append(invitationCode);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", authTime=").append(authTime);
        sb.append(", authStatus=").append(authStatus);
        sb.append(", useStatus=").append(useStatus);
        sb.append(", useCount=").append(useCount);
        sb.append(", balance=").append(balance);
        sb.append(", discountCoupon=").append(discountCoupon);
        sb.append(", credit=").append(credit);
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIdentifyCode() == null ? other.getIdentifyCode() == null : this.getIdentifyCode().equals(other.getIdentifyCode()))
            && (this.getIdNumber() == null ? other.getIdNumber() == null : this.getIdNumber().equals(other.getIdNumber()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getInvitationCode() == null ? other.getInvitationCode() == null : this.getInvitationCode().equals(other.getInvitationCode()))
            && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
            && (this.getAuthTime() == null ? other.getAuthTime() == null : this.getAuthTime().equals(other.getAuthTime()))
            && (this.getAuthStatus() == null ? other.getAuthStatus() == null : this.getAuthStatus().equals(other.getAuthStatus()))
            && (this.getUseStatus() == null ? other.getUseStatus() == null : this.getUseStatus().equals(other.getUseStatus()))
            && (this.getUseCount() == null ? other.getUseCount() == null : this.getUseCount().equals(other.getUseCount()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getDiscountCoupon() == null ? other.getDiscountCoupon() == null : this.getDiscountCoupon().equals(other.getDiscountCoupon()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIdentifyCode() == null) ? 0 : getIdentifyCode().hashCode());
        result = prime * result + ((getIdNumber() == null) ? 0 : getIdNumber().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getInvitationCode() == null) ? 0 : getInvitationCode().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getAuthTime() == null) ? 0 : getAuthTime().hashCode());
        result = prime * result + ((getAuthStatus() == null) ? 0 : getAuthStatus().hashCode());
        result = prime * result + ((getUseStatus() == null) ? 0 : getUseStatus().hashCode());
        result = prime * result + ((getUseCount() == null) ? 0 : getUseCount().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getDiscountCoupon() == null) ? 0 : getDiscountCoupon().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        return result;
    }
}