package edu.upb.software.finalExam1;

public class Principe extends Personaje{

    public Principe(String tipo, String nombre, String imagen, int altura, int peso, String inteligencia, String habilidades,int index) {
        super(tipo, nombre, imagen, altura, peso, inteligencia, habilidades,index);
    }

    public Principe clone(){
        return new Principe(this.getTipo(),this.getNombre(),this.getImagen(),this.getAltura(),this.getPeso(),this.getInteligencia(),this.getHabilidades(),this.getIndex());
    }
}
