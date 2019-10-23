package com.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("sys_user_info")
public class SysUserInfo extends Model<SysUserInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户Id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 性别 0男,1女
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 爱好
     */
    private String hobby;

    private Integer dr;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
