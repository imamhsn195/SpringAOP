package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
   @After("args(name)")
   public void stringArgumentMethods(String name){
       System.out.println("After advice called. " + name);
   }

   @AfterReturning(pointcut = "args(name)", returning = "returningString")
    public void returningStringMethod(String name, String returningString){
       System.out.println("AfterReturning advice called. " + returningString);
   }

   @AfterThrowing(pointcut = "args(name)", throwing = "ex")
   public void throwingException(String name, Exception ex){
      System.out.println("AfterThrowing exception advice called." + ex);
   }

}
