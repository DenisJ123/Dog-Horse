package ie.atu.productv3;

public class Book extends Product {

    private String author;
    private String label;

    public Book() {
        super();
        author = "";
        label = "";

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + (" by " + author) + ("from" + label) ;
    }
}
