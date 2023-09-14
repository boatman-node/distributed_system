package Kanghaopeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class service_provider_Application {
    public static void main(String[] args) {
        SpringApplication.run(service_provider_Application.class,args);
    }
}
