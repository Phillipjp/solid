package solid;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class IllustratedBookPrinter implements TextPrinter, IllustrationPrinter {
    @Override
    public void printIllustrations(IllustratedBook book) throws IOException {
        ArrayList<String> illustrations = book.getIllustrations();
        for (String imgName : illustrations) {
            File file = new File(imgName);
            Desktop.getDesktop().open(file);
        }
    }

    @Override
    public void printText(Book book) {
        System.out.println(book.getText());
    }
}
