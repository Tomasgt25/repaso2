//Clase Persona
public abstract class Persona {

    //Atributos: Nombre, Dni y edad

    protected String nombre;
    protected String dni;
     protected int edad;

    //Constructor que recibe todos los parámetros

    Persona(){}

    Persona(String dni, int edad, String nombre) {
        this.dni=dni;
        this.edad=edad;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodo toString que no se implementara en esta clase.
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                '}';
    }
}
