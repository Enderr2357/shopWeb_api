package com.pratice.shopwebapi.controller;

import com.pratice.shopwebapi.common.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping()
    public Result<String> login() {
        return Result.ok("模拟登录成功");
    }
}
