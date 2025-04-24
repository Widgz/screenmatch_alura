package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainWithLists {

    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1970);
        myMovie.userRatingInput(9);
        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.userRatingInput(6);
        var filmeDoPaulo = new Movie("Dogville", 2003);
        filmeDoPaulo.userRatingInput(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> watchedList = new ArrayList<>();

        watchedList.add(filmeDoPaulo);
        watchedList.add(myMovie);
        watchedList.add(otherMovie);
        watchedList.add(lost);

        for (Titulo item: watchedList) {
            System.out.println(item.getName());

            if (item instanceof Movie movie) {
                System.out.println("Classificação: " + movie.getClassification());
            }
        }
    }
}
