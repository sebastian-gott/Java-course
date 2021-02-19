package BookThing;

public class NonFiction extends Book {

    public NonFiction(String title, Double price) {
        super(title, price);
        setPrice();
    }

    @Override
    public void setPrice() {
        setPrice(37.99);
    }


    @Override
    public String toString() {
        return "Non- Fiction book-" + " Tittel: " + "'" + getTitle() + "'" + " Pris: " + "'" + getPrice() + "'";
    }
}
