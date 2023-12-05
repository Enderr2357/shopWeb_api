package com.partice.shopwebapi.service.impl;

import com.partice.shopwebapi.entity.Users;
import com.partice.shopwebapi.mapper.UsersMapper;
import com.partice.shopwebapi.service.UsersService;
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
