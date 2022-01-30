package com.singularitec.tripscript.services;

import com.singularitec.tripscript.models.Cliente;
import com.singularitec.tripscript.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImplementation implements ClienteService {

    @Autowired                                              // Cria o vínculo automático entre o Repositório e o Serviço da Classe/Tabela Cliente.
    private ClienteRepository clienteRepository;

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
