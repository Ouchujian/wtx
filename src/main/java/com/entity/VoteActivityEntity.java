package com.entity;

import java.math.BigDecimal;

public class VoteActivityEntity {
    private BigDecimal id;

    private BigDecimal voteId;

    private BigDecimal activityId;

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

    public BigDecimal getActivityId() {
        return activityId;
    }

    public void setActivityId(BigDecimal activityId) {
        this.activityId = activityId;
    }
}