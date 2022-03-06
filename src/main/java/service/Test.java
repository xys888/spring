package service;

import ch2.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        UseTestService bean = configApplicationContext.getBean(UseTestService.class);
        System.out.println(bean.SayHello("java config"));
        configApplicationContext.close();
    }
}
