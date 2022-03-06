package ch2.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ch2")
@EnableAspectJAutoProxy//开启Spring对ASpectJ的支持
public class AopConfig {
}
