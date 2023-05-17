package fake.ejercicio02;

public class Atacantes extends Jugador{
    private int numeroDeGoles;
    private int pasesExitosos;
    private int balonesRecuperados;

    public Atacantes(String nombre, int dorsal, int numeroDeGoles, int pasesExitosos, int balonesRecuperados) {
        super(nombre, dorsal);
        this.numeroDeGoles = numeroDeGoles;
        this.pasesExitosos = pasesExitosos;
        this.balonesRecuperados = balonesRecuperados;
    }

    public int getNumeroDeGoles() {
        return numeroDeGoles;
    }

    public void setNumeroDeGoles(int numeroDeGoles) {
        this.numeroDeGoles = numeroDeGoles;
    }

    public int getPasesExitosos() {
        return pasesExitosos;
    }

    public void setPasesExitosos(int pasesExitosos) {
        this.pasesExitosos = pasesExitosos;
    }

    public int getBalonesRecuperados() {
        return balonesRecuperados;
    }

    public void setBalonesRecuperados(int balonesRecuperados) {
        this.balonesRecuperados = balonesRecuperados;
    }

    @Override
    public int valorarJugador() {
        return (this.numeroDeGoles * 30) + this.pasesExitosos + (this.balonesRecuperados * 3);
    }
}