package com.zty.blog.server.Dao;

import com.zty.blog.server.Entity.HistoryClass;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface History {
    @Select("select * from historylistobject")
    List<HistoryClass> getHistoryClass();
}
