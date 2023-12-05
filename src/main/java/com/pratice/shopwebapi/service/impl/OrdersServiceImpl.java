package com.partice.shopwebapi.service.impl;

import com.partice.shopwebapi.entity.Orders;
import com.partice.shopwebapi.mapper.OrdersMapper;
import com.partice.shopwebapi.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单  服务实现类
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
