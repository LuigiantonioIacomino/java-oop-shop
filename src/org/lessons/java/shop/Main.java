package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prod=new Prodotto("bici","bella",300,20);
        System.out.println(prod.getCodice());
        System.out.println(prod.getPrezzo());

    }
}
