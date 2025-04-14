package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {

    private int seasons;
    private int epsPerSeason;
    private boolean isActive;
    private int minutesPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpsPerSeason() {
        return epsPerSeason;
    }

    public void setEpsPerSeason(int epsPerSeason) {
        this.epsPerSeason = epsPerSeason;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons *  epsPerSeason * minutesPerEpisode;
    }
}
