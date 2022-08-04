package com.d.i.mmc;

import java.util.Arrays;

public class Ejercicio3javaInicialBucle {

    public static void main(String[] args) {

        String[] nombre = {"Mauro, " + "Juan, " + "Gustavo, " + "Mariela, " + "Luisina, " + "Lucila, " + "Lisandro "};

        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
        }

        //for(String ignored : nombre){
            //System.out.println(Arrays.toString(nombre));
        //}
    }
}
