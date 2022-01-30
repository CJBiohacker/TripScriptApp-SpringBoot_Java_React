package com.singularitec.tripscript.services;

import com.singularitec.tripscript.models.Viagem;
import com.singularitec.tripscript.repositories.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ViagemServiceImplementation implements ViagemService {

    @Autowired                                          // Cria o vínculo automático entre o Repositório e o Serviço da Classe/Tabela Viagem.
    private ViagemRepository viagemRepository;

    @Override
    public Viagem saveViagem(Viagem viagem) {
        return viagemRepository.save(viagem);
    }
}
