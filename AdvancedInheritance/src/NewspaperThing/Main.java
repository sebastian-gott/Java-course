package NewspaperThing;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[]args) {

        ArrayList<Object> newsSubs = new ArrayList<Object>();
        newsSubs.add(new PhysicalNewspaperSubscription("Sebastian", "Raveien", 2));


        System.out.println(newsSubs);
    }
}
