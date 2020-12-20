package com.zty.blog.server.Controller;

import com.zty.blog.server.Vo.UserInfoChangeResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("Userinfo")
public class UserInfoController {
    @RequestMapping("UploadImg")
    public UserInfoChangeResult pushPicture(){
        return new UserInfoChangeResult(1001,"没问题","1");
    }

}
