public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Mauro";
        cliente.edad = 36;
        cliente.telefono = 15696521;
        cliente.credito = 100000;
        System.out.println("Cliente: ");
        System.out.println("Nombre: " + cliente.nombre + ";" + " Edad: "
                + cliente.edad + ";" + " Telefono: " + cliente.telefono + ";"
                + " Credito: $" + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Mauro";
        trabajador.edad = 36;
        trabajador.telefono = 15696521;
        trabajador.salario = 3000;
        System.out.println("Trabajador: ");
        System.out.println("Nombre: " + trabajador.nombre +";" + " Edad: "
                + trabajador.edad + ";" + " Telefono: " + trabajador.telefono + ";"
                + " Salario: $" + trabajador.salario);
    }
    }

class Persona {
    public String nombre;
    public int edad;
    public int telefono;
}
class Cliente extends Persona{
    double credito;
}
class Trabajador extends Persona{
    double salario;
}



