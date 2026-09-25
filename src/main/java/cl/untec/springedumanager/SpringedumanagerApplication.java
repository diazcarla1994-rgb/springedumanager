package cl.untec.springedumanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cl.untec.springedumanager")
public class SpringedumanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringedumanagerApplication.class, args);
    }
}