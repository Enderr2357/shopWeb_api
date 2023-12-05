package com.pratice.shopwebapi.entity;

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
 * 商品分类
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("category")
@ApiModel(value = "Category对象", description = "商品分类")
public class Category {

    @ApiModelProperty("主键 分类id主键")
    @TableId(value = "category_id", type = IdType.AUTO)
    private Integer categoryId;

    @ApiModelProperty("分类名称 分类名称")
    @TableField("category_name")
    private String categoryName;

    @ApiModelProperty("分类层级 分类得类型， 1:一级大分类 2:二级分类 3:三级小分类")
    @TableField("category_level")
    private Integer categoryLevel;

    @ApiModelProperty("父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级")
    @TableField("parent_id")
    private Integer parentId;

    @ApiModelProperty("图标 logo")
    @TableField("category_icon")
    private String categoryIcon;

    @ApiModelProperty("口号")
    @TableField("category_slogan")
    private String categorySlogan;

    @ApiModelProperty("分类图")
    @TableField("category_pic")
    private String categoryPic;

    @ApiModelProperty("背景颜色")
    @TableField("category_bg_color")
    private String categoryBgColor;
}
