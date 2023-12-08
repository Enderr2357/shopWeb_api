package com.pratice.shopwebapi.entity.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
    @Schema(description = "用户id")
    private Integer id;
    @Schema(description = "账号类型")
    private Integer code;
    @Schema(description = "用户名")
    private String account;
    @Schema(description = "密码")
    private String password;

}
