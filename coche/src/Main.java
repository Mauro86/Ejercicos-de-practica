public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();

        System.out.println(Coche.Puerta);
    }
     static class Coche {
        public static int Puerta = 4;

        public void AgregarPuerta() {
           Puerta++;

        }
    }
}
