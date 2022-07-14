package Collage;

import Collage.Configure;
import Collage.Student1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(Configure.class);
        Student1 s = (Student1) factory.getBean("student",Student1.class);
        System.out.println(s);
    }
}
