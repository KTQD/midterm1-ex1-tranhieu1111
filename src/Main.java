public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("My Favorite Song", 15.99f, "Artist Name", 240);
        mp3.showInfo();

        System.out.println();
        Book book = new Book("Java Programming", 39.99f, "John Doe", 400, "Programming");
        book.showInfo();
    }
}
