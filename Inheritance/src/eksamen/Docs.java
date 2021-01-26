package eksamen;

public class Docs {

    public int number;
    public String title;
    public String subtitle;
    public int year;

    public Docs(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }
    public Docs( int number, int year) {
        this.number = number;
        this.year = year;
    }

    public Docs(int number, String title, String subtitle, int year) {
        this.title = title;
        this.subtitle = subtitle;
        this.number = number;
        this.year = year;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int newNumber) {
        number = newNumber;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle) {
        title = newTitle;
    }


    public String getSubtitle() {
        return subtitle;
    }
    public void setSubtitle(String newSubtitle) {
        subtitle = newSubtitle;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int newYear) {
        year = newYear;
    }

    public String printInfo(){
        return("The title of the document is " + title + " and it is subtitled in " + subtitle);
    }

}
