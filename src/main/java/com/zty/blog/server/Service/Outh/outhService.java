package com.zty.blog.server.Service.Outh;

import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public interface outhService {

    SqlSession getSqlSession() throws IOException;

    int getLike() throws IOException;

    void setLike(int currnum) throws IOException;

}
