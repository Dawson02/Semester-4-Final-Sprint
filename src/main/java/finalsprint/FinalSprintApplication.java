package finalsprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="http://localhost:3000")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class FinalSprintApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalSprintApplication.class, args);
    }
}