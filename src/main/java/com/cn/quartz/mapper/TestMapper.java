package com.cn.quartz.mapper;

import java.util.List;

import com.cn.quartz.entity.User;

public interface TestMapper {

    /**
     * 获取所有用户
     * 
     * @return 检索用户结果
     */
    public List<User> selectUserInfo();
}
