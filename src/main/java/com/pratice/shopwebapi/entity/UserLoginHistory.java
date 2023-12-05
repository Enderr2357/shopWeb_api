package com.partice.shopwebapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 登录历史表 
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("user_login_history")
@ApiModel(value = "UserLoginHistory对象", description = "登录历史表 ")
public class UserLoginHistory {

    @ApiModelProperty("ID")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("地区")
    @TableField("AREA")
    private String area;

    @ApiModelProperty("国家")
    @TableField("COUNTRY")
    private String country;

    @ApiModelProperty("用户id")
    @TableField("USER_ID")
    private String userId;

    @ApiModelProperty("IP")
    @TableField("IP")
    private String ip;

    @ApiModelProperty("时间")
    @TableField("LOGIN_TIME")
    private String loginTime;
}
