package com.zty.blog.server.Dao;

import com.zty.blog.server.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface RegLogUser {
    @Select("select name,email,pwd from userinfo where email like #{email}")
    User getUserByEmail(String email);

    @Insert("insert into userinfo values(#{name},#{email},#{pwd})")
    void insertUser(String name,String email,String pwd);


}
