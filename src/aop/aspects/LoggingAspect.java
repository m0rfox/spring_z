package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " + myBook.getName() +
                            ", автор - " + myBook.getAuthor() +
                            ", год издания - " + myBook.getYearOfPublication());
                }
                else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }
        System.out.println("beforeAddBoorAdvice: логирование попытки получить книгу/журнал");
        System.out.println("--------------------------------");
    }
}
