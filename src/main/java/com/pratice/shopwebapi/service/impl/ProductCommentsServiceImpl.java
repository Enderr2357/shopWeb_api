package com.pratice.shopwebapi.service.impl;

import com.pratice.shopwebapi.entity.ProductComments;
import com.pratice.shopwebapi.mapper.ProductCommentsMapper;
import com.pratice.shopwebapi.service.ProductCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价  服务实现类
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Service
public class ProductCommentsServiceImpl extends ServiceImpl<ProductCommentsMapper, ProductComments> implements ProductCommentsService {

}
