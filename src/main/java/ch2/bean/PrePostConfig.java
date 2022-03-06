package ch2.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ch2/bean")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destory") //指定init和destory方法在构造方法治好bean销毁之前执行
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
