package puebra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {


    @GetMapping("/convertir/{galones}")
    public String convertirALitros(@PathVariable double galones){
        var litros = galones * 3.7841;
        return "La cantidad de litros equivalentes a: " + galones + " galones " + " es de " + litros + " litros.";
    }
}
