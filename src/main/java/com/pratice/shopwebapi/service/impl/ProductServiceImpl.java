package com.pratice.shopwebapi.service.impl;

import com.pratice.shopwebapi.entity.Product;
import com.pratice.shopwebapi.mapper.ProductMapper;
import com.pratice.shopwebapi.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表 服务实现类
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
