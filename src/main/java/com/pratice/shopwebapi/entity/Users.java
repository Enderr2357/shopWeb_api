package com.partice.shopwebapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户 
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("users")
@ApiModel(value = "Users对象", description = "用户 ")
public class Users {

    @ApiModelProperty("主键id 用户id")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty("用户名 用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty("密码 密码")
    @TableField("password")
    private String password;

    @ApiModelProperty("昵称 昵称")
    @TableField("nickname")
    private String nickname;

    @ApiModelProperty("真实姓名 真实姓名")
    @TableField("realname")
    private String realname;

    @ApiModelProperty("头像 头像")
    @TableField("user_img")
    private String userImg;

    @ApiModelProperty("手机号 手机号")
    @TableField("user_mobile")
    private String userMobile;

    @ApiModelProperty("邮箱地址 邮箱地址")
    @TableField("user_email")
    private String userEmail;

    @ApiModelProperty("性别 M(男) or F(女)")
    @TableField("user_sex")
    private String userSex;

    @ApiModelProperty("生日 生日")
    @TableField("user_birth")
    private LocalDate userBirth;

    @ApiModelProperty("注册时间 创建时间")
    @TableField("user_regtime")
    private LocalDateTime userRegtime;

    @ApiModelProperty("更新时间 更新时间")
    @TableField("user_modtime")
    private LocalDateTime userModtime;
}
