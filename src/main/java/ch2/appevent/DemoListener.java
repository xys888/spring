package ch2.appevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//事件监听器
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
//    使用此方法对消息进行接收处理
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我xys接收到了demo-publisher发送的消息："+msg);
    }
}
