package com.rapitskyi.flashcards;

import com.rapitskyi.flashcards.repository.FlashCardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlashCardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashCardsApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(FlashCardRepository flashCardRepository) {
        return args -> {
            System.out.println("Пігнали!!!");
        };
    }

}
