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
    public Formulario saveFormulario(Formulario formulario) {
        return formularioRepository.save(formulario);           // Método que permite realizar um Create/POST de um novo Formulario no BD.
    }

    @Override
    public List<Formulario> getAllFormularios() {
        return formularioRepository.findAll();                  // Método que permite realizar um Read/GET de todos Formularios no BD.
    }
}
