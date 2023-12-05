package com.partice.shopwebapi.service.impl;

import com.partice.shopwebapi.entity.Category;
import com.partice.shopwebapi.mapper.CategoryMapper;
import com.partice.shopwebapi.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品分类 服务实现类
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
