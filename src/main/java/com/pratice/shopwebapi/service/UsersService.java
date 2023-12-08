package com.pratice.shopwebapi.service;

import com.pratice.shopwebapi.common.result.Result;
import com.pratice.shopwebapi.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pratice.shopwebapi.entity.vo.UserVo;
import org.apache.catalina.User;

import java.util.List;

/**
 * <p>
 * 用户  服务类
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
public interface UsersService extends IService<Users> {


    /**
     * 根据id查找对象
     * @param id
     * @return
     */
    public Users selectById(Long id);

    public List<Users> selectUsersList();

    public Result login(UserVo user);
}
