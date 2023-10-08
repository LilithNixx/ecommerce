package com.utndesa.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import Entities.Oferta;
import repository.OfertaRepository;


@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
	@Bean 
	public CommandLineRunner demo(OfertaRepository repository) {
		return (args) -> {
			//save offers
			repository.save(new Oferta(1L, "yerba", 20, 100, 500f));
			
			repository.save(new Oferta(2L, "leche", 23, 103, 300f));

			 // fetch all customers
			 log.info("Offers found with findAll():");
			 log.info("-------------------------------");
			 for (Oferta oferta : repository.findAll()) {
			   log.info(oferta.toString());
			 }
			 log.info("");

			 // fetch an individual offer by ID
			 Oferta oferta = repository.findById(1L);
			 log.info("Offer found with findById(1L):");
			 log.info("--------------------------------");
			 log.info(oferta.toString());
			 log.info("");

		};
	}

}
