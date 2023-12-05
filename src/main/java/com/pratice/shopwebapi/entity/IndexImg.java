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
 * 轮播图 
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("index_img")
@ApiModel(value = "IndexImg对象", description = "轮播图 ")
public class IndexImg {

    @ApiModelProperty("主键")
    @TableId(value = "img_id", type = IdType.AUTO)
    private String imgId;

    @ApiModelProperty("图片 图片地址")
    @TableField("img_url")
    private String imgUrl;

    @ApiModelProperty("背景色 背景颜色")
    @TableField("img_bg_color")
    private String imgBgColor;

    @ApiModelProperty("商品id 商品id")
    @TableField("prod_id")
    private String prodId;

    @ApiModelProperty("商品分类id 商品分类id")
    @TableField("category_id")
    private String categoryId;

    @ApiModelProperty("轮播图类型 用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类")
    @TableField("index_type")
    private Integer indexType;

    @ApiModelProperty("轮播图展示顺序 轮播图展示顺序，从小到大")
    @TableField("seq")
    private Integer seq;

    @ApiModelProperty("是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("创建时间 创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间 更新")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
