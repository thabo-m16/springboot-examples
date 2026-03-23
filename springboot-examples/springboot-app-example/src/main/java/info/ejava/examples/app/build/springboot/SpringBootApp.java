package info.ejava.examples.app.build.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp{
    public static void main(String[] args){
        System.out.println("Running SpringApplication");
        SpringApplication.run(SpringBootApp.class, args);
        System.out.println("End of application");
    }
}