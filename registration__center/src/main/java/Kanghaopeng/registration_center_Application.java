package Kanghaopeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class registration_center_Application {
    public static void main(String[] args) {
        SpringApplication.run(registration_center_Application.class, args);
    }
}
