package ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService bean1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService bean2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService bean3 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService bean4 = context.getBean(DemoPrototypeService.class);
        System.out.println(bean1.equals(bean2));
        System.out.println(bean3.equals(bean4));

    }
}
