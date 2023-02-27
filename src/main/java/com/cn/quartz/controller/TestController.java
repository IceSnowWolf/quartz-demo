package com.cn.quartz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.quartz.entity.User;
import com.cn.quartz.service.ITestService;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    /**
     * 数据库连接测试
     * 
     * @return 用户信息
     */
    @GetMapping("/init")
    public List<User> init() {

        List<User> result = testService.selectUserInfo();

        for (User user : result) {

            System.out.println(user.toString());
        }

        return result;
    }
}
