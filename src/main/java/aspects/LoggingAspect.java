package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    @Before("execution(* *.get*())")
    public void loggingAdvice(){
        System.out.println("logging advice run. Get Method called");
    }
    @Before("execution(* services.ShapeService.get*())")
    public void secondLoggingAdvice(){
        System.out.println("Second logging advice run. Get Method called from shapeService class");
    }
}
