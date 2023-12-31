package com.pratice.shopwebapi.service.impl;

import com.pratice.shopwebapi.entity.OrderItem;
import com.pratice.shopwebapi.mapper.OrderItemMapper;
import com.pratice.shopwebapi.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项/快照  服务实现类
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
