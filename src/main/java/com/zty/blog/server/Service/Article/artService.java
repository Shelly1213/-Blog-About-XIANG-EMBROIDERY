package com.zty.blog.server.Service.Article;

import com.zty.blog.server.Entity.ArtClass;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public interface artService {
    SqlSession getSqlSession() throws IOException;

    List<ArtClass> getArtClasses() throws IOException;

    List<ArtClass> getArtClasses2() throws IOException;

}
