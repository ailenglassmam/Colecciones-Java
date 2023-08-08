/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Pais;
import java.util.Optional;
import java.util.TreeSet;

/**
 * Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente) Después deberemos mostrar el conjunto
 * ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por
 * último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 */
public class ServicioE5 {

    TreeSet<Pais> paises;

    //constructor 
    public ServicioE5() {
        this.paises = new TreeSet<>();
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public TreeSet<Pais> getPaises() {
        return paises;
    }

    public TreeSet<Pais> ordenarAlfabeticamente() {
        //El TreeSet almacena y ordena alfabeticamente de forma natural.
        return new TreeSet<>(paises);
    }

    public Optional<Pais> buscarPaisEnLista(String pais) {
        for(Pais p : paises){
            if(p.getPais().equalsIgnoreCase(pais)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
    
}
