package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(Configure.class);
        Student s = (Student) factory.getBean(Student.class);
        System.out.println("studntName = "+s.getName()+", smarks = "+s.getMarks()+", sid = "+s.getId()+", smarks = "+s.getMarks()+"");
        Iterator<Map.Entry<Integer, String>> i = s.getCourses().entrySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
