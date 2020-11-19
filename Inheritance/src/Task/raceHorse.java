package Task;

public class raceHorse extends Horse {

    private int racesWon;

    public raceHorse(String name, String color, int year, int racesWon) {
        super(name, color, year);
    }

    public int getRacesWon() {
        return racesWon;
    }

    public void setRacesWon (int changeValue) {
        racesWon = changeValue;
    }

    public String printHorseShit(){
        return(super.printHorseShit() + " and the horse has won " + racesWon + " races");
    }
}
