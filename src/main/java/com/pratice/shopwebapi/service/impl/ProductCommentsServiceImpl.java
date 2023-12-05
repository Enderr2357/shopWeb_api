package com.partice.shopwebapi.service.impl;

import com.partice.shopwebapi.entity.ProductComments;
import com.partice.shopwebapi.mapper.ProductCommentsMapper;
import com.partice.shopwebapi.service.ProductCommentsService;
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
