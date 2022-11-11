package com.Ejercicio1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("          Cadena al revés");

        /*
        Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena
        "hola mundo", debe retornar "odnum aloh".
         */

//                      Cadena al revés.

        String cadena = "Hola Mundo";
//                       0123456789
//                       odnuM aloH

        for (int i = 9; i < cadena.length(); i--) {
            if (i < 0) {
                break;
            }

            System.out.println(cadena.charAt(i));

        }

        System.out.println("--------------------");
        System.out.println("          Array unidimensional");

        /*
        Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
         */

//                     Array unidimensional:

        String[] nombres = {
                "Mauro",
                "Lucila",
                "Luisina",
        };

        for (String nombre : nombres) {
            System.out.println("arrayUni de String: " + nombre);
        }

        System.out.println("--------------------");
        System.out.println("          Array bidimensional");

        /*
        Crea un array bidimensional de enteros y recórrelo, mostrando la posición
        y el valor de cada elemento en ambas dimensiones.
         */

//                     Array bidimensional:

        int[][] arrayBidi = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 1;
        arrayBidi[1][1] = 2;
        arrayBidi[1][2] = 3;
        arrayBidi[1][3] = 4;

        for (int i = 0; i < arrayBidi.length; i++) {

            for (int j = 0; j < arrayBidi[1].length; j++) {
                System.out.println("Estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

        System.out.println("--------------------");
        System.out.println("          Vector");

        /*
        Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        Elimina el 2o y 3er elemento y muestra el resultado final.
         */

//                              Vector

        Vector<String> vector = new Vector<>(5);
        vector.add("Mauro");
        vector.add("Brenda");
        vector.add("Romina");
        vector.add("Lucila");
        vector.add("Marina");

        for (String ignored : vector) {

            vector.remove(1);
            vector.remove(1);
            vector.remove(2);
            System.out.println(vector);
            break;
        }

        System.out.println("--------------------");
        System.out.println("          Respuesta ejercicio 4");

        /*
        Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
        si tuviésemos 1000 elementos para ser añadidos al mismo.
         */

        System.out.println("""
                                
                Los vectores son array dinámicos, crecen automáticamente,\040
                también pueden decrecer hasta el tamaño de sus elementos,\040
                y tanto hacer crecer o decrecer un vector(array) no es\040
                gratis computacionalmente hablando.
                Si un vector esta permanentemente creciendo este puede\040
                ralentizar la ejecución del programa, hay que intentar\040
                evitarlo, para esto hay que calcular a criterio del\040
                programador lo más preciso posible la cantidad de lugares,\040
                esto es para evitar la cantidad de copias internas de\040
                vectores o array.""");


        System.out.println("--------------------");
        System.out.println("          Array List");

        /*
        Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
         */

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Auto");
        lista.add("Moto");
        lista.add("Yate");
        lista.add("MotorHome");

        LinkedList<String> listaEnlazada = new LinkedList<>(lista);
        System.out.println(listaEnlazada);

        System.out.println("--------------------");
        System.out.println("          Array List de tipo int");

        /*
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra
        el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer
        "for" de relleno.
         */

        ArrayList<Integer> listaInt = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listaInt.add(i);
            System.out.println("Contenido: " + listaInt);
        }
        for (int i = 1; true; i++) {
            listaInt.remove(i);
            System.out.println("Contenido sin números pares: " + listaInt);
            if (i == 5) {
                break;
            }
        }
        /*
        Crea una función DividePorCero. Esta, debe generar una excepción
        ("throws") a su llamante del tipo ArithmeticException que será capturada
        por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
        mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos
        en cualquier caso: "Demo de código".
         */
        System.out.println("--------------------");
        System.out.println("          Divide Por Cero");


        try {
            dividePorCero(5, 0);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse!!");
        }
    }

    public static void dividePorCero(int A, int B) throws ArithmeticException {
        int resultado = 0;

        try {
            resultado = A / B;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        System.out.println("Esto es un demo!!");
    }

     /*
    Utilizando InputStream y PrintStream, crea una función que reciba
    dos parámetros: "fileIn" y "fileOut". La tarea de la función será
    realizar la copia del fichero dado en el parámetro "fileIn" al
    fichero dado en "fileOut".
     */

    public void entrada(String[] args) {
            System.out.println("Esto es un demo!!");
        }
    }











































