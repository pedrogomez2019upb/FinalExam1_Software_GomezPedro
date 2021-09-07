package edu.upb.software.finalExam1.Punto4;
//#######################
//DESARROLLO PUNTO 4
//#######################
public class Main {
    public static void main(String[] args) {
        Carro carro1= new Carro.CarroBuilder("Berlina","BMW","X4").cilindraje(24).potencia(235).tipoCombustible("Gasolina").numPuertas(5).build();
        System.out.println(carro1);
        Carro carro2= new Carro.CarroBuilder("Coupe","Audi","Z4").cilindraje(24).tipoCombustible("Gasolina").numPuertas(5).build();
        System.out.println(carro2);
        Carro carro3= new Carro.CarroBuilder("MonoVolumen","Toyota","Prado").numPuertas(5).build();
        System.out.println(carro3);
    }
}
//Developed by Pedro Felipe Gómez Bonilla - ID:000396221