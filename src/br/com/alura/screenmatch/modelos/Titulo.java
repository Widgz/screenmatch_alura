package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String name;
    private int releaseYear;
    private int durationInMinutes;
    private boolean planIncluded;
    private double sumOfRatings;
    private int ratingCount;

    public Titulo(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getRatingCount () {
        return ratingCount;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void technicalDataSheet () {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void userRatingInput (double rating) {
        sumOfRatings += rating;
        ratingCount++;
    }

    public double getRatingAverage () {
        return sumOfRatings / ratingCount;
    }

}
