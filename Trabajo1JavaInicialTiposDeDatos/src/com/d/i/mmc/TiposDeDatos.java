package com.d.i.mmc;

public class TiposDeDatos {

    public static void main(String[] args) {

        //1.numericos:

            //1.1enteros:;
                byte variable1 = 5;
                short variable2 = 10;
                int variable3 = 346469652; // entran 10 numeros, ver xq el 0 no puede ir al principio.
                long variable4 = 346469652; // int y long son = buscar diferencia.

                    System.out.println(variable1);
                    System.out.println(variable2);
                    System.out.println(variable3);
                    System.out.println(variable4);


        //1.2decimales:
                float variable5 = 1.1f; // agregar f para que detecte float sino da error.
                double variable6 = 10.55d;

                    System.out.println(variable5);
                    System.out.println(variable6);

        //2.booleanos:
                boolean variable7 = true;
                boolean variable8 = false;

                    System.out.println(variable7);
                    System.out.println(variable8);

        //3.texto:
                char variable9 = 'a';
                String variable10 = "aqui puede ir cualquier cadena de texto";

                    System.out.println(variable9);
                    System.out.println(variable10);

    }


}
