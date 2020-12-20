package com.zty.blog.server.Dao;

import com.zty.blog.server.Entity.ArtClass;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Article {
    @Select("select * from classlistobject")
    List<ArtClass> getArtClassList();

    @Select("select * from classlistobject2")
    List<ArtClass> getArtClassList2();

}
