package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.employee.Emp;
import com.employee.CollectionConfig;

public class Main {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(CollectionConfig.class);
        Emp s = (Emp) factory.getBean(Emp.class);

        System.out.println(s);
    }
}
