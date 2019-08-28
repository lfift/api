package com.ift.api.manager.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 角色信息
 * </p>
 *
 * @author ift
 * @since 2019-08-27
 */
@Data
@TableName("ift_roles")
public class Roles extends Model<Roles> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名
     */
    private String rolename;

    /**
     * 角色描述
     */
    private String describe;

    /**
     * 是否删除：1：已删除，0：未删除
     */
    @TableLogic
    private String deleted;

    /**
     * 数据新增人
     */
    private Integer datainsuser;

    /**
     * 数据新增时间
     */
    private LocalDateTime datainstime;

    /**
     * 数据修改人
     */
    private Integer dataupuser;

    /**
     * 数据修改时间
     */
    private LocalDateTime datauptime;
}
