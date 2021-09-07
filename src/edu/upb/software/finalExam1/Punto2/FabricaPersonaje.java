package edu.upb.software.finalExam1.Punto2;

public class FabricaPersonaje {

    private Heroe heroe;
    private Monstruo monstruo;
    private Principe principe;
    private Villano villano;

    public FabricaPersonaje(Heroe heroe, Monstruo monstruo, Principe principe, Villano villano) {
        this.heroe = heroe;
        this.monstruo = monstruo;
        this.principe = principe;
        this.villano = villano;
    }

    public Heroe crearHeroe(){
        return heroe.clone();
    }

    public Monstruo crearMonstruo(){
        return monstruo.clone();
    }

    public Principe crearPrincipe(){
        return principe.clone();
    }

    public Villano crearVillano(){
        return villano.clone();
    }
}
