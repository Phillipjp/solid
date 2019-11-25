package solid;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializedBookReader implements BookReader {
    @Override
    public Book readBook(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename + ".ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Book book = (Book) ois.readObject();
        ois.close();
        return book;
    }
}
