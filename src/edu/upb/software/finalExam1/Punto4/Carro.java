package edu.upb.software.finalExam1.Punto4;
//#######################
//DESARROLLO PUNTO 4
//#######################
public class Carro{

    private String tipo;
    private double cilidraje;
    private double potencia;
    private String marca;
    private String modelo;
    private String tipoCombustile;
    private int numPuertas;


    public String getTipo() {
        return tipo;
    }

    public double getCilidraje() {
        return cilidraje;
    }

    public double getPotencia() {
        return potencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoCombustile() {
        return tipoCombustile;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipo='" + tipo + '\'' +
                ", cilidraje=" + cilidraje +
                ", potencia=" + potencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustile='" + tipoCombustile + '\'' +
                ", numPuertas=" + numPuertas +
                '}';
    }
    public static class CarroBuilder {

        private String tipo;
        private double cilidraje;
        private double potencia;
        private String marca;
        private String modelo;
        private String tipoCombustile;
        private int numPuertas;

        public CarroBuilder(String tipo, String marca, String modelo) {
            this.tipo = tipo;
            this.marca = marca;
            this.modelo = modelo;
        }

        public CarroBuilder cilindraje(double cilidraje) {
            this.cilidraje = cilidraje;
            return this;
        }

        public CarroBuilder potencia(double potencia) {
            this.potencia = potencia;
            return this;
        }

        public CarroBuilder tipoCombustible(String tipoCombustile) {
            this.tipoCombustile = tipoCombustile;
            return this;
        }

        public CarroBuilder numPuertas(int numPuertas) {
            this.numPuertas = numPuertas;
            return this;
        }

        public Carro build(){
            Carro carro = new Carro();
            carro.cilidraje=this.cilidraje;
            carro.marca=this.marca;
            carro.modelo=this.modelo;
            carro.numPuertas=this.numPuertas;
            carro.potencia=this.potencia;
            carro.tipo=this.tipo;
            carro.tipoCombustile=this.tipoCombustile;
            return carro;
        }
    }
}
//Developed by Pedro Felipe Gómez Bonilla - ID:000396221