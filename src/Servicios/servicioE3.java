package Servicios;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
 *
 * @author PC
 */
public class servicioE3 {

    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public void inicioRegistro(Scanner leer) {
        boolean confirmacion = true;

        do {
            System.out.println("¿Desea realizar un registro? (Y/N)");
            String respuesta = leer.nextLine();

            if (respuesta.equalsIgnoreCase("Y")) {
                registroAlumno(leer);
            } else {
                confirmacion = false;
                System.out.println("Gracias por utilizar el sistema de registro de estudiantes. Hasta la próxima.");
            }
        } while (confirmacion);
    }

    private void registroAlumno(Scanner leer) {

        Alumno na = new Alumno();

        System.out.println("INICIO REGISTRO");
        System.out.println("");
        System.out.println("Nombre y apellido del estudiante:");
        na.setNombre(leer.nextLine());

        System.out.println("¿Cuántas notas va a ingresar?");
        int cantNotas = leer.nextInt();
        leer.nextLine();

        System.out.println("Notas:");

        for (int i = 0; i < cantNotas; i++) {
            double nota = Double.parseDouble(leer.nextLine());
            na.getNotasAlumno().add(nota);
        }

        listaAlumnos.add(na);
        notaFinal(leer, na.getNotasAlumno(), na.getNombre());
    }

    private void notaFinal(Scanner leer, ArrayList<Double> notasAlumno, String nombreAlumno) {
        System.out.println("¿Qué estudiante desea calcular su nota final?");
        String estudianteBuscado = leer.nextLine();

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(estudianteBuscado)) {
                double sumatoria = 0.0;
                for (double nota : notasAlumno) {
                    sumatoria += nota;
                }
                double promedio = sumatoria / notasAlumno.size();

                System.out.println("El promedio final de " + nombreAlumno + " es: " + promedio);
                return;
            }
        }

        System.out.println("No se encontró al estudiante en la lista.");

    }

}
