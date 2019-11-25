package solid;

import java.util.ArrayList;

public class IllustratedBook extends Book{

    private ArrayList<String> illustrations;

    public IllustratedBook(String title, String author, String text, int pages, ArrayList<String> illustrations) {
        super(title, author, text, pages);
        this.illustrations = illustrations;
    }

    public ArrayList<String> getIllustrations(){
        return illustrations;
    }

    @Override
    public String bookOverview(){
        StringBuilder str = new StringBuilder();
        str.append("Illustrations: ").append("\n");
        for (String illustration : illustrations) {
            str.append("\t").append(illustration);
        }
        return super.bookOverview() + str.toString();
    }
}
