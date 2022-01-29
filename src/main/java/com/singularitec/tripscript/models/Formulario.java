package com.singularitec.tripscript.models;

import javax.persistence.*;

@Entity
public class Formulario {

    @Id                                                     // Identifica como Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Ativa o AutoIncrement para o id
    @Column(name = "IdFormulario")                          // Define o nome do atributo
    private int IdFormulario;

    @Column(nullable = false)                               // Identifica o atributo como Not Null
    private String Nome, Email, Local, Mensagem;

    // Criação do Construtor
    public Formulario() {
    }

    // Getters e Setters de cada atributo da classe.
    public int getIdFormulario() {
        return IdFormulario;
    }

    public void setIdFormulario(int idFormulario) {
        IdFormulario = idFormulario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String mensagem) {
        Mensagem = mensagem;
    }
}
