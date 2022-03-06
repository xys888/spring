package ch3.aware;

import common.AnnotainUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = AnnotainUtils.getContext(AwareConfig.class);
        AwareService bean = context.getBean(AwareService.class);
        bean.outPutResult();
        context.close();
    }
}
