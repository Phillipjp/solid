package solid;

public class BookPrinter implements TextPrinter {
    @Override
    public void printText(Book book) {
        System.out.println(book.getText());
    }
}
