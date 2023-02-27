package com.cn.quartz.service;

public interface IJobService {

    /**
     * 添加任务
     */
    public void addJob();

    /**
     * 暂停任务
     */
    public void pauseJob();

    /**
     * 恢复任务
     */
    public void resumeJob();

    /**
     * 删除任务
     */
    public void deleteJob();

    /**
     * 启动所有任务
     */
    public void startAllJobs();

    /**
     * 删除所有任务
     */
    public void deleteAllJobs();
}
