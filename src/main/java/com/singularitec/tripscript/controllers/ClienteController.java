package com.singularitec.tripscript.controllers;

import com.singularitec.tripscript.models.Cliente;
import com.singularitec.tripscript.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getAll")                                  // Mapeia os Requests de HTTP GET (READ) para os métodos locais.
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

}

