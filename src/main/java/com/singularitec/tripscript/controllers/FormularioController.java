package com.singularitec.tripscript.controllers;

import com.singularitec.tripscript.models.Formulario;
import com.singularitec.tripscript.models.Formulario;
import com.singularitec.tripscript.services.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController                                                                         // Aciona o Controller e Response Body que troca dados em JSON e/ou XML.
@RequestMapping("/formulario")                                                          // Mapeia os Responses para os métodos do Controller.
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @PostMapping("/add")                                                                // Mapeia os Requests de HTTP POST (CREATE) para os métodos locais.
    public String add(@RequestBody Formulario formulario) {
        formularioService.saveFormulario(formulario);
        return "<h1>Um novo Formulario foi preenchido !</h1>";
    }

    @GetMapping("/getAll")                                                              // Mapeia os Requests de HTTP GET (READ) para os métodos locais.
    public List<Formulario> getAllFormularios() {
        return formularioService.getAllFormularios();
    }

    @GetMapping("/{id}")                                                                // Mapeia os Requests de HTTP GET (READ) por id para os métodos locais.
    public ResponseEntity<Formulario> get(@PathVariable Integer id) {
        try {                                                                           // Bloco try - Situação onde o id de formulario é encontrado
            Formulario formulario = formularioService.getFormulario(id);
            return new ResponseEntity<Formulario>(formulario, HttpStatus.OK);

        } catch (NoSuchElementException e) {                                            // Bloco catch - Situação de exceção onde o id não é encontrado.
            return new ResponseEntity<Formulario>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Formulario> update(@RequestBody Formulario formulario,        // Mapeia os Requests de HTTP PUT (UPDATE) por id para os métodos locais.
                                          @PathVariable Integer id) {
        try {                                                                           // Bloco try - Situação onde o id do Formulario é encontrado
            Formulario existingFormulario = formularioService.getFormulario(id);
            formularioService.saveFormulario(formulario);
            return new ResponseEntity<Formulario>(HttpStatus.OK);

        } catch (NoSuchElementException e){                                             // Bloco catch - Situação de exceção onde o id não é encontrado.
            return new ResponseEntity<Formulario>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")                                                      // Mapeia os Requests de HTTP DELETE (DELETE) por id para os métodos locais.
    public String delete(@PathVariable Integer id){
        formularioService.deleteFormulario(id);
        return "<h1>Formulário de id " + id + " deletado !</h1>";
    }
}
