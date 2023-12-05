package com.pratice.shopwebapi.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户地址 
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("user_addr")
@ApiModel(value = "UserAddr对象", description = "用户地址 ")
public class UserAddr {

    @ApiModelProperty("地址主键id")
    @TableId(value = "addr_id", type = IdType.AUTO)
    private String addrId;

    @ApiModelProperty("用户ID")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("收件人姓名")
    @TableField("receiver_name")
    private String receiverName;

    @ApiModelProperty("收件人手机号")
    @TableField("receiver_mobile")
    private String receiverMobile;

    @ApiModelProperty("省份")
    @TableField("province")
    private String province;

    @ApiModelProperty("城市")
    @TableField("city")
    private String city;

    @ApiModelProperty("区县")
    @TableField("area")
    private String area;

    @ApiModelProperty("详细地址")
    @TableField("addr")
    private String addr;

    @ApiModelProperty("邮编")
    @TableField("post_code")
    private String postCode;

    @ApiModelProperty("状态,1正常，0无效")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("是否默认地址 1是 1:是  0:否")
    @TableField("common_addr")
    private Integer commonAddr;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
