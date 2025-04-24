package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classification;

public class Episodes implements Classification {

    private int numero;
    private String nome;
    private Serie serie;
    private int viewNumber;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getViewNumber() {
        return viewNumber;
    }

    public void setViewNumber(int viewNumber) {
        this.viewNumber = viewNumber;
    }

    @Override
    public int getClassification() {
        if (viewNumber > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
