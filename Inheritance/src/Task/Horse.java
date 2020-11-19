package Task;

public class Horse {
    private String name;
    private String color;
    private int year;


    public Horse(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }


    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public String printHorseShit(){
        return("The horse's name is " + name + " it's color is " + color + " and it was born in " + year);
    }

}
