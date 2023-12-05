package com.partice.shopwebapi.entity;

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
 * 商品评价 
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("product_comments")
@ApiModel(value = "ProductComments对象", description = "商品评价 ")
public class ProductComments {

    @ApiModelProperty("ID")
    @TableId(value = "comm_id", type = IdType.AUTO)
    private String commId;

    @ApiModelProperty("商品id")
    @TableField("product_id")
    private String productId;

    @ApiModelProperty("商品名称")
    @TableField("product_name")
    private String productName;

    @ApiModelProperty("订单项(商品快照)ID 可为空")
    @TableField("order_item_id")
    private String orderItemId;

    @ApiModelProperty("评论用户id 用户名须脱敏")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("是否匿名（1:是，0:否）")
    @TableField("is_anonymous")
    private Integer isAnonymous;

    @ApiModelProperty("评价类型（1好评，0中评，-1差评）")
    @TableField("comm_type")
    private Integer commType;

    @ApiModelProperty("评价等级 1：好评 2：中评 3：差评")
    @TableField("comm_level")
    private Integer commLevel;

    @ApiModelProperty("评价内容")
    @TableField("comm_content")
    private String commContent;

    @ApiModelProperty("评价晒图(JSON {img1:url1,img2:url2}  )")
    @TableField("comm_imgs")
    private String commImgs;

    @ApiModelProperty("评价时间 可为空")
    @TableField("sepc_name")
    private LocalDateTime sepcName;

    @ApiModelProperty("是否回复（0:未回复，1:已回复）")
    @TableField("reply_status")
    private Integer replyStatus;

    @ApiModelProperty("回复内容")
    @TableField("reply_content")
    private String replyContent;

    @ApiModelProperty("回复时间")
    @TableField("reply_time")
    private LocalDateTime replyTime;

    @ApiModelProperty("是否显示（1:是，0:否）")
    @TableField("is_show")
    private Integer isShow;
}
