package com.pratice.shopwebapi.service.impl;

import com.pratice.shopwebapi.entity.UserLoginHistory;
import com.pratice.shopwebapi.mapper.UserLoginHistoryMapper;
import com.pratice.shopwebapi.service.UserLoginHistoryService;
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
