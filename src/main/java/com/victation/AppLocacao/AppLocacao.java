package com.victation.AppLocacao;

import com.victation.AppLocacao.model.domain.Carro;
import com.victation.AppLocacao.model.repository.CarroRepository;
import org.junit.Before;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AppLocacao {

    public static void main(String[] args) {
        SpringApplication.run(AppLocacao.class, args);
    }




    @Bean
    public CommandLineRunner run(CarroRepository carroRepository){
        System.out.println("--------------------CommandLineRunner------------------");
            return args -> {
        System.out.println("--------------------Inserindo no banco------------------");
                carroRepository.save(new Carro("BMW", "AFK-4000",4));

              List<Carro> carros = (List<Carro>) carroRepository.findAll();
              System.out.println(carros);


            };

    }





}

