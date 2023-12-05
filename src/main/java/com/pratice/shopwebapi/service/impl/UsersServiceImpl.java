package com.pratice.shopwebapi.service.impl;

import com.pratice.shopwebapi.entity.Users;
import com.pratice.shopwebapi.mapper.UsersMapper;
import com.pratice.shopwebapi.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户  服务实现类
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
