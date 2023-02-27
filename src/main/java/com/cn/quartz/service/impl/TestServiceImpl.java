package com.cn.quartz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.quartz.entity.User;
import com.cn.quartz.mapper.TestMapper;
import com.cn.quartz.service.ITestService;

@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<User> selectUserInfo() {

        return testMapper.selectUserInfo();
    }

}
