import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.ShapeService;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        System.out.println("Triangle name" + shapeService.getTriangle().getName());
        System.out.println("Circle name" + shapeService.getCircle().getName());
    }
}
