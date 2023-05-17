package UT7.biblioteca;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(int codigo, String titulo, int añoDePublicacion) {
        super(codigo, titulo, añoDePublicacion);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                ", codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", añoDePublicacion=" + añoDePublicacion +
                '}';
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public void prestado() {
        this.prestado = true;
    }
}
