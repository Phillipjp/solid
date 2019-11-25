package solid;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeBookWriter implements BookWriter {
    @Override
    public void writeBook(String name, Book book) {
        try{
            FileOutputStream fos = new FileOutputStream(name + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(book);
            out.close();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
