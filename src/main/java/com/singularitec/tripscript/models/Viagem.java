package com.singularitec.tripscript.models;

import javax.persistence.*;

@Entity
public class Viagem {

    @Id                                                     // Identifica como Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Ativa o AutoIncrement para o id
    @Column(name = "IdViagem")                              // Define o nome do atributo
    private int IdViagem;

    @Column(nullable = false)                               // Identifica o atributo como Not Null
    private String Destino, Horario, Quantidade;

    @Column(nullable = false)
    private float Preco;

    @ManyToOne                                              // Define a relação N:1
    @JoinColumn(name="IdCliente")                           //
    private Cliente cliente;                                // Cria uma variável da tabela de referência.

    // Criação do Construtor
    public Viagem() {
    }

    // Getters e Setters de cada atributo da classe.
    public int getIdViagem() {
        return IdViagem;
    }

    public void setIdViagem(int idViagem) {
        IdViagem = idViagem;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String quantidade) {
        Quantidade = quantidade;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float preco) {
        Preco = preco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
