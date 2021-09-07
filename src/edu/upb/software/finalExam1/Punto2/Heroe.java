package edu.upb.software.finalExam1.Punto2;
//#######################
//DESARROLLO PUNTO 2
//#######################
public class Heroe extends Personaje{

    public Heroe(String tipo ,String nombre, String imagen, int altura, int peso, String inteligencia, String habilidades,int index) {
        super(tipo,nombre, imagen, altura, peso, inteligencia, habilidades,index);
    }

    public Heroe clone(){
        return new Heroe(this.getTipo(),this.getNombre(),this.getImagen(),this.getAltura(),this.getPeso(),this.getInteligencia(),this.getHabilidades(),this.getIndex());
    }

}
//Developed by Pedro Felipe Gómez Bonilla - ID:000396221