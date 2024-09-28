package org.dikkulah.sh.device.management.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShDeviceManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShDeviceManagementServiceApplication.class, args);
    }

}
