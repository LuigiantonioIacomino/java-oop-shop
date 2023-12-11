package org.lessons.java.shop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Prodotto prod1 = new Prodotto("", "confortevole", 100, 40);
        }
        catch (Exception e) {
            System.out.println("eccezione catturata");
            System.out.println("");

        }





    }
}
