package BookThing;

public class Fiction extends Book {

    public Fiction(String title, Double price) {
        super(title, price);
        setPrice();
    }

    @Override
    public void setPrice() {
        setPrice(24.99);
    }

    @Override
    public String toString() {
        return  "Fiction book-" + " Tittel: " + "'" + getTitle() + "'" + " Pris: " + "'" + getPrice() + "'";
    }
}
