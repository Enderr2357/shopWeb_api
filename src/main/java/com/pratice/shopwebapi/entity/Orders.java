package com.pratice.shopwebapi.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 订单 
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("orders")
@ApiModel(value = "Orders对象", description = "订单 ")
public class Orders {

    @ApiModelProperty("订单ID 同时也是订单编号")
    @TableId(value = "order_id", type = IdType.AUTO)
    private String orderId;

    @ApiModelProperty("用户ID")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("产品名称（多个产品用,隔开）")
    @TableField("untitled")
    private String untitled;

    @ApiModelProperty("收货人快照")
    @TableField("receiver_name")
    private String receiverName;

    @ApiModelProperty("收货人手机号快照")
    @TableField("receiver_mobile")
    private String receiverMobile;

    @ApiModelProperty("收货地址快照")
    @TableField("receiver_address")
    private String receiverAddress;

    @ApiModelProperty("订单总价格")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty("实际支付总价格")
    @TableField("actual_amount")
    private Integer actualAmount;

    @ApiModelProperty("支付方式 1:微信 2:支付宝")
    @TableField("pay_type")
    private Integer payType;

    @ApiModelProperty("订单备注")
    @TableField("order_remark")
    private String orderRemark;

    @ApiModelProperty("订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭")
    @TableField("status")
    private String status;

    @ApiModelProperty("配送方式")
    @TableField("delivery_type")
    private String deliveryType;

    @ApiModelProperty("物流单号")
    @TableField("delivery_flow_id")
    private String deliveryFlowId;

    @ApiModelProperty("订单运费 默认可以为零，代表包邮")
    @TableField("order_freight")
    private BigDecimal orderFreight;

    @ApiModelProperty("逻辑删除状态 1: 删除 0:未删除")
    @TableField("delete_status")
    private Integer deleteStatus;

    @ApiModelProperty("创建时间（成交时间）")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty("付款时间")
    @TableField("pay_time")
    private LocalDateTime payTime;

    @ApiModelProperty("发货时间")
    @TableField("delivery_time")
    private LocalDateTime deliveryTime;

    @ApiModelProperty("完成时间")
    @TableField("flish_time")
    private LocalDateTime flishTime;

    @ApiModelProperty("取消时间")
    @TableField("cancel_time")
    private LocalDateTime cancelTime;

    @ApiModelProperty("订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易")
    @TableField("close_type")
    private Integer closeType;
}
