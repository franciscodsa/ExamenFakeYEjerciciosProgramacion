package fake.ejercicio02;

public class Defensores extends Jugador{
    int numeroDeGoles;

    public Defensores(String nombre, int dorsal, int numeroDeGoles) {
        super(nombre, dorsal);
        this.numeroDeGoles = numeroDeGoles;
    }
}
