package ch3.executor;

import common.AnnotainUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.event.AncestorEvent;

public class Main {
//    结果是并发执行的
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = AnnotainUtils.getContext(TaskExecutorConfig.class);
        AsyncTaskService bean = context.getBean(AsyncTaskService.class);
        for(int i=0;i<10;i++){
            bean.executorAsyncTask(i);
            bean.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
