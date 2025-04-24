import br.com.alura.screenmatch.calculos.Recommendation;
import br.com.alura.screenmatch.calculos.TimeCalculator;
import br.com.alura.screenmatch.modelos.Episodes;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + myMovie.getDurationInMinutes());

        myMovie.technicalDataSheet();
        myMovie.userRatingInput(8);
        myMovie.userRatingInput(5);
        myMovie.userRatingInput(10);
        System.out.println("Nota média: " + myMovie.getRatingAverage());
        System.out.println("Total de avaliações: " + myMovie.getRatingCount());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.technicalDataSheet();
        lost.setSeasons(10);
        lost.setEpsPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar: " + lost.getDurationInMinutes());

        Movie otherMovie = new Movie();
        otherMovie.setName("Avatar");
        otherMovie.setReleaseYear(2023);
        otherMovie.setDurationInMinutes(200);
        System.out.println("Duração do filme: " + otherMovie.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(otherMovie);
        calculator.include(lost);
        System.out.println("Duração total dos títulos na calculadora: " + calculator.getTotalTime());

        Recommendation filtro = new Recommendation();
        filtro.isRecommended(myMovie);
        Episodes episode = new Episodes();
        episode.setNumero(1);
        episode.setSerie(lost);
        episode.setViewNumber(300);
        filtro.isRecommended(episode);

        //Movie filmeDoPaulo = new Movie();
        //A utilização de "var" ao invés do nome da classe também funciona
        var filmeDoPaulo = new Movie();
        filmeDoPaulo.setName("Dogville");
        filmeDoPaulo.setDurationInMinutes(200);
        filmeDoPaulo.setReleaseYear(2003);
        filmeDoPaulo.userRatingInput(10);

        ArrayList<Movie> movieList = new ArrayList<>();

        movieList.add(filmeDoPaulo);
        movieList.add(myMovie);
        movieList.add(otherMovie);

        System.out.println("Quantidade de filmes: " + movieList.size());
        System.out.println("Primeiro filme na lista: " + movieList.get(0).getName());
        System.out.println("toString do primeiro filme: " + movieList.get(0).toString());
        System.out.println(movieList);
    }
}