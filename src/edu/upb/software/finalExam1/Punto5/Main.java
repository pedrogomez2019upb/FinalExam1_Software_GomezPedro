package edu.upb.software.finalExam1.Punto5;

public class Main {
    public static void main(String[] args) {
        Persona p= Persona.getPersona("Andres","Gomez");
        System.out.println(p.getNombre());
        System.out.println(p.getApellido());
    }
}
