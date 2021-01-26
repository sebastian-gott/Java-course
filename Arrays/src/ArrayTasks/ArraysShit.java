package ArrayTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysShit {
    public static void main (String[] args){
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Sindre");
        strings.add("Sebastian");
        strings.add("Kris");
        strings.add("Mats");
        strings.add("Anders");
        System.out.println("Uten sortering: " + strings);
        Collections.sort(strings);
        System.out.println("Med sortering: " + strings);
    }
}
