package com.cn.quartz.config;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class QuartzConfig {

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    public Scheduler scheduler() {

        return schedulerFactoryBean.getScheduler();
    }
}
