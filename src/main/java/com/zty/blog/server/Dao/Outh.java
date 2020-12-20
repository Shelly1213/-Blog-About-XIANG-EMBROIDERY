package com.zty.blog.server.Dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface Outh {
    @Select("select num from likenum where id = 1")
    int getLike();

    @Update("update likenum set num = #{curr}" )
    void setLike(int curr);
}
