package com.pratice.shopwebapi.entity;

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
 * 商品图片 
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("product_img")
@ApiModel(value = "ProductImg对象", description = "商品图片 ")
public class ProductImg {

    @ApiModelProperty("图片主键")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty("商品外键id 商品外键id")
    @TableField("item_id")
    private String itemId;

    @ApiModelProperty("图片地址 图片地址")
    @TableField("url")
    private String url;

    @ApiModelProperty("顺序 图片顺序，从小到大")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("是否主图 是否主图，1：是，0：否")
    @TableField("is_main")
    private Integer isMain;

    @ApiModelProperty("创建时间")
    @TableField("created_time")
    private LocalDateTime createdTime;

    @ApiModelProperty("更新时间")
    @TableField("updated_time")
    private LocalDateTime updatedTime;
}
