package com.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

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
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date targetDate;

    private Integer status;

    private Date endDate;

    private Date createDate;

    private Date updateDate;

    private String password;
}