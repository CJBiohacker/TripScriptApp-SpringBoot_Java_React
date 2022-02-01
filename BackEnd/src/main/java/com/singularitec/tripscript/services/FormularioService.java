package com.singularitec.tripscript.services;

import com.singularitec.tripscript.models.Formulario;

import java.util.List;

public interface FormularioService {
    Formulario saveFormulario(Formulario formulario);
    List<Formulario> getAllFormularios();
    Formulario getFormulario(Integer id);
    void deleteFormulario(Integer id);
}
