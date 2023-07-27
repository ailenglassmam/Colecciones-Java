package Entidad;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<Double> notasAlumno = new ArrayList<>();
    private ArrayList<String> listaAlumnos = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotasAlumno() {
        return notasAlumno;
    }

    public void setNotasAlumno(ArrayList<Double> notasAlumno) {
        this.notasAlumno = notasAlumno;
    }

    public ArrayList<String> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<String> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    
}
