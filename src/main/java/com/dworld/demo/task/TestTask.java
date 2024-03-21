package com.dworld.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {
    @Scheduled(cron="0/5 * * * * ?")
    private void process(){
        System.out.println("定时任务测试");
    }
}
