import models.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.ShapeService;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        Circle circle = shapeService.getCircle();
        circle.setName("Circle name");
        circle.setNameAndReturn("Circle Return");
        circle.setNameAndThrowingException("Circle throw exception");
    }
}
