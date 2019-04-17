package com.entity;

import java.math.BigDecimal;
import java.util.Date;

public class VoteJoinEntity {
    private BigDecimal id;

    private BigDecimal voteId;

    private BigDecimal userId;

    private Date createDate;

    private Date updateDate;

    private Short status;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getVoteId() {
        return voteId;
    }

    public void setVoteId(BigDecimal voteId) {
        this.voteId = voteId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
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

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}