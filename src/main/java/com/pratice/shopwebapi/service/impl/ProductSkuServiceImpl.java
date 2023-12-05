package com.partice.shopwebapi.service.impl;

import com.partice.shopwebapi.entity.ProductSku;
import com.partice.shopwebapi.mapper.ProductSkuMapper;
import com.partice.shopwebapi.service.ProductSkuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 服务实现类
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Service
public class ProductSkuServiceImpl extends ServiceImpl<ProductSkuMapper, ProductSku> implements ProductSkuService {

}
