package com.dworld.demo.controller;

import com.dworld.demo.entity.Testd;
import com.dworld.demo.mapper.TestdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestdController {
    @Autowired
    private TestdMapper testdMapper;

    @GetMapping("test")
    public void test(){
        System.out.println(("----- selectAll method test ------"));
        List<Testd> userList = testdMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
