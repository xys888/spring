package ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from dev profile");
    }

    @Bean
    @Profile("test")
    public DemoBean testDemoBean(){
        return new DemoBean("from test profile");
    }
}
