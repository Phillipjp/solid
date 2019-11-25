package solid;

import java.io.*;

public class Librarian {

    private BookWriter bookWriter;
    private BookReader bookReader;

    public Librarian(BookWriter bookWriter, BookReader bookReader){
        this.bookWriter = bookWriter;
        this.bookReader = bookReader;
    }

    public Book readBook(String filename) throws IOException, ClassNotFoundException {
            return bookReader.readBook(filename);
    }

    public void storeBook(String name, Book book) {
        bookWriter.writeBook(name, book);
    }
}
