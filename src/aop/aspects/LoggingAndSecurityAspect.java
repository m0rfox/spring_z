package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineMethodsFromUniLibrary(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineMethodsFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){}

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
        public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
    }
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary() ")
//    private void allReturnsAndGetMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//        public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//        public void  beforeReturnMethodsFromUniLibrary(){
//        System.out.println("beforeReturnMethodsFromUniLibrary: writing Log #2");
//    }
//
//    @Before("allReturnsAndGetMethodsFromUniLibrary()")
//    public void  beforeReturnAndGetMethodsFromUniLibrary(){
//        System.out.println("BeforeReturnAndGetMethodsFromUniLibrary: writing Log #3");
//    }


//
//    @Pointcut("execution( * get*())")
//    private void allGetMethods(){}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetBoorAdvice: попытка получить" +
//                " книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка прав " +
//                "на получение книги/журнала");
//    }
}
