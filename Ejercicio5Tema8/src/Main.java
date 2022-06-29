public class Main {
    public static void main(String[] args) {
                 //Objeto Persona
        Persona persona = new Persona();
        persona.setNombre("Mauro");
        String nombre = persona.getNombre();
        persona.setEdad("36");
        String edad = persona.getEdad();
        persona.setTelefono("3464696521");
        String telefono = persona.getTelefono();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
    }
}
                  //Clase Persona
class Persona {
    //Nombre
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    //Edad
    private String edad;
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getEdad(){
        return this.edad;
    }
    //Telefono
    private String telefono;
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}

