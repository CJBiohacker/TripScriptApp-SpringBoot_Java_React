package com.singularitec.tripscript.services;

import com.singularitec.tripscript.models.Cliente;
import com.singularitec.tripscript.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImplementation implements ClienteService {

    @Autowired                                              // Cria o vínculo automático entre o Repositório e o Serviço da Classe/Tabela Cliente.
    private ClienteRepository clienteRepository;

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);             // Método que permite realizar um Create/POST de um novo Cliente no BD.
    }

    @Override
    public List<Cliente> getAllClientes() {                  // Método que permite realizar um Read/GET de todos os Clientes no BD.
        return clienteRepository.findAll();
    }

}
