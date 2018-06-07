package com.agent.rater.configuration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.agent.rater"})
@ComponentScan()//basePackages={"com.agent.rater"}
@EntityScan(basePackages={"com.agent.rater"})
@EnableJpaRepositories(basePackages={"com.agent.rater"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

