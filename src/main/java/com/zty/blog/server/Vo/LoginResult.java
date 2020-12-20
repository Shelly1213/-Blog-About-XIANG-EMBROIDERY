package com.zty.blog.server.Vo;

import lombok.Data;

//1010：成功登陆    2008:邮箱错误   2007:密码错误
@Data
public class LoginResult {
    private int code;
    private String msg;
    private String token;
}
