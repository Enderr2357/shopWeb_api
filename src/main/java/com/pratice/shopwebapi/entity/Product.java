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
 * 商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("product")
@ApiModel(value = "Product对象", description = "商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表")
public class Product {

    @ApiModelProperty("商品主键id")
    @TableId(value = "product_id", type = IdType.AUTO)
    private String productId;

    @ApiModelProperty("商品名称 商品名称")
    @TableField("product_name")
    private String productName;

    @ApiModelProperty("分类外键id 分类id")
    @TableField("category_id")
    private Integer categoryId;

    @ApiModelProperty("一级分类外键id 一级分类id，用于优化查询")
    @TableField("root_category_id")
    private Integer rootCategoryId;

    @ApiModelProperty("销量 累计销售")
    @TableField("sold_num")
    private Integer soldNum;

    @ApiModelProperty("默认是1，表示正常状态, -1表示删除, 0下架")
    @TableField("product_status")
    private Integer productStatus;

    @ApiModelProperty("商品内容 商品内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
