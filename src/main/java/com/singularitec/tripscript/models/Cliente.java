package com.singularitec.tripscript.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity                                                     // Identifica a classe como Entidade/Tabela SQL
public class Cliente {

    @Id                                                     // Identifica como Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Ativa o AutoIncrement para o id
    @Column(name = "IdCliente")                             // Define o nome do atributo
    private int IdCliente;

    @NotNull
    private String Nome, Nasc, Celular;

    @NotNull
    @OneToMany(mappedBy = "cliente")                        // Define a relação 1:N mapeando a tabela N
    private List<Viagem> viagens;                           // Variável de Lista para o id da tabela referenciada.

    // Criação do Construtor
    public Cliente() {
    }

    // Getters e Setters de cada atributo da classe.
    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNasc() {
        return Nasc;
    }

    public void setNasc(String nasc) {
        Nasc = nasc;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public List<Viagem> getViagens() {
        return viagens;
    }

    public void setViagens(List<Viagem> viagens) {
        this.viagens = viagens;
    }
    
}
