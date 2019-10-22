package com.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@TableName("t_activity")
public class ActivityEntity {
    private Long id;

    private Long userId;

    private String title;

    private String content;

    private String site;
    
    private Date targetDate;

    private Integer status;

    private Date endDate;

    private Date createDate;

    private Date updateDate;

    private String password;
}