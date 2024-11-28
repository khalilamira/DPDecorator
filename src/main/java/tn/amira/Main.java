package tn.amira;

import boissons.Boisson;
import boissons.Deca;
import boissons.Espresso;
import boissons.Sumatra;
import deco.Chantilly;
import deco.Chocolat;
import deco.Noisette;

public class Main {
    public static void main(String[] args) {

        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());
        System.out.println("------------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());
        System.out.println("-------------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());
        System.out.println("-------------------------");
        boisson = new Noisette(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());
        System.out.println("------------------------- ");
        boisson = new Chantilly(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());

        System.out.println("--------------------");
        //en gros c'est une liste chaine des objets
        Boisson b = new Chantilly(new Chantilly(new Noisette(new Deca())));
        System.out.println(b.getDescription());
        System.out.println(b.cout());
    }
}