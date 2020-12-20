package com.zty.blog.server.Service.RegLogin;

import com.zty.blog.server.Entity.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public interface RegLogService {

    SqlSession getSqlSession() throws IOException;

    User getUserByEmail(String email) throws IOException;

    void insertUser(String name,String email,String pwd) throws IOException;
}
