package ch2.el;

import common.AnnotainUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 = AnnotainUtils.getContext(ElConfig.class);
        ElConfig bean = context1.getBean(ElConfig.class);
        bean.outputResoure();
        context1.close();

    }
}
