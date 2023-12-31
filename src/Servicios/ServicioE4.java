/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author PC
 */
public class ServicioE4 {
    ArrayList<Pelicula> peliculas;

    public ServicioE4() {
        this.peliculas = new ArrayList<>();
    }
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    public Optional<Pelicula> buscarPeliculaPorTitulo(String titulo){
        // PARA cada Pelicula p en peliculas
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
    public Boolean eliminarPeliculaPorTitulo(String titulo){
        return peliculas.removeIf(p -> p.getTitulo().equalsIgnoreCase(titulo));
    }
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    public ArrayList<Pelicula> peliculasPorDuracionMayorIgual(Integer min){
        ArrayList<Pelicula> peliculasParaDevolver = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if(p.getDuracion() >= min){
                peliculasParaDevolver.add(p);
            }
        }
        return peliculasParaDevolver;
    }
    public ArrayList<Pelicula> ordenarPorTitulo(){
        peliculas.sort(Pelicula.comparadorPorTitulo);
        return getPeliculas();
    }
    public ArrayList<Pelicula> ordenarPorDirector(){
        peliculas.sort(Pelicula.comparadorPorDirector);
        return getPeliculas();
    }
    public ArrayList<Pelicula> ordenarPorDuracionMenAMay(){
        peliculas.sort(Pelicula.comparadorPorDuracion);
        return getPeliculas();
    }
    public ArrayList<Pelicula> ordenarPorDuracionMayAMen(){
        peliculas.sort(Pelicula.comparadorPorTitulo.reversed());
        return getPeliculas();
    }
}
