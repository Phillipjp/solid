import solid.*;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Book book1 = new Book("Solid Principles", "Phillip Perks", "This book is about the solid principles of OOP", 5);

        ArrayList<String> illustrations = new ArrayList<>();
        illustrations.add("/Users/perks1/Dev/my-stuff/solid/book1.jpeg");
        illustrations.add("/Users/perks1/Dev/my-stuff/solid/book2.jpeg");

        IllustratedBook book2 = new IllustratedBook("Clean Code", "Uncle Bob", "This book is about clean code", 10, illustrations);

        System.out.println("=== LISKOV SUBSTITUTION ===");
        BookPrinter bookPrinter = new BookPrinter();
        System.out.println("BookPrinter can print the text for a Book and an IllustratedBook\n");
        System.out.print("book1 text: "); bookPrinter.printText(book1);
        System.out.print("book2 text: "); bookPrinter.printText(book2);
        System.out.println();

        System.out.println("=== INTERFACE SEGREGATION ===");
        System.out.println("BookPrinter only implements an interface to print text but IllustratedBookPrinter implements an interface to print text and another to print the illustrations\n");
        IllustratedBookPrinter illustratedBookPrinter = new IllustratedBookPrinter();
        illustratedBookPrinter.printText(book2);
        illustratedBookPrinter.printIllustrations(book2);
        System.out.println();

        System.out.println("=== DEPENDENCY INVERSION ===");
        System.out.println("Classes for storing and loading books are injected into the Librarian via the constructor\n");

        SerializeBookWriter serializeBookWriter = new SerializeBookWriter();
        SerializedBookReader serializedBookReader = new SerializedBookReader();

        Librarian librarian = new Librarian(serializeBookWriter, serializedBookReader);

        librarian.storeBook("book1", book1);
        Book newBook1 = librarian.readBook("book1");

        System.out.println("book1 overview:\n");
        System.out.println(book1.bookOverview());

        System.out.println("new book1 overview:\n");
        System.out.println(newBook1.bookOverview());

    }


}
