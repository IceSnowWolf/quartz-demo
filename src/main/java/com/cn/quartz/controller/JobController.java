package com.cn.quartz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.quartz.service.IJobService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/schedule")
public class JobController {

    @Autowired
    private IJobService jobService;

    @GetMapping("/add")
    public void addJob() {

        jobService.addJob();
        log.info("添加任务执行成功了。");
    }

    @GetMapping("/pause")
    public void pauseJob() {
        jobService.pauseJob();
        log.info("暂停任务job2。");
    }

    @GetMapping("/resume")
    public void resumeJob() {
        jobService.resumeJob();
        log.info("恢复任务job2.。");
    }

    @GetMapping("/delete")
    public void deleteJob() {
        jobService.deleteJob();
        log.info("删除任务job3");
    }
}
