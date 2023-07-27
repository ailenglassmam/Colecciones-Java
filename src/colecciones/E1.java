package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //listas
        ArrayList<String> listaRazas = new ArrayList<>();

        Scanner leer = new Scanner(System.in);
        int opcion;
        
        System.out.println("");

        do {
            System.out.println("MENU");
            System.out.println("*****  &  *****");
            System.out.println("Ingrese la opción que desea:");
            System.out.println("1. Ingresar raza a la lista");
            System.out.println("2. Eliminar raza de la lista");
            System.out.println("3. Salir");
            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Ingrese la raza de la mascota");
                        String raza = leer.nextLine();
                        listaRazas.add(raza);

                        System.out.println("¿Desea agregar otra raza? (Y/N)");
                        String respuesta = leer.nextLine();

                        if (respuesta.equalsIgnoreCase("N")) {
                            break;
                        }
                    } while (true);
                    break;
                case 2:
                    System.out.println("Ingrese la raza que desea eliminar:");
                    String razaEliminar = leer.nextLine();
                    Iterator<String> it = listaRazas.iterator();
                    while (it.hasNext()) {
                        if (it.next().equals(razaEliminar)) {
                            it.remove();
                            System.out.println("Raza eliminada con éxito. La lista final es:");
                            System.out.println(listaRazas);
                        } else {
                            System.out.println("La raza ingresada no se encuentra en la lista.");
                            System.out.println(listaRazas);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el sistema de registro. El listado final es: ");
                    System.out.println(" ");
                    System.out.println(listaRazas);
                    break;
            }

        } while (opcion <= 3);
    }

}
