package com.singularitec.tripscript.controllers;

import com.singularitec.tripscript.models.Formulario;
import com.singularitec.tripscript.models.Formulario;
import com.singularitec.tripscript.services.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                                                 // Aciona o Controller e Response Body que troca dados em JSON e/ou XML.
@RequestMapping("/formulario")                                  // Mapeia os Responses para os métodos do Controller.
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @PostMapping("/add")                                        // Mapeia os Requests de HTTP POST (CREATE) para os métodos locais.
    public String add(@RequestBody Formulario formulario) {
        formularioService.saveFormulario(formulario);
        return "Um novo Formulario foi preenchido !";
    }

    @GetMapping("/getAll")                                      // Mapeia os Requests de HTTP GET (READ) para os métodos locais.
    public List<Formulario> getAllFormularios() {
        return formularioService.getAllFormularios();
    }
}
