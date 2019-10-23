package com.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
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
@TableName("user_join_info")
public class UserJoinInfo extends Model<UserJoinInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户Id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 类型Id
     */
    private String topic;

    /**
     * 类型名称
     */
    @TableField("topic_name")
    private String topicName;

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

    private Integer dr;

    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;

    /**
     * 用户手机
     */
    private String mobile;

    /**
     * 备注
     */
    private String remark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
