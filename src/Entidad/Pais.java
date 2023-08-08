package Entidad;

public class Pais implements Comparable<Pais> {
    
    public String pais;

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
     @Override
    public int compareTo(Pais otroPais) {
        return this.pais.compareTo(otroPais.pais);
    }

    @Override
    public String toString() {
        return "Paises{" + "pais=" + pais + '}';
    }
    
}
