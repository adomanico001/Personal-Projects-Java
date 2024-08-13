package javampg.cinemagallery;

public class Poster {
    private int id;
    private String title;
    private int releaseYear;
    private String genre;
    private String posterUrl;

    public Poster() {
    }

    public Poster(int id, String title, int releaseYear, String genre, String posterUrl) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.posterUrl = posterUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    // Override toString() method for readability
    @Override
    public String toString() {
        return "Poster [id=" + id + ", title=" + title + ", releaseYear=" + releaseYear + ", genre=" + genre
                + ", posterUrl=" + posterUrl + "]";
    }
}
