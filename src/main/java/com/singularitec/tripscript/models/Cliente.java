package com.singularitec.tripscript.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity                                                         // Entidade de Banco de Dados SQL
public class Cliente {

    @Id                                                         // Define como Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)         // Ativa AutoIncrement
    private int idCliente;
    private String nome;
    
}
