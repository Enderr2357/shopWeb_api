package com.partice.shopwebapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 购物车 
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("shopping_cart")
@ApiModel(value = "ShoppingCart对象", description = "购物车 ")
public class ShoppingCart {

    @ApiModelProperty("主键")
    @TableId(value = "cart_id", type = IdType.AUTO)
    private Integer cartId;

    @ApiModelProperty("商品ID")
    @TableField("product_id")
    private String productId;

    @ApiModelProperty("skuID")
    @TableField("sku_id")
    private String skuId;

    @ApiModelProperty("用户ID")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("购物车商品数量")
    @TableField("cart_num")
    private String cartNum;

    @ApiModelProperty("添加购物车时间")
    @TableField("cart_time")
    private String cartTime;

    @ApiModelProperty("添加购物车时商品价格")
    @TableField("product_price")
    private BigDecimal productPrice;

    @ApiModelProperty("选择的套餐的属性")
    @TableField("sku_props")
    private String skuProps;
}
