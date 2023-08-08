package colecciones;

import Entidad.Pais;
import Servicios.ServicioE5;
import java.util.Optional;
import java.util.Scanner;

/**
 */
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        ServicioE5 ns = new ServicioE5();

        do {
            System.out.println("----- SISTEMA DE REGISTRO DE PAÍSES -----");
            System.out.println("¿Desea realizar un registro?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.println("¿Desea realizar una búsqueda en el registro?");
            System.out.println("3. Si");
            System.out.println("4.No");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el país que desea cargar");
                    ns.agregarPais(new Pais(leer.nextLine()));
                    int opcion2;
                    do {
                        System.out.println("¿Desea agregar otro país?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        opcion2 = leer.nextInt();
                        leer.nextLine();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Ingrese el nuevo pais");
                                ns.agregarPais(new Pais(leer.nextLine()));
                                break;
                            case 2:
                                System.out.println("Los paises registrados son:");
                                for (Pais pais : ns.getPaises()) {
                                    System.out.println(pais.getPais());
                                }
                                break;
                        }
                    } while (opcion2 == 1);
                    break;
                case 2:
                    System.out.println("Gracias por elegir nuestro sistema de registro.");
                    System.out.println("Los países ingresados son:");
                    ns.ordenarAlfabeticamente();
                    break;
                case 3:
                    System.out.println("Ingrese el país que desea buscar:");
                    String pais = leer.nextLine();
                    Optional<Pais> oPais = ns.buscarPaisEnLista(pais);
                    if (oPais.isPresent()) {
                        System.out.println(oPais.get().toString());
                    } else {
                        System.out.println("País no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por elegir nuestro sistema de registro.");
                    System.out.println("Los países ingresados son:");
                    ns.ordenarAlfabeticamente();
                    break;
                default:
                    System.out.println("Respuesta incorrecta. Vuelva a intentarlo.");
                    System.out.println("¿Desea realizar un registro?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    opcion = leer.nextInt();
                    leer.nextLine(); // Limpia el buffer

            }
        } while (opcion == 1);
    }
}
