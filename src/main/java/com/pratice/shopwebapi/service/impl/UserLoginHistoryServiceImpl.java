package com.partice.shopwebapi.service.impl;

import com.partice.shopwebapi.entity.UserLoginHistory;
import com.partice.shopwebapi.mapper.UserLoginHistoryMapper;
import com.partice.shopwebapi.service.UserLoginHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录历史表  服务实现类
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Service
public class UserLoginHistoryServiceImpl extends ServiceImpl<UserLoginHistoryMapper, UserLoginHistory> implements UserLoginHistoryService {

}
