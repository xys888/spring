package ch2.appevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher bean = context.getBean(DemoPublisher.class);
        bean.publish("xyxyxyxxyyxyxyxyxy");

        context.close();
    }
}
