package UT7.biblioteca;

public class Revista extends Publicacion {
    private int numero;

    public Revista(int codigo, String titulo, int añoDePublicacion, int numero) {
        super(codigo, titulo, añoDePublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revistas{" +
                "numero=" + numero +
                ", codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", añoDePublicacion=" + añoDePublicacion +
                '}';
    }

}
