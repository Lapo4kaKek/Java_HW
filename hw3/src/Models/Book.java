package Models;

public class Book {
    private String title;
    private String description;
    private String author;
    private int publicationDate;

    public Book(String title, String author, int publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public Book(String title, String description, String author, int publicationDate) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.publicationDate = publicationDate;
    }
    String getTitle() {
        return this.title;
    }
    public String toString() {
        return "Название:" + this.title + "\nАвтор:" + this.author + "\nОписание:" + this.description +
                "\nДата публикации:" + this.publicationDate + '\n';
    }
}
