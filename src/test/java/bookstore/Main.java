package bookstore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(Configure.class);
        Category c = (Category) factory.getBean(Category.class);
        System.out.println(c.getCname()+" "+c.getJava().getBid()+" "+c.getJava().getBname()+" "+c.getJava().getPrice());
    }
}
