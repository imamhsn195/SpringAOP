package aspects;

import models.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
   @Before("allMethodsCircle()")
    public void adviceAllMethodCircle(JoinPoint joinPoint){
//       Circle circle = (Circle) joinPoint.getTarget();
//       System.out.println(joinPoint.getTarget());
   }

   @Before("args(name)")
   public void stringArgumentMethods(String name){
       System.out.println("Advice printed that takes String arguments " + name);
   }

   @Pointcut("within(models.Circle)")
    public void allMethodsCircle(){}
}
