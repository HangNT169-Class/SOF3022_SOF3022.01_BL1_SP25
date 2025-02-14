package com.poly.sof3022.B10_DatLich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TestDemoService {

    @Autowired
    private DemoService service;

//    @Scheduled(fixedDelay = 2000) // 2s
    @Scheduled(cron = "* * * * * *")
    // https://crontab.guru/#*_9_*_*_*
    // https://hocspringboot.net/2020/12/26/spring-batch-la-gi/
    // https://hocspringboot.net/2020/10/29/cron-job-la-gi/
    // https://www.baeldung.com/spring-scheduled-tasks
    public void testDatLich(){
        service.datChuongBaoThuc();
    }
}
