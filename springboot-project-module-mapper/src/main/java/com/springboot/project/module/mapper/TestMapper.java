package com.springboot.project.module.mapper;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface TestMapper {

    Map<String,Integer> testQueryId(Integer id);

}
