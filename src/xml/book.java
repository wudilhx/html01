package xml;

public class book {
    private String name;
    private double price;
    private String author;
    private String sn;
    public book(){}

    public book(String name, double price, String author, String sn) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", sn='" + sn + '\'' +
                '}';
    }
}
