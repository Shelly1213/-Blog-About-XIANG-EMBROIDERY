package com.zty.blog.server.Vo;

import com.zty.blog.server.Entity.ArtClass;
import com.zty.blog.server.Entity.HistoryClass;
import lombok.Data;

import java.util.List;

@Data
public class HistoryClassListObjResult {
    private int code;
    private String msg;
    private List<HistoryClass> data;
}
