package common;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotainUtils {

    public static AnnotationConfigApplicationContext getContext(Class<?>... classes){
       return new AnnotationConfigApplicationContext(classes);
    }

}
