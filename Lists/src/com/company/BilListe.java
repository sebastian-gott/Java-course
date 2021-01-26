package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BilListe  {
    private final ArrayList<String> biler = new ArrayList<String>();

    public void nyBil(String bil){
        biler.add(bil);
    }

    public void printBiler() {
        System.out.println("Antall biler: " + biler.size());
        for(int i = 0; i < biler.size(); i++) {
            System.out.println((i + 1) + biler.get(i));
        }
    }

    public void endreBiler(int position, String endretBil){
        biler.set(position, endretBil);
        System.out.println("Ny bil info: " + (position + 1));
    }

    public void fjernBil(int position) {
        String bilen = biler.get(position);
        biler.remove(position);
    }

    public String finnBil(String sokBil) {
       // boolean finnes = biler.contains(sokBil);
        int position = biler.indexOf(sokBil);
        if(position >=0) {
            return biler.get(position);
        }
        return null;
    }

    public void sortereBiler() {
        Collections.sort(biler);
    }

}
