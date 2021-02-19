package BookThing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookDemo {

    public static void main(String[]args) {

        List<Book> BookArray = new ArrayList<Book>();
        BookArray.add(new Fiction("Test", 34.4));
        BookArray.add(new NonFiction("Sindre kul", 43.44));
        List<String> strings = new ArrayList<>(BookArray.size());



        System.out.println(BookArray);

//        Fiction fictionBook = new Fiction("Adrian er sterk", 29.33);
//        System.out.println(fictionBook);
    }
}
