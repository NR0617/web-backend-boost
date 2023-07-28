package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // jdk5부터 지원
public class ApplicationConfig {
    @Bean
    public Car car(Engine e) {
        Car c = new Car();
        c.setEngine(e);
        return c;
    }

    @Bean
    public Engine engine() {
        return new Engine();
    }
}
