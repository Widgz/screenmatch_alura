package br.com.alura.screenmatch.calulos;

import br.com.alura.screenmatch.modelos.Titulo;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void include (Movie f) {
//        this.totalTime += f.getDurationInMinutes();
//    }
//
//    public void include (Serie s) {
//        this.totalTime += s.getDurationInMinutes();
//    }

    public void include (Titulo titulo) {
        //System.out.println("Adicionando duração em minutos de " + titulo);
        this.totalTime += titulo.getDurationInMinutes();
    }
}