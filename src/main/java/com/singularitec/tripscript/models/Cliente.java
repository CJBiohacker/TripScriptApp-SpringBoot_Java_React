package com.singularitec.tripscript.models;

import javax.persistence.*;

@Entity                                                     // Identifica a classe como Entidade/Tabela SQL
public class Cliente {

    @Id                                                     // Identifica como Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Ativa o AutoIncrement para o id
    private int IdCliente;

    @Column(nullable = false)                               // Identifica como Not Null
    private String Nome, DataNasc, Celular;

    public Cliente() {
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
}
