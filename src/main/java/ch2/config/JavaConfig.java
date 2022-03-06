package ch2.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.TestService;
import service.UseTestService;

@Configuration
public class JavaConfig {

//    @Bean
    public TestService testService(){
        return new TestService();
    }

//    @Bean
    public UseTestService useTestService(){
        UseTestService useTestService = new UseTestService();
        useTestService.setTestService(testService());
        return useTestService;
    }
    @Bean
    public UseTestService useTestService(TestService testService){
        UseTestService useTestService=new UseTestService();
        useTestService.setTestService(testService);
        return useTestService;
    }


}
