package Task2;

public class Candle {
    private String color;
    private int height;
    private int price;

    public Candle(String color, int height) {
        this.color = color;
        this.height = height;
        this.price = height * 2;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public int getHeight() {
        return height;
    }

    public void height(int newHeight) {
        height = newHeight;
    }

    public int getPrice() {
        return price;
    }

    public String printCandleShit(){
        return("The candle's color is " + color + " it's height is " + height + " and it costs " + price);
    }

}
