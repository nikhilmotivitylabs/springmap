package com.employee;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.employee.Emp;
import com.employee.CollectionConfig;

import java.util.*;

@Configuration
public class CollectionConfig {
    List<String>l = new ArrayList<String>();
    HashSet<String> m=new HashSet<>();

    HashMap<String,String> n=new HashMap<>();




    @Bean
    public Emp getEmp(){
        return new Emp("nikhil",m1(),m2(),m3());

    }
    public ArrayList<String> m1()
    {
        l.add("985656");
        l.add("8989");
        return (ArrayList<String>) l;
    }

    public HashSet<String> m2(){
        m.add("mattewada");
        m.add("warangal");
        return (HashSet<String>) m;
    }

    public HashMap<String,String> m3(){
        n.put("react","java");

        return (HashMap<String, String>)  n;
    }

}
