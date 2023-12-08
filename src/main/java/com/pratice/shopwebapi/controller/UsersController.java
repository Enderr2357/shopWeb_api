package com.pratice.shopwebapi.controller;

import com.pratice.shopwebapi.common.result.Result;
import com.pratice.shopwebapi.entity.Users;
import com.pratice.shopwebapi.entity.vo.UserVo;
import com.pratice.shopwebapi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户  前端控制器
 * </p>
 *
 * @author ender2357
 * @since 2023-12-05
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/{id}")
    public Result<Users> getUserInfo(@PathVariable("id") Long id){
        return Result.ok(usersService.selectById(id));
    }

    @GetMapping("/list")
    public Result<List<Users>> getUserListInfo(){
        return Result.ok(usersService.selectUsersList());
    }


}
