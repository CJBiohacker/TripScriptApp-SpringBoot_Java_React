package com.singularitec.tripscript.controllers;

import com.singularitec.tripscript.models.Viagem;
import com.singularitec.tripscript.models.Viagem;
import com.singularitec.tripscript.models.Viagem;
import com.singularitec.tripscript.services.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController                                                                 // Aciona o Controller e Response Body que troca dados em JSON e/ou XML.
@RequestMapping("/viagem")                                                      // Mapeia os Responses para os métodos do Controller.
public class ViagemController {

    @Autowired
    private ViagemService viagemService;

    @PostMapping("/add")                                                        // Mapeia os Requests de HTTP POST (CREATE) para os métodos locais.
    public String add(@RequestBody Viagem viagem) {
        viagemService.saveViagem(viagem);
        return "<h1>Uma nova Viagem foi cadastrada !</h1>";
    }

    @GetMapping("/getAll")                                                      // Mapeia os Requests de HTTP GET (READ) para os métodos locais.
    public List<Viagem> getAllViagens() {
        return viagemService.getAllViagens();
    }

    @GetMapping("/{id}")                                                        // Mapeia os Requests de HTTP GET (READ) por id para os métodos locais.
    public ResponseEntity<Viagem> get(@PathVariable Integer id) {
        try {                                                                   // Bloco try - Situação onde o id de viagem é encontrado
            Viagem viagem = viagemService.getViagem(id);
            return new ResponseEntity<Viagem>(viagem, HttpStatus.OK);

        } catch (NoSuchElementException e) {                                    // Bloco catch - Situação de exceção onde o id não é encontrado.
            return new ResponseEntity<Viagem>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Viagem> update(@RequestBody Viagem viagem,            // Mapeia os Requests de HTTP PUT (UPDATE) por id para os métodos locais.
                                             @PathVariable Integer id) {
        try {                                                                   // Bloco try - Situação onde o id do Viagem é encontrado
            Viagem existingViagem = viagemService.getViagem(id);
            viagemService.saveViagem(viagem);
            return new ResponseEntity<Viagem>(HttpStatus.OK);

        } catch (NoSuchElementException e){                                     // Bloco catch - Situação de exceção onde o id não é encontrado.
            return new ResponseEntity<Viagem>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")                                                     // Mapeia os Requests de HTTP DELETE (DELETE) por id para os métodos locais.
    public String delete(@PathVariable Integer id){
        viagemService.deleteViagem(id);
        return "<h1>Viagem de id " + id + " deletada !</h1>";
    }
}
