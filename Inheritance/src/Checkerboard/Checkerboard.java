package Checkerboard;

import java.util.Random;

public class Checkerboard {
    public static void main(String[] args) {

        int lengde = 12;
        int hoyde = 12;
        String mark;
        String bomb;

        for (int a = 0; a <= hoyde; a++)
        {
            if (a % 2 == 0)
            {
                mark = "||:one:||";

            } else if(a % 3 == 0) {
                mark = "||:two:||";

            }
            else
            {

            }
            for (int b = 0; b <= lengde; b++)
            {
                if (b % 2 == 0)
                {
                    mark = "||:one:||";

                }
                else
                {

                }
            }

        }

        Random r = new Random();
        int min = 0;
        int max = 144;

        for(int l = 0; l <= hoyde; l++) {
            if(l % 2 == 0) {
                mark = "||:one:||";
                System.out.println(mark);
            } else if(l % 3 == 0) {
                mark = "||:two:||";
                System.out.println(mark);
            } else {
                mark = "||:bomb:||";
                System.out.println(mark);
            }
            for (int k = 0; k <= lengde; k++) {
                if(k % 2 == 0) {
                    mark = "||:one:||";
                    System.out.println(mark);
                } else if(k % 3 == 0) {
                    mark = "||:two:||";
                    System.out.println(mark);
                } else {
                    mark = "||:bomb:||";
                    System.out.println(mark);
                }
            }
            System.out.println("");
        }





        int rad = 5;
        String d = "*";


        for(int i = 1; i <= rad; ++i)
        {
            for(int j = 1; j <= i; ++j)
            {
                System.out.print(d);
            }
            System.out.println();
        }

    }
}
