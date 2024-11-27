package deco;

import boissons.Boisson;

public class Chocolat extends DecorateurBoisson{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.2 + boisson.cout();
    }
}
