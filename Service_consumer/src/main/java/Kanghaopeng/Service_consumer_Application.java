package Kanghaopeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service_consumer_Application {
    public static void main(String[] args) {
        SpringApplication.run(Service_consumer_Application.class,args);
    }
}
