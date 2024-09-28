package org.dikkulah.smarthomegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SmartHomeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartHomeGatewayApplication.class, args);
    }
}
