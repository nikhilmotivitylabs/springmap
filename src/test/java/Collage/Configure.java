package Collage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class Configure {


    @Bean("student")
    public Student1 getStudent(){
        return new Student1(111,"nikhil","wgl");
    }

}
