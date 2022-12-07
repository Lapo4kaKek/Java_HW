import Models.Book;
import Models.Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("aboba");
        System.out.print(library.getAll());
        Book first = new Book("ЗаводнойАпельсин","Бёрджесса", 1971);
        Book seocnd = new Book("Отель","Хейли", 1965);
        Book third = new Book("ОбщаяФизика","Сивухин", 1977);
        library.add(first);
        library.add(seocnd);
        library.add(third);
        System.out.print(library.get("Отель").toString());
        ArrayList<Book> books = library.get("ЗаводнойАпельсин");
    }
}