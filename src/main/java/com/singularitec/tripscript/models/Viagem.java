package com.singularitec.tripscript.models;

import javax.persistence.*;

@Entity
public class Viagem {

    @Id                                                     // Identifica como Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Ativa o AutoIncrement para o id
    private int idViagem;

    @Column(nullable = false)                               // Identifica como Not Null
    private String Destino, Horario, Quantidade;

}
