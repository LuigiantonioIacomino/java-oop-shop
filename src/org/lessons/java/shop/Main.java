package org.lessons.java.shop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Prodotto prod1=new Prodotto("auto","confortevole",300,40);
        System.out.println(prod1.getPrezzo());
        System.out.println(prod1.getDescrizione());
        System.out.println(prod1.getIva());
        System.out.println(prod1.getNome());

        Prodotto prod2=new Prodotto("motorino","veloce",200,60);
        System.out.println(prod2.getNome());
        System.out.println(prod2.getPrezzo());
        System.out.println(prod2.getDescrizione());
        System.out.println(prod2.getIva());


    }
}
