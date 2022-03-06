package ch3.annotation;

import common.AnnotainUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = AnnotainUtils.getContext(DemoConfig.class);
        DemoService bean = context.getBean(DemoService.class);
        bean.outputResult();
        context.close();
    }
}
