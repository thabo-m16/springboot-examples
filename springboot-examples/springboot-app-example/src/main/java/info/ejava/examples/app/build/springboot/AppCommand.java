package info.ejava.examples.app.build.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AppCommand implements CommandLineRunner{
    public void run(String[] args) throws Exception{
        System.out.println("Component code says Hello " + List.of(args));
    }
}