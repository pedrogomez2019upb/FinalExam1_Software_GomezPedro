package edu.upb.software.finalExam1.Punto2;

public class Personaje implements Cloneable{
    private String tipo;
    private String nombre;
    private String imagen;
    private int altura;
    private int peso;
    private String inteligencia;
    private String habilidades;
    private int index;

    public Personaje(String tipo,String nombre, String imagen, int altura, int peso, String inteligencia, String habilidades,int index) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.imagen = imagen;
        this.altura = altura;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.habilidades = habilidades;
        this.index= index;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(String inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", imagen='" + imagen + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", inteligencia='" + inteligencia + '\'' +
                ", habilidades='" + habilidades + '\'' +
                ", index=" + index +
                '}';
    }
}
