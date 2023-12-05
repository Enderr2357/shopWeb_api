package com.pratice.shopwebapi.mapper;

import com.pratice.shopwebapi.entity.ProductSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 Mapper 接口
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
public interface ProductSkuMapper extends BaseMapper<ProductSku> {

}
