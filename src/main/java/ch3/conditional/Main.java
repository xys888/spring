package ch3.conditional;

import common.AnnotainUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = AnnotainUtils.getContext(ConditionConfig.class);

        LisetService bean = context.getBean(LisetService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令为："+
                bean.showListCmd());
    }
}
