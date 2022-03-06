package ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsConditional.class)
    public LisetService windowsListService(){
        return new WindowsListService();
    }
    @Bean
    @Conditional(LinuxCoditional.class)
    public LisetService linuxListService(){
        return new LinxuListservice();
    }
}
