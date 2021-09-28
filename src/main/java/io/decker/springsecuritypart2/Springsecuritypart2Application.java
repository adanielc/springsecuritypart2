package io.decker.springsecuritypart2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({@ComponentScan("io.decker.controller"), @ComponentScan("io.decker.config")})
@EnableJpaRepositories("io.decker.repository")
@EntityScan("io.decker.model")
public class Springsecuritypart2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springsecuritypart2Application.class, args);
    }

}
