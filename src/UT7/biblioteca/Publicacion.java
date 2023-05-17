package UT7.biblioteca;

public abstract class Publicacion {
    int codigo;
    String titulo;
    int añoDePublicacion;

    public Publicacion(int codigo, String titulo, int añoDePublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoDePublicacion = añoDePublicacion;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getAñoDePublicacion() {
        return this.añoDePublicacion;
    }


}
