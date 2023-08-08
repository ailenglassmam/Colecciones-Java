/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Entidad.Pelicula;
import Servicios.ServicioE4;
import java.util.Optional;

/**
 *
 * @author PC
 */
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Integer d = 100;
        ServicioE4 ps = new ServicioE4();
        ps.agregarPelicula(new Pelicula("El Rey Leon", "Rob Minkoff", 88));
        ps.agregarPelicula(new Pelicula("Matrix", "Hermanos Wachowski", 136));
        ps.agregarPelicula(new Pelicula("Interestelar", "Christopher Nolan", 169));

        System.out.println("---   PELICULAS   ---");
        ps.getPeliculas().forEach(p -> System.out.println(p.toString()));
        System.out.println("---   PELICULAS POR DURACION d->D   ---");
        ps.ordenarPorDuracionMenAMay().forEach(p -> System.out.println(p.toString()));
        System.out.println("---   PELICULAS POR DURACION D->d   ---");
        ps.ordenarPorDuracionMayAMen().forEach(p -> System.out.println(p.toString()));
        System.out.println("---   Peliculas Por DURACION >= " + d + "min   ---");
        ps.peliculasPorDuracionMayorIgual(d).forEach(p -> System.out.println(p.toString()));
        System.out.println("---   PELICULAS POR TITULO   ---");
        ps.ordenarPorTitulo().forEach(p -> System.out.println(p.toString()));
        System.out.println("---   PELICULAS POR DIRECTOR   ---");
        ps.ordenarPorDirector().forEach(p -> System.out.println(p.toString()));
        Optional<Pelicula> oPelicula = ps.buscarPeliculaPorTitulo("asda");
        if(oPelicula.isPresent()){
            System.out.println(oPelicula.get().toString());
        }
        else {
            System.out.println("pelicula no encontrada");
        }
    }
    
}
