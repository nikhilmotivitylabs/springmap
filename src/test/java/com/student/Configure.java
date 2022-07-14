package com.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
@Configuration
public class Configure {

    @Bean
    public Student getstudent() {
        return new Student(111, "nikhil", 500, Courses());
    }

    public Map Courses() {
        TreeMap<Integer, String> ob = new TreeMap<>();
        ob.put(1, "java");
        ob.put(2, "Mysql");
        ob.put(3, "Angular");
        ob.put(4, "React");
        return ob;
    }
}

