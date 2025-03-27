import java.io.Serializable;

public class jabaBeans {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.setNombre("karla");
        persona.setApellido("lara");
        System.out.println("peronsa = "+persona);
        System.out.println("nombre: "+persona.getNombre());
        System.out.println("apellido: "+persona.getApellido());
    }
}
class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona(){

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}