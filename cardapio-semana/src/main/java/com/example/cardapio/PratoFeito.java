
package com.example.cardapio;

import java.time.LocalDate;

public class PratoFeito {

    private String nome;
    private int nota;
    private LocalDate feitoEm;

    public PratoFeito(String nome, int nota, LocalDate feitoEm) {
        this.nome = nome;
        this.nota = nota;
        this.feitoEm = feitoEm;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public LocalDate getFeitoEm() {
        return feitoEm;
    }
}
