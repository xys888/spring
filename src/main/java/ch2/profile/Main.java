package ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);//后置注册bean配置类
        context.refresh();//刷新容器
        DemoBean bean = context.getBean(DemoBean.class);
        System.out.println(bean.getContent());
        context.close();
    }
}
