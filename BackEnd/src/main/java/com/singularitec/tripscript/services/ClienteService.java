package com.singularitec.tripscript.services;

import com.singularitec.tripscript.models.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente saveCliente(Cliente cliente);
    List<Cliente> getAllClientes();
    Cliente getCliente(Integer id);
    void deleteCliente(Integer id);
}
