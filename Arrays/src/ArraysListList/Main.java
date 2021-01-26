package ArraysListList;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        List<Recordings> played = new ArrayList<Recordings>();
        played.add(new Recordings("Cly Me To The Moon", "Kris Sinatra", 5000));
        played.add(new Recordings("Aly Me To The Sun", "Sindre Sinatra", 3000));
        played.add(new Recordings("Bly Me To The Hell", "Mats Sinatra", 4000));

        Scanner newScan1 = new Scanner(System.in);
        System.out.println("Skriv in tittle, Artist og spilletid: ");

        Recordings objekt = new Recordings(newScan1.nextLine(), newScan1.nextLine(), newScan1.nextDouble());
        played.add(objekt);

        Scanner newScan11 = new Scanner(System.in);
        System.out.println("Skriv in tittle, Artist og spilletid: ");

        Recordings objekt1 = new Recordings(newScan11.nextLine(), newScan11.nextLine(), newScan11.nextDouble());
        played.add(objekt1);

        Scanner newScan = new Scanner(System.in);
        System.out.println("Sorter etter tittel, artist eller spilletid?");
        String shit = newScan.nextLine();



        if(shit.equals("artist")) {
            played.sort(Comparator.comparing(Recordings::getArtist));
            System.out.println(played);
        } else if(shit.equals("tittel")) {
            played.sort(Comparator.comparing(Recordings::getTitle));
            System.out.println(played);
        } else if(shit.equals("spilletid")) {
            played.sort(Comparator.comparing(Recordings::getTime));
            System.out.println(played);
        } else {
            System.out.println("Koden funker ikke så bra. Stav riktig takk :)");
        }






    }

}
