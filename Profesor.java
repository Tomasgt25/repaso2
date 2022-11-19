//Se crea una clase Profesor que tiene todos los atributos de Persona
public class Profesor extends Persona {
    private float salario;
    private String asignaturas[]= new String[5];
    public Profesor(){}

    public Profesor(String dni, int edad, String nombre, float salario, String[] asignaturas) {
        super(dni, edad, nombre);
        this.salario = salario;
        this.asignaturas = asignaturas;
    }



    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "salario=" + salario +
                ", asignaturas='" + asignaturas + '\'' +
                "} " + super.toString();
    }
}
