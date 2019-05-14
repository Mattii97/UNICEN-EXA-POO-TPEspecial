package moran;

public class GenreFilter implements Filter {
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public GenreFilter(String genre) {
        this.genre = genre;

    }

    @Override
    public boolean accept(Track track) {
        return track.getGenre().toLowerCase().contains(this.genre.toLowerCase());

    }
}
