package solid;

import java.io.Serializable;

/*
    A Books' core fields are closed for modification (immutable) but the book and it's overview are open to extension

 */

public class Book implements Serializable {


    private final String title;
    private final String author;
    private final String text;
    private final int pages;

    public Book(String title, String author, String text, int pages){
        this.title = title;
        this.author = author;
        this.text = text;
        this.pages = pages;
    }


    final public String getTitle() {
        return title;
    }

    final public String getAuthor() {
        return author;
    }

    final public String getText() {
        return text;
    }

    final public int getPages() {
        return pages;
    }

    public String bookOverview(){
        StringBuilder str = new StringBuilder();
        str.append("Title: ").append(this.title).append("\n");
        str.append("Author: ").append(this.author).append("\n");
        str.append("Pages: ").append(this.pages).append("\n");
        str.append("Text: ").append(this.text).append("\n");
        return str.toString();
    }
}
