package com.zty.blog.server.Controller;

import com.zty.blog.server.Entity.ArtClass;
import com.zty.blog.server.Service.Article.artServiceImp;
import com.zty.blog.server.Vo.ArtClassListObjResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("article")
public class ArtController {

    @Autowired
    private artServiceImp artServiceImp;

    @RequestMapping("ArtClassData")
    public ArtClassListObjResult getArtClassList() throws IOException {

        ArtClassListObjResult artClassListObjResult = new ArtClassListObjResult();
        List<ArtClass> artClasses = artServiceImp.getArtClasses();
//        System.out.println(artClasses.toString());
        if(artClasses!=null){
            artClassListObjResult.setCode(1001);
            artClassListObjResult.setMsg("查询成功");
            artClassListObjResult.setData(artClasses);
        }
        else {
            artClassListObjResult.setCode(1002);
            artClassListObjResult.setMsg("查询失败");
        }
        return artClassListObjResult;
    }

    @RequestMapping("ArtClassData2")
    public ArtClassListObjResult getArtClassList2() throws IOException {

        ArtClassListObjResult artClassListObjResult = new ArtClassListObjResult();
        List<ArtClass> artClasses = artServiceImp.getArtClasses2();
//        System.out.println(artClasses.toString());
        if(artClasses!=null){
            artClassListObjResult.setCode(1001);
            artClassListObjResult.setMsg("查询成功");
            artClassListObjResult.setData(artClasses);
        }
        else {
            artClassListObjResult.setCode(1002);
            artClassListObjResult.setMsg("查询失败");
        }
        return artClassListObjResult;
    }

}
