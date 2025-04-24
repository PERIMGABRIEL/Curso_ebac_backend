package com.example.carros.config;

import com.example.carros.model.*;
import com.example.carros.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(MarcaRepository marcaRepo, CarroRepository carroRepo, AcessorioRepository acessorioRepo) {
        return args -> {
            Marca fiat = new Marca();
            fiat.setNome("Fiat");
            marcaRepo.save(fiat);

            Acessorio som = new Acessorio();
            som.setNome("Som");
            Acessorio ar = new Acessorio();
            ar.setNome("Ar-condicionado");

            acessorioRepo.save(som);
            acessorioRepo.save(ar);

            Carro uno = new Carro();
            uno.setModelo("Uno");
            uno.setAno(2015);
            uno.setMarca(fiat);
            uno.setAcessorios(Set.of(som, ar));

            carroRepo.save(uno);
        };
    }
}

