package edu.upb.software.finalExam1.Punto5;

public class Persona {
    private String nombre;
    private String apellido;
    private static Persona miPersona ;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static Persona getPersona(String nombre, String apellido){
        if(miPersona==null){
            miPersona=new Persona(nombre,apellido);
        }
        return miPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
