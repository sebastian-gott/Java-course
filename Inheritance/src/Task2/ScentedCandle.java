package Task2;

public class ScentedCandle extends Candle {
    public String scent;

    public ScentedCandle(String color, int height, int price, String scent) {
        super(color, height);
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String newScent) {
        scent = newScent;
    }

    public String printCandleShit(){
        return(super.printCandleShit() + " and the scent is " + scent);
    }

}
