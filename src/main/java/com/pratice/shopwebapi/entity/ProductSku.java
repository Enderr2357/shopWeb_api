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
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("product_sku")
@ApiModel(value = "ProductSku对象", description = "商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计")
public class ProductSku {

    @ApiModelProperty("sku编号")
    @TableId(value = "sku_id", type = IdType.AUTO)
    private String skuId;

    @ApiModelProperty("商品id")
    @TableField("product_id")
    private String productId;

    @ApiModelProperty("sku名称")
    @TableField("sku_name")
    private String skuName;

    @ApiModelProperty("sku图片")
    @TableField("sku_img")
    private String skuImg;

    @ApiModelProperty("属性组合（格式是p1:v1;p2:v2）")
    @TableField("untitled")
    private String untitled;

    @ApiModelProperty("原价")
    @TableField("original_price")
    private Integer originalPrice;

    @ApiModelProperty("销售价格")
    @TableField("sell_price")
    private Integer sellPrice;

    @ApiModelProperty("折扣力度")
    @TableField("discounts")
    private BigDecimal discounts;

    @ApiModelProperty("库存")
    @TableField("stock")
    private Integer stock;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty("sku状态(1启用，0禁用，-1删除)")
    @TableField("status")
    private Integer status;
}
