package com.partice.shopwebapi.entity;

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
 * 商品参数 
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("product_params")
@ApiModel(value = "ProductParams对象", description = "商品参数 ")
public class ProductParams {

    @ApiModelProperty("商品参数id")
    @TableId(value = "param_id", type = IdType.AUTO)
    private String paramId;

    @ApiModelProperty("商品id")
    @TableField("product_id")
    private String productId;

    @ApiModelProperty("产地 产地，例：中国江苏")
    @TableField("product_place")
    private String productPlace;

    @ApiModelProperty("保质期 保质期，例：180天")
    @TableField("foot_period")
    private String footPeriod;

    @ApiModelProperty("品牌名 品牌名，例：三只大灰狼")
    @TableField("brand")
    private String brand;

    @ApiModelProperty("生产厂名 生产厂名，例：大灰狼工厂")
    @TableField("factory_name")
    private String factoryName;

    @ApiModelProperty("生产厂址 生产厂址，例：大灰狼生产基地")
    @TableField("factory_address")
    private String factoryAddress;

    @ApiModelProperty("包装方式 包装方式，例：袋装")
    @TableField("packaging_method")
    private String packagingMethod;

    @ApiModelProperty("规格重量 规格重量，例：35g")
    @TableField("weight")
    private String weight;

    @ApiModelProperty("存储方法 存储方法，例：常温5~25°")
    @TableField("storage_method")
    private String storageMethod;

    @ApiModelProperty("食用方式 食用方式，例：开袋即食")
    @TableField("eat_method")
    private String eatMethod;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
