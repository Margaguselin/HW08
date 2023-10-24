public class Book {
    private String title;
    private String author;
    private int releaseYEar;

    private Genre genre;

    public Book(String title, String author, int releaseYEar, Genre genre) {
        this.title = title;
        this.author = author;
        this.releaseYEar = releaseYEar;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYEar() {
        return releaseYEar;
    }

    public void setReleaseYEar(int releaseYEar) {
        this.releaseYEar = releaseYEar;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString(){
        return "Title : " + this.title + " Author " + this.author + " Release year " + this.releaseYEar + " Genre " + this.genre;
    }
}
