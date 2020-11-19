package Task;

public class Main {
    public static void main(String[] args) {

        Horse firstHorse = new Horse("Adrian", "White", 1997);
        System.out.println(firstHorse.printHorseShit());
        raceHorse newRaceHorse = new raceHorse("Sindre", "Black", 1995, 4);
        System.out.println(newRaceHorse.printHorseShit());


    }
}
