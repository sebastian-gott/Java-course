package listeoving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Ansatt implements Comparable{
    private String name;
    private String tittle;
    private int alder;
    public Ansatt(String name, String tittle, int alder) {
        this.name = name;
        this.tittle = tittle;
        this.alder = alder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override



    public String toString() {
        return ("Ansatt info:\n Name: " + this.getName() + ", Tittel: " + this.getTittle() + ", Alder: " + this.getAlder())  + "\n";
    }



    public int compareTo(Object comparesto) {
        int compareAge =((Ansatt)comparesto).getAlder();
        return compareAge-this.alder;
    }
}

public class ListMain {
    public static void main(String[] args) {

        ArrayList<Ansatt>Ansatte = new ArrayList<Ansatt>();

        Ansatte.add(new Ansatt("Sebastian", "Utvikler", 22));
        Ansatte.add(new Ansatt("Adrian", "Utvikler", 23));
        Ansatte.add(new Ansatt("Sindre", "Utvikler", 25));

        Collections.sort(Ansatte);

        for(Ansatt str: Ansatte) {
            System.out.println(str);
        }





    }
}
