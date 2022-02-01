package com.singularitec.tripscript.services;

import com.singularitec.tripscript.models.Formulario;
import com.singularitec.tripscript.repositories.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioServiceImplementation implements FormularioService {

    @Autowired                                                  // Cria o vínculo automático entre o Repositório e o Serviço da Classe/Tabela Formulario.
    private FormularioRepository formularioRepository;

    @Override
    public Formulario saveFormulario(Formulario formulario) {   // Método que permite realizar um Create/POST de um novo Formulario no BD.
        return formularioRepository.save(formulario);
    }

    @Override
    public List<Formulario> getAllFormularios() {               // Método que permite realizar um Read/GET de todos Formularios no BD.
        return formularioRepository.findAll();
    }

    @Override
    public Formulario getFormulario(Integer id) {               // Método que permite realizar um Read/GET de um Formulario pelo id no BD.
        return formularioRepository.getById(id);
    }

    @Override
    public void deleteFormulario(Integer id) {                  // Método que permite realizar um Delete/DELETE de um Formulario pelo id no BD.
        formularioRepository.deleteById(id);
    }
}
