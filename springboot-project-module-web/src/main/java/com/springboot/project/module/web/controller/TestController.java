package com.springboot.project.module.web.controller;

import com.springboot.project.module.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "test", method = {RequestMethod.GET, RequestMethod.POST})
public class TestController {

    @Autowired
    private TestApi testApi;

    @ResponseBody
    @RequestMapping("/queryId")
    public String queryId(int id) {
        return testApi.queryIdApi(id);
    }
}
