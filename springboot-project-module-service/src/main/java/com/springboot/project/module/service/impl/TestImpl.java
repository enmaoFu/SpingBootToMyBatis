package com.springboot.project.module.service.impl;

import com.springboot.project.module.mapper.TestMapper;
import com.springboot.project.module.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TestImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Map<String,Integer> test(Integer id) {
        return testMapper.testQueryId(id);
    }

}
