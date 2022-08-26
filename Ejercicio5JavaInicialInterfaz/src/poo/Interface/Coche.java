package poo.Interface;

public class Coche {

    String marca;
    String nombre;
    int modelo;
    boolean stock;

    public Coche(){}

    public Coche(String marca,
                 String nombre,
                 int modelo,
                 boolean stock) {

        this.marca = marca;
        this.nombre = nombre;
        this.modelo = modelo;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo=" + modelo +
                ", stock=" + stock +
                '}';

    }
}
