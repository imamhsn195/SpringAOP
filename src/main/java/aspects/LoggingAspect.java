package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    @Before("allModelsGet()")
    public void loggingModelAdvice(){
        System.out.println("First advice of models");
    }
    @Before("allModelsGet()")
    public void loggingModelSecondAdvice(){
        System.out.println("Second advice of models");
    }
    @Before("allServiceGet()")
    public void loggingServiceAdvice(){
        System.out.println("First advice of shapeService class");
    }

    @Pointcut("execution(* *.get*())")
    public void allModelsGet(){}

    @Pointcut("execution(* services.ShapeService.get*())")
    public void allServiceGet(){}
}
