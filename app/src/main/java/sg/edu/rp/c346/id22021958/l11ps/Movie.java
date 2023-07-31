package sg.edu.rp.c346.id22021958.l11ps;

public class Movie {
    private String title;
    private String genre;
    private int year;
    private String rating;

    public Movie(String title, String genre, int year, String rating){
        this.title = title;
        this.genre = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
