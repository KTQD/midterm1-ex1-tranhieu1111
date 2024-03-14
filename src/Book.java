public class Book extends Item {
    private String author;
    private int numberOfPages;
    private String genre;

    public Book(String title, float price, String author, int numberOfPages, String genre) {
        super(title, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

