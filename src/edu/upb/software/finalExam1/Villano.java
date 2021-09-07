package edu.upb.software.finalExam1;

public class Villano extends Personaje{
    public Villano(String tipo,String nombre, String imagen, int altura, int peso, String inteligencia, String habilidades,int index) {
        super(tipo,nombre, imagen, altura, peso, inteligencia, habilidades,index);
    }

    public Villano clone(){
        return new Villano(this.getTipo(),this.getNombre(),this.getImagen(),this.getAltura(),this.getPeso(),this.getInteligencia(),this.getHabilidades(),this.getIndex());
    }
}
