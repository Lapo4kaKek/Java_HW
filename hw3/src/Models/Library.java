package Models;

import java.util.ArrayList;


public class Library {
    private String title;
    private ArrayList<Book> data;
    public Library(String title) {
        this.title = title;
        data = new ArrayList<>();
    }
    public Library(String title, ArrayList<Book> books) {
        data = books;
        this.title = title;
    }
    public void add(Book book) {
        data.add(book);
    }
    public ArrayList<Book> get(String title) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getTitle().equals(title)) result.add(data.get(i));
        }
        return data;
    }
    public boolean ask(String title) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getTitle().equals(title)) return true;
        }
        return false;
    }
    public int quantity() {
        return data.size();
    }
    public int countBook(String title) {
        int count = 0;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getTitle().equals(title)) ++count;
        }
        return count;
    }
    public ArrayList<Book> getAll() {
        return data;
    }
}
