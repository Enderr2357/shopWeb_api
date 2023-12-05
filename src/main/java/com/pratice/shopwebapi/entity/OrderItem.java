package com.pratice.shopwebapi.entity;

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
 * 订单项/快照 
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("order_item")
@ApiModel(value = "OrderItem对象", description = "订单项/快照 ")
public class OrderItem {

    @ApiModelProperty("订单项ID")
    @TableId(value = "item_id", type = IdType.AUTO)
    private String itemId;

    @ApiModelProperty("订单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("商品ID")
    @TableField("product_id")
    private String productId;

    @ApiModelProperty("商品名称")
    @TableField("product_name")
    private String productName;

    @ApiModelProperty("商品图片")
    @TableField("product_img")
    private String productImg;

    @ApiModelProperty("skuID")
    @TableField("sku_id")
    private String skuId;

    @ApiModelProperty("sku名称")
    @TableField("sku_name")
    private String skuName;

    @ApiModelProperty("商品价格")
    @TableField("product_price")
    private BigDecimal productPrice;

    @ApiModelProperty("购买数量")
    @TableField("buy_counts")
    private Integer buyCounts;

    @ApiModelProperty("商品总金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty("加入购物车时间")
    @TableField("basket_date")
    private LocalDateTime basketDate;

    @ApiModelProperty("购买时间")
    @TableField("buy_time")
    private LocalDateTime buyTime;

    @ApiModelProperty("评论状态： 0 未评价  1 已评价")
    @TableField("is_comment")
    private Integer isComment;
}
