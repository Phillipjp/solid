package solid;

import java.io.IOException;

public interface BookReader {

    Book readBook(String filename) throws IOException, ClassNotFoundException;
}
