package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejercicios.ejercicio08;

public class Academico {
    private String nombre;
    private int añoIngreso;

    public Academico(String nombre, int añoIngreso) {
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    @Override
    public String toString() {
        return nombre +
                " " + añoIngreso +
                "\n";
    }
    // El criterio de ordenación natural será por nombres.
    // => quiere decir que sobreescribamos el método compareTo
    public int compareTo(Academico a) {
        return this.nombre.compareToIgnoreCase(a.nombre);
    }
}
