package bookstore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
@Configuration
public class Configure {

    @Bean
    public Book getBook() {
        return new Book(333,"React",600);
    }
    @Bean
    public Category get(){
        return new Category("Programming");
    }
}
