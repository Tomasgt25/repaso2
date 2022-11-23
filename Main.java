import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();
        do {
            System.out.println("Escriba un número; 1 Crear un profesor, 2 Crear un Alumno, 3 Mostrar profesores y alumnos,4 Salir");
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:

                    teclado.nextLine();
                    System.out.println("Introduzca NOMBRE");
                    profesor.setNombre(teclado.nextLine());
                    System.out.println("Introduzca DNI");
                    profesor.setDni(teclado.nextLine());
                    System.out.println("Introduzca EDAD");
                    profesor.setEdad(teclado.nextInt());
                    System.out.println("Introduzca SALARIO");
                    profesor.setSalario(teclado.nextFloat());
                    System.out.println("Introduzca asignatura o escriba SALIR");
                    profesor.setAsignaturas(new String[]{teclado.nextLine()});
                    break;

                case 2:

                    teclado.nextLine();
                    System.out.println("Introduzca NOMBRE");
                    alumno.setNombre(teclado.nextLine());
                    System.out.println("Introduzca DNI");
                    alumno.setDni(teclado.nextLine());
                    System.out.println("Introduzca EDAD");
                    alumno.setEdad(teclado.nextInt());
                    teclado.nextLine();
                    System.out.println("Introduzca CURSO");
                    alumno.setCurso(teclado.nextLine());
                    break;


                case 3:
                    System.out.println(alumno + "|" + profesor);
                    break;


            }


        }


        while (opcion != 4);
        System.out.println("Ha salido del programa");
    }
}
