package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    @Before("execution(public * models.Circle.getName())")
    public void loggingAdvice(){
        System.out.println("logging advice run. Get Method called");
    }
}
