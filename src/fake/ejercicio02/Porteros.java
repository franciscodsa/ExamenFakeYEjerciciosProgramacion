package fake.ejercicio02;

public class Porteros extends Jugador{
    private int numeroDeGoles;
    private int numeroDeParadas;

    public Porteros(String nombre, int dorsal, int numeroDeGoles, int numeroDeParadas) {
        super(nombre, dorsal);
        this.numeroDeGoles = numeroDeGoles;
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeGoles() {
        return numeroDeGoles;
    }

    public void setNumeroDeGoles(int numeroDeGoles) {
        this.numeroDeGoles = numeroDeGoles;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }


    @Override
    public int valorarJugador() {
        return (this.numeroDeGoles * 10) + (this.numeroDeParadas * 5);
    }
}