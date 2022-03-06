package ch3.executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    @Async //异步方法
    public void executorAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1："+(i+1));
    }
}
