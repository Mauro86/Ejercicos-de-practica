package com.d.i.mmc;

public class CalculoIva {

    public static void main(String[] args) {

        double precio = 29.99;
        double Iva = (precio * 21)/100; // Iva en Argentina es del 21% 
        double resultadoIva = precio + Iva;

        System.out.println("El precio con Iva incluido es = " + resultadoIva);
    }
}
