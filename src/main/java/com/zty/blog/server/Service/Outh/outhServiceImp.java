package com.zty.blog.server.Service.Outh;

import com.zty.blog.server.Dao.Outh;
import com.zty.blog.server.Dao.RegLogUser;
import com.zty.blog.server.Entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class outhServiceImp implements outhService {

    @Override
    public SqlSession getSqlSession() throws IOException {
        String resource = "mybatis-config.xml";//通过流处理获取sqlSessionFactory创建一个实例
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();//获取SqlSession实例
        return session;
    }
    @Override
    public int getLike() throws IOException {
        SqlSession sqlSession=getSqlSession();
        int num = sqlSession.getMapper(Outh.class).getLike();
//        System.out.println(num);
        return num;
    }

    @Override
    public void setLike(int currnum) throws IOException {
        SqlSession sqlSession=getSqlSession();
        //+1表示点赞
        sqlSession.getMapper(Outh.class).setLike(currnum);
        sqlSession.commit();
        sqlSession.close();
    }


}
