package ch3.scheduled;

import ch3.executor.TaskExecutorConfig;
import common.AnnotainUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = AnnotainUtils.getContext(TaskSchedulerConfig.class);
    }
}
