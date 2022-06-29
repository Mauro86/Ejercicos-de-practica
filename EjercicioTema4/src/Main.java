public class Main {

    public static void main(String[] args) {

        //ejercicio 4 parte 1

        int número = 10;

        if (número > 0) {
            System.out.println("El número es positivo!");
        }
        else if (número < 0) {
            System.out.println("El número es negativo!");
        }
        else {
            System.out.println("El número es neutro!");
        }

        //ejercicio 4 parte 2

        int numeroWhile = 0;

        while (numeroWhile <3) {
            System.out.println("numeroWhile:" + numeroWhile);
            numeroWhile = numeroWhile +1;
            //numeroWhile ++; (es lo mismo, usar con más experiencia)
        }

        //ejercicio 4 parte 3

        int numeroDoWhile= 3;
        do{
            System.out.println("numeroDoWhile:" + numeroDoWhile) ;
            numeroDoWhile = numeroDoWhile +1;
        } while (numeroDoWhile <3);

        //ejercicio 4 parte 4

        for (int numeroFor = 0; numeroFor <=3 ; numeroFor = numeroFor +1){
            System.out.println("numeroFor:" + numeroFor);
        }

        //ejercicio 4 parte 5

        var estacion = "Verano";
        switch(estacion) {

            case "Primavera":
                System.out.println("Estamos en Primavera" );
                break;
            case "Verano":
                System.out.println("Estamos en Verano" );
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño" );
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno" );
                break;
            default:
                System.out.println("No es una estación");

        }

    }
}


