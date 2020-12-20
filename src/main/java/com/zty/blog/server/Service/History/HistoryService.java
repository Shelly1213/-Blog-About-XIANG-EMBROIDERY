package com.zty.blog.server.Service.History;

import com.zty.blog.server.Entity.HistoryClass;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public interface HistoryService {
    SqlSession getSqlSession() throws IOException;
    List<HistoryClass> getHistoryClass() throws IOException;
}
