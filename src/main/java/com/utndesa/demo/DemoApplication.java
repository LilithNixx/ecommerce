package com.utndesa.demo;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;


//import Entities.Oferta;
//import repository.OfertaRepository;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

	/*private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
	@Bean 
	public CommandLineRunner demo (OfertaRepository repository) {
		return (args) -> {
			//save offers
			repository.save(new Oferta 
			(descripcion:"yerba", stock:"10", codigoOferta:"01", precio: "500", vigencia: "02/02/24"));
			
			repository.save(new Oferta 
            (descripcion:"leche", stock:"10", codigoOferta:"02", precio: "100", vigencia: "02/02/24"));

		};
	}*/

}
