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
public class Custom extends Model<Custom> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 创建人
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 标题
     */
    private String titile;

    /**
     * 内容
     */
    private String content;

    /**
     * 状态 1正常 2禁止加入
     */
    private Integer status;

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


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
