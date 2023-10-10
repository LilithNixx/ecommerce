package controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class OfertaController {

    @GetMapping("/")
    public String inicio() {
        return "Oferta";
    }
    
}
