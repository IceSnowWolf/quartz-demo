package com.cn.quartz.service;

import java.util.List;

import com.cn.quartz.entity.User;

public interface ITestService {

    /**
     * 获取所有用户
     * 
     * @return 检索用户结果
     */
    public List<User> selectUserInfo();
}
