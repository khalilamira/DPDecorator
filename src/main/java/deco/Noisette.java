package deco;

import boissons.Boisson;

public class Noisette extends DecorateurBoisson{

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription(){
        return boisson.getDescription() + " Au noisette";
    }

    @Override
    public double cout() {
        return 2 + boisson.cout();
    }
}
