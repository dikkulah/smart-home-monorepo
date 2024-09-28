package org.dikkulah.shconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ShConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShConfigServerApplication.class, args);
    }

}
