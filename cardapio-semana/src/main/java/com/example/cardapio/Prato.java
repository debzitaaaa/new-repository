package com.example.cardapio;

import java.time.LocalDate;

public class Prato {

    private Long id;
    private String nome;
    private String tipo;
    private String categoria;
    private int porcoes;
    private LocalDate dataPlanejada;
    private String observacao;

    public Prato(Long id, String nome, String tipo,
                 String categoria, int porcoes,
                 LocalDate dataPlanejada, String observacao) {

        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.categoria = categoria;
        this.porcoes = porcoes;
        this.dataPlanejada = dataPlanejada;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPorcoes() {
        return porcoes;
    }

    public LocalDate getDataPlanejada() {
        return dataPlanejada;
    }

    public String getObservacao() {
        return observacao;
    }
}