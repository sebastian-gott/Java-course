package ListeNoSee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Ansatt  {
    public String name;
    public String stilling;
    public int alder;
    public Ansatt(String name, String stilling, int alder){
        this.name = name;
        this.stilling = stilling;
        this.alder = alder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStilling() {
        return stilling;
    }

    public void setStilling(String stilling) {
        this.stilling = stilling;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override

    public String toString() {

        return ("[ Navn: " + getName() + ", Stilling: " + getStilling() + ", Alder: " + getAlder() + " ]");
    }

}


public class Main {
    public static void main(String[]args) {

        List<Ansatt> Hyret = Collections.synchronizedList(new ArrayList<Ansatt>());
        Hyret.add(new Ansatt("Sebastian", "Utvikler", 23));
        Hyret.add(new Ansatt("Adrian", "Ernæring", 25));
        Hyret.add(new Ansatt("Sindre", "Mester", 26));
        Hyret.add(new Ansatt("Krister", "Gamer", 29));

        Collections.sort(Hyret, Comparator.comparing(Ansatt::getAlder));
        System.out.println(Hyret);

        //Hyret.removeIf(Ansatt -> Ansatt.getName().equals("Sindre"));


        Collections.sort(Hyret, Comparator.comparing(Ansatt::getName, Comparator.reverseOrder()));

        System.out.println(Hyret);

    }
}
