package POO.persona;

public class PruebaPersona {
    private static int contadorPersonas=0;
    private int idPersona;
    private String nombre;
    private String apellido;
    public PruebaPersona(String nombre, String apellido){
        this.nombre= nombre;
        this.apellido=apellido;
        // incrementar el atributo static
        //asignaos el id unico con ayuda de la variable estatica
        this.idPersona = ++PruebaPersona.contadorPersonas;
    }
    @Override
    public String toString(){
        return "id:"+this.idPersona
                +", nombre: "+this.nombre
                +", apellido: "+this.apellido
                + ", dir de mem: "+super.toString();
    }
    public int getIdPersona() {
        return this.idPersona;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public static int getContadorPersonas(){
        return PruebaPersona.contadorPersonas;
    }
}
