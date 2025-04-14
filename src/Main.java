import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

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
    }
}