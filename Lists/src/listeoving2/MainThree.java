package listeoving2;

import java.util.*;

class car  {
    private String brand;
    private String model;
    private int year;

    public car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public synchronized String getBrand() {
        return brand;
    }

    public synchronized void setBrand(String brand) {
        this.brand = brand;
    }

    public synchronized String getModel() {
        return model;
    }

    public synchronized void setModel(String model) {
        this.model = model;
    }

    public synchronized int getYear() {
        return year;
    }

    public synchronized void setYear(int year) {
        this.year = year;
    }



    @Override

    public synchronized String toString() {
        return ("\tMerke: " + this.brand + ", Model: " + this.model + ", Årsmodell: " + this.year + "\n");
    }



    public int compareTo(Object comparesTo) {
        int compareYear = ((car)comparesTo).getYear();
        return this.year-compareYear;
    }
}

public class MainThree {
    public static void main (String[] args) {
        List<car> cars = Collections.synchronizedList(new ArrayList<car>());

        cars.add(new car("BMW", "M3", 2012));
        cars.add(new car("Audi", "A3", 2014));
        cars.add(new car("Volkswagen", "Golf", 2011));
        cars.add(new car("BMW", "M7", 2020));
        cars.add(new car("Saab", "9-3", 2006));
        cars.add(new car("BMW", "M2", 2011));
        cars.add(new car("Honda", "Accord", 2000));



//        for (car next : cars) {
//            System.out.println(next);
//        }

        cars.removeIf(car -> car.getBrand().equals("BMW") );






        Collections.sort(cars, Comparator.comparing(car::getBrand));



        System.out.println(cars);


        int number = 100;

        for(int i = 1; i < number; i++){
            if(i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }












    }
}
