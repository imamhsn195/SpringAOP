import models.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.ShapeService;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        shapeService.getCircle().setName("Another Circle");
        Circle circle = shapeService.getCircle();
        System.out.println("Shape name " + circle.getName());
    }
}
