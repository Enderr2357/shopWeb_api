package com.pratice.shopwebapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.pratice.shopwebapi.common.exception.ServerException;
import com.pratice.shopwebapi.common.result.Result;
import com.pratice.shopwebapi.entity.Users;
import com.pratice.shopwebapi.entity.vo.UserVo;
import com.pratice.shopwebapi.mapper.UsersMapper;
import com.pratice.shopwebapi.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Users selectById(Long id) {

        return baseMapper.selectById(id);
    }

    @Override
    public List<Users> selectUsersList() {
        LambdaQueryWrapper queryWrapper = new LambdaQueryWrapper();
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public Result login(UserVo userVo) {
        LambdaQueryWrapper<Users> queryWrapper = new LambdaQueryWrapper();

        //code为1 邮箱 2手机号 3用户名
        if (userVo.getCode()==1){
            queryWrapper.eq(Users::getUserEmail,userVo.getAccount());
        }else if(userVo.getCode()==2){
            queryWrapper.eq(Users::getUserMobile,userVo.getAccount());
        }else {
            queryWrapper.eq(Users::getUsername,userVo.getAccount());
        }

        queryWrapper.eq(Users::getPassword,userVo.getPassword());
        Users users = baseMapper.selectOne(queryWrapper);
        if (users==null){
            return Result.error("用户名或密码错误");
        }
        else {
            return Result.ok("登陆成功");
        }
    }


}
