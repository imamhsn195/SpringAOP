package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    @Before("allGetMethods() && allCircleMethods()")
    public void loggingAllGetMethodsAdvice(){
        System.out.println("All get methods advice.");
    }

//    @Before("allCircleMethods()")
//    public void loggingAllCircleMethods(){
//        System.out.println("All Circle class Methods");
//    }

    @Pointcut("execution(* *.get*())")
    public void allGetMethods(){}

    @Pointcut("within(models.Circle)")
    public void allCircleMethods(){}
}
