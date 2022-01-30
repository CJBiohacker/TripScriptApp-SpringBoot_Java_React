package com.singularitec.tripscript.controllers;

import com.singularitec.tripscript.models.Cliente;
import com.singularitec.tripscript.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                                             // Aciona o Controller e Response Body que troca dados em JSON e/ou XML.
@RequestMapping("/cliente")                                 // Mapeia os Responses para os métodos do Controller.
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/add")                                    // Mapeia os Requests de HTTP POST (CREATE) para os métodos locais.
    public String add(@RequestBody Cliente cliente) {
        clienteService.saveCliente(cliente);
        return "Um novo Cliente foi adicionado !";
    }
}

