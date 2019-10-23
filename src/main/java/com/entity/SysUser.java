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
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 微信名
     */
    @TableField("wx_name")
    private String wxName;

    /**
     * 微信Id
     */
    @TableField("wx_id")
    private String wxId;

    /**
     * 名称
     */
    @TableField("user_name")
    private String userName;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 状态 0:冻结,1:正常
     */
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;

    /**
     * 最后登录时间
     */
    @TableField("last_login_date")
    private Date lastLoginDate;

    /**
     * 修改时间
     */
    @TableField("update_date")
    private Date updateDate;

    private Integer dr;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
