package ch2.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect //声明一个切面
@Component
public class LogAspect {
//    声明切点
    @Pointcut("@annotation(ch2.aop.Action)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        System.out.println("注解式拦截："+annotation.name());
    }

//    @Before("execution(DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature  signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("方法规则式拦截"+signature.getMethod().getName());
    }
}
