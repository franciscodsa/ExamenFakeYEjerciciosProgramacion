package UT8.ejercicio08;

public class Academico {
    private String nombre;
    private int ingreso;

    public Academico(String nombre, int ingreso) {
        this.nombre = nombre;
        this.ingreso = ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        return "Academico" +
                "nombre='" + nombre + '\n' +
                ", ingreso=" + ingreso;
    }
}
