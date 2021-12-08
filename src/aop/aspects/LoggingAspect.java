package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*())")
    public void beforeGetBoorAdvice(){
        System.out.println("beforeGetBoorAdvice: попытка получить книгу");
    }

    @Before("execution(public void returnBook())")
    public void beforeReturnBoorAdvice(){
        System.out.println("beforeReturnBoorAdvice: попытка вернуть книгу");
    }
}
