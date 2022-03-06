package ch2.appevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext; //用来发布事件

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
