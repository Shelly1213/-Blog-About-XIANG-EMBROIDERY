package com.zty.blog.server.Vo;

import com.zty.blog.server.Entity.ArtClass;
import lombok.Data;

import java.util.List;

@Data
public class ArtClassListObjResult {
    private int code;
    private String msg;
    private List<ArtClass> data;
}
