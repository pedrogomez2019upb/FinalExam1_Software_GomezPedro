package edu.upb.software.finalExam1.Punto2;

public class Monstruo extends Personaje{
    public Monstruo(String tipo,String nombre, String imagen, int altura, int peso, String inteligencia, String habilidades,int index) {
        super(tipo,nombre, imagen, altura, peso, inteligencia, habilidades,index);
    }

    public Monstruo clone(){
        return new Monstruo(this.getTipo(),this.getNombre(),this.getImagen(),this.getAltura(),this.getPeso(),this.getInteligencia(),this.getHabilidades(),this.getIndex());
    }
}
