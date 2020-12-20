package com.springboot.project.module.api;

import com.springboot.project.module.service.TestService;
import com.springboot.project.module.utils.BaseJsonData;
import com.springboot.project.module.utils.BaseJsonDataCode;
import com.springboot.project.module.utils.GsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TestApi implements BaseJsonDataCode{

    @Autowired
    private TestService testService;

    public String queryIdApi(Integer id){
        Map<String,Integer> map = testService.test(id);
        return GsonUtils.toJson(new BaseJsonData(SUCCESS, SUCCESS_MSG, map));
    }

}
