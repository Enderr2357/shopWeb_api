package com.pratice.shopwebapi.controller;

import com.pratice.shopwebapi.common.result.Result;
import com.pratice.shopwebapi.entity.vo.UserVo;
import com.pratice.shopwebapi.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private UsersService usersService;

    @PostMapping()
    public void login(@RequestBody UserVo userVo) {
        log.info("前端传回来:{}",userVo);
        usersService.login(userVo);
    }
}
