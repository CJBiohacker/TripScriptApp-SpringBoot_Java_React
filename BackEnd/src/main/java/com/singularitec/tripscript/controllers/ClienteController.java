package com.singularitec.tripscript.controllers;

import com.singularitec.tripscript.models.Cliente;
import com.singularitec.tripscript.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController                                                                 // Aciona o Controller e Response Body que troca dados em JSON e/ou XML.
@RequestMapping("/cliente")                                                     // Mapeia os Responses para os métodos do Controller.
//@CrossOrigin(origins = "*")                                                    // Permite que ocorra CORS (Compartilhamento de recursos com origens diferentes) de aplicações diferentes via HTTP/S. (Ex.: Um POST via React)
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/add")                                                        // Mapeia os Requests de HTTP POST (CREATE) para os métodos locais.
    public String add(@RequestBody Cliente cliente) {
        clienteService.saveCliente(cliente);
        return "<h1>Um novo Cliente foi adicionado !</h1>";
    }

    @GetMapping("/getAll")                                                      // Mapeia os Requests de HTTP GET (READ) para os métodos locais.
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")                                                        // Mapeia os Requests de HTTP GET (READ) por id para os métodos locais.
    public ResponseEntity<Cliente> get(@PathVariable Integer id) {
        try {                                                                   // Bloco try - Situação onde o id de cliente é encontrado
            Cliente cliente = clienteService.getCliente(id);
            return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);

        } catch (NoSuchElementException e) {                                    // Bloco catch - Situação de exceção onde o id não é encontrado.
            return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente,         // Mapeia os Requests de HTTP PUT (UPDATE) por id para os métodos locais.
                                          @PathVariable Integer id) {
        try {                                                                   // Bloco try - Situação onde o id de cliente é encontrado
            Cliente existingCliente = clienteService.getCliente(id);
            clienteService.saveCliente(cliente);
            return new ResponseEntity<Cliente>(HttpStatus.OK);

        } catch (NoSuchElementException e){                                     // Bloco catch - Situação de exceção onde o id não é encontrado.
            return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")                                              // Mapeia os Requests de HTTP DELETE (DELETE) por id para os métodos locais.
    public String delete(@PathVariable Integer id){
        clienteService.deleteCliente(id);
        return "<h1>Cliente de id " + id + " deletado !</h1>";
    }
}

