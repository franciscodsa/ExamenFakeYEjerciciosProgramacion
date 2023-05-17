package fake.ejercicio02;

public abstract class Jugador implements Estadísticas {
    private String nombre;
    private int dorsal;

    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " |Dorsal: " + this.dorsal;
    }
}