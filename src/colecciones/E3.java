package colecciones;

import Servicios.servicioE3;
import java.util.Scanner;

public class E3 {

    /**
     * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. 
     * La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer con sus 3 notas.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        servicioE3 ns = new servicioE3();
        
        ns.inicioRegistro(leer);
        
    }
    
}
