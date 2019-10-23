package com.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;



import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ouchujian
 * @since 2019-10-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Activity extends Model<Activity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 创建者
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 地点
     */
    private String site;

    /**
     * 活动时间
     */
    @TableField("target_date")
    private Date targetDate;

    /**
     * 活动状态:0投票草拟 1正常 2已结束
     */
    private Integer status;

    /**
     * 截止时间
     */
    @TableField("end_date")
    private Date endDate;

    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @TableField("update_date")
    private Date updateDate;

    /**
     * 密码
     */
    private String password;

    private Integer dr;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
