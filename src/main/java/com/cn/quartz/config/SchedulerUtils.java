package com.cn.quartz.config;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;

import com.cn.quartz.entity.TestJob;

public class SchedulerUtils {

    public static JobDetail getJob(String jobName, String groupName) {
        JobDetail jobDetail = JobBuilder.newJob(TestJob.class).withIdentity(jobName, groupName).build();

        return jobDetail;
    }

    public static Trigger getTrigger(String triggerName, String triggerGroupName, String cronExpression) {

        CronScheduleBuilder schedBuilder = CronScheduleBuilder.cronSchedule(cronExpression);

        Trigger trigger = TriggerBuilder.newTrigger().withIdentity(triggerName, triggerGroupName)
                .withSchedule(schedBuilder).build();

        return trigger;
    }

}
