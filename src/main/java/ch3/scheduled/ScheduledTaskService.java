package ch3.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//每隔固定时间执行
    public void report(){
        System.out.println("每隔5s执行一次"+s.format(new Date()));
    }

    @Scheduled(cron = "0 14 17 * * ?" ) //linux下的定时任务
    public void fixTimeExecution(){
        System.out.println("在指定时间内执行"+s.format(new Date())+"执行");
    }
}
