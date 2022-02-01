package com.singularitec.tripscript.services;

import com.singularitec.tripscript.models.Viagem;
import com.singularitec.tripscript.repositories.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViagemServiceImplementation implements ViagemService {

    @Autowired                                          // Cria o vínculo automático entre o Repositório e o Serviço da Classe/Tabela Viagem.
    private ViagemRepository viagemRepository;

    @Override
    public Viagem saveViagem(Viagem viagem) {
        return viagemRepository.save(viagem);           // Método que permite realizar um Create/POST de uma nova Viagem no BD.
    }

    @Override
    public List<Viagem> getAllViagens() {               // Método que permite realizar um Read/GET de todos as Viagens no BD.
        return viagemRepository.findAll();
    }

    @Override
    public Viagem getViagem(Integer id) {               // Método que permite realizar um Read/GET de uma Viagem pelo id no BD.
        return viagemRepository.getById(id);
    }

    @Override
    public void deleteViagem(Integer id) {              // Método que permite realizar um Delete/DELETE de uma Viagem pelo id no BD.
        viagemRepository.deleteById(id);
    }


}
