package tn.amira;

import boissons.Boisson;
import boissons.Espresso;
import boissons.Sumatra;
import deco.Chocolat;

public class Main {
    public static void main(String[] args) {

        Boisson boisson;
        boisson = new Sumatra();
        boisson = new Chocolat(boisson);
        System.out.println(boisson.cout());
    }
}