package com.cn.quartz.service.impl;

import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.quartz.config.SchedulerUtils;
import com.cn.quartz.service.IJobService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class JobServiceImpl implements IJobService {

    @Autowired
    private Scheduler scheduler;

    @Override
    public void addJob() {
        JobDetail job1 = SchedulerUtils.getJob("job1", "group1");
        Trigger trigger1 = SchedulerUtils.getTrigger("trigger1", "triggerGroup1", "*/10 * * * * ?");
        JobDetail job2 = SchedulerUtils.getJob("job2", "group2");
        Trigger trigger2 = SchedulerUtils.getTrigger("trigger2", "triggerGroup2", "*/10 * * * * ?");
        JobDetail job3 = SchedulerUtils.getJob("job3", "group3");
        Trigger trigger3 = SchedulerUtils.getTrigger("trigger3", "triggerGroup3", "*/10 * * * * ?");

        try {
            scheduler.scheduleJob(job1, trigger1);
            scheduler.scheduleJob(job2, trigger2);
            scheduler.scheduleJob(job3, trigger3);
        } catch (SchedulerException e) {
            log.error("定时任务添加失败");
        }
    }

    @Override
    public void pauseJob() {
        JobKey jobKey = JobKey.jobKey("job2", "group2");

        try {
            scheduler.pauseJob(jobKey);
        } catch (SchedulerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void resumeJob() {
        JobKey jobKey = JobKey.jobKey("job2", "group2");

        try {
            scheduler.resumeJob(jobKey);
        } catch (SchedulerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void deleteJob() {
        JobKey jobKey = JobKey.jobKey("job3", "group3");

        try {
            scheduler.deleteJob(jobKey);
        } catch (SchedulerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void startAllJobs() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAllJobs() {
        // TODO Auto-generated method stub

    }

}
