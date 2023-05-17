package fake.ejercicio02;

public class Atacantes extends Jugador{
    int numeroDeGoles;
    private int pasesExitosos;
    private int balonesRecuperados;

    public Atacantes(String nombre, int dorsal, int numeroDeGoles) {
        super(nombre, dorsal);
        this.numeroDeGoles = numeroDeGoles;
    }
}
