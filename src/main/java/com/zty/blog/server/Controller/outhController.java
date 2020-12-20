package com.zty.blog.server.Controller;


import com.zty.blog.server.Service.Outh.outhServiceImp;
import com.zty.blog.server.Vo.LikeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("outh")
public class outhController {

    @Autowired
    private outhServiceImp outhServiceImp;

    @RequestMapping("/showLikeData")
    public LikeResult showLikeData() throws IOException {
        LikeResult likeResult = new LikeResult();

        int likenum = outhServiceImp.getLike();
        //查询成功
        if (likenum >= 0) {
            likeResult.setCode(1001);
            likeResult.setData(likenum);
            return likeResult;
        } else {
            likeResult.setCode(1010);
            return likeResult;
        }
    }

    @RequestMapping("/GetLike")
    public LikeResult getLike(@RequestParam("like_num") int likenum) throws IOException {
//        System.out.println(likenum);
        LikeResult likeResult = new LikeResult();
        likeResult.setCode(1001);
        outhServiceImp.setLike(likenum);
        return likeResult;
    }
}
