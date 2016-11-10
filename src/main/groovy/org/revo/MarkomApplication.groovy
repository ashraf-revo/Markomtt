package org.revo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing

@SpringBootApplication
@EnableMongoAuditing
class MarkomApplication {
    static void main(String[] args) {
        SpringApplication.run MarkomApplication, args
    }
}