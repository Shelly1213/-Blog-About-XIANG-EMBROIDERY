package com.zty.blog.server.Controller;

import com.zty.blog.server.Entity.User;
import com.zty.blog.server.Service.RegLogin.RegLogServiceImp;
import com.zty.blog.server.Vo.LogOutResult;
import com.zty.blog.server.Vo.LoginResult;
import com.zty.blog.server.Vo.RegResult;
import com.zty.blog.server.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("login")
public class LogRegController {
    @Autowired
    private RegLogServiceImp regLogServiceImp;

    //注册功能
    @RequestMapping("/getRegister")
    public RegResult Register(@RequestParam("username") String username,
                              @RequestParam("email") String email,
                              @RequestParam("password") String password) throws IOException {


        User user = regLogServiceImp.getUserByEmail(email);
//        System.out.println(user.toString());

        RegResult result = new RegResult();
        if (user != null) {
            result.setCode(2002);
            result.setMsg("邮箱已存在，注册失败!");
            System.out.println("注册失败！");
        } else {
            regLogServiceImp.insertUser(username,email,password);
            result.setMsg("注册成功!");
            System.out.println("注册成功！");
        }
        return result;
    }


//登录验证
    @RequestMapping("/UserLogin")
    public LoginResult Login(@RequestParam("email") String email,
                             @RequestParam("password") String password) throws IOException {
        User user = regLogServiceImp.getUserByEmail(email);
        LoginResult result = new LoginResult();
        if(user==null){
            result.setMsg("无此用户，请重新输入正确邮箱");
            result.setCode(2008);
        }
        else {
            if(user.getPwd().equals(password)){
                result.setCode(1010);
                String token = TokenUtil.token(email, password);
                result.setToken(token);
                result.setMsg("登录成功");
            }
            else {
                result.setCode(2007);
                result.setMsg("密码错误");
            }
        }
        return result;
    }

    @RequestMapping("/LoginOut")
    public LogOutResult LoginOut(@RequestParam("token") String token){
        boolean verify = TokenUtil.verify(token);
        LogOutResult logOutResult = new LogOutResult();
        if(verify){
            logOutResult.setCode(1001);
            logOutResult.setMsg("注销成功");
        }else {
            logOutResult.setCode(1010);
            logOutResult.setMsg("注销失败");
        }
        return logOutResult;
    }
}
