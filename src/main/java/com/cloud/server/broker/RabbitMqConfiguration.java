package com.cloud.server.broker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.function.Consumer;

@Configuration
@Slf4j
public class RabbitMqConfiguration {

//    Random random = new Random();

//    @Bean
//    public Supplier<Flux<Integer>> fizzBuzzProducer(){
//        return () -> Flux.interval(Duration.ofSeconds(1)).map(value -> random.nextInt(15) + 1).log();
//    }


//    @Bean
//    public Function<Flux<Integer>, Flux<String>> fizzBuzzProcessor(){
//        return longFlux -> longFlux
//                .map(this::evaluateFizzBuzz)
//                .log();
//    }


    @Bean
    public Consumer<String> eventBuzz1Consumer(){
        return (value) -> log.info("Consumer Test Received : " + value);
    }

    @Bean
    public Consumer<String> eventBuzz2Consumer(){
        return (value) -> log.info("Consumer Test Received : " + value);
    }
}
