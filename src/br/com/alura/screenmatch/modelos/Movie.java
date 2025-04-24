package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classification;

public class Movie extends Titulo implements Classification {
    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDiretor(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getRatingAverage() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}