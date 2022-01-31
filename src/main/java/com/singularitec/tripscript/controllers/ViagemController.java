package com.singularitec.tripscript.controllers;

import com.singularitec.tripscript.models.Viagem;
import com.singularitec.tripscript.services.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                                                 // Aciona o Controller e Response Body que troca dados em JSON e/ou XML.
@RequestMapping("/viagem")                                      // Mapeia os Responses para os métodos do Controller.
public class ViagemController {

    @Autowired
    private ViagemService viagemService;

    @PostMapping("/add")                                        // Mapeia os Requests de HTTP POST (CREATE) para os métodos locais.
    public String add(@RequestBody Viagem viagem) {
        viagemService.saveViagem(viagem);
        return "Uma nova Viagem foi cadastrada !";
    }

    @GetMapping("/getAll")                                      // Mapeia os Requests de HTTP GET (READ) para os métodos locais.
    public List<Viagem> getAllViagens() {
        return viagemService.getAllViagens();
    }
}
