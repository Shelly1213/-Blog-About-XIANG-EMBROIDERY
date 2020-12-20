package com.zty.blog.server.Controller;

import com.zty.blog.server.Entity.HistoryClass;
import com.zty.blog.server.Service.History.HistoryServiceImp;
import com.zty.blog.server.Vo.HistoryClassListObjResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("nav")
public class NavController {
    @Autowired
    private HistoryServiceImp historyServiceImp;

    @RequestMapping("/navMenList")
    public HistoryClassListObjResult getHistoryList() throws IOException {
        HistoryClassListObjResult historyClassListObjResult = new HistoryClassListObjResult();
        List<HistoryClass> historyClass = historyServiceImp.getHistoryClass();
        if(historyClass!=null){
            historyClassListObjResult.setCode(1001);
            historyClassListObjResult.setMsg("查询成功");
            historyClassListObjResult.setData(historyClass);
        }
        else {
            historyClassListObjResult.setCode(1002);
            historyClassListObjResult.setMsg("查询失败");
        }
        return historyClassListObjResult;

    }
}
