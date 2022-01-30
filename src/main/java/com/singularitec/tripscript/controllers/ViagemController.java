package com.singularitec.tripscript.controllers;

import com.singularitec.tripscript.models.Viagem;
import com.singularitec.tripscript.services.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
