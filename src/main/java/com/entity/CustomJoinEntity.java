package com.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CustomJoinEntity {
    private BigDecimal id;

    private BigDecimal userId;

    private String content;

    private Date createDate;

    private Date updateDate;

    private BigDecimal customId;

    private BigDecimal roleId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public BigDecimal getCustomId() {
        return customId;
    }

    public void setCustomId(BigDecimal customId) {
        this.customId = customId;
    }

    public BigDecimal getRoleId() {
        return roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }
}