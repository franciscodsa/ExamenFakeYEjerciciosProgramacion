package figuras;

public class Linea {
    int dimensiones;
    Punto puntoInicio;
    Punto puntoFin;

    public Linea(Punto puntoInicio, Punto puntoFin){
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
    }

    public double calcularLongitud () {
        return (Math.sqrt((Math.pow(this.puntoFin.x - this.puntoInicio.x, 2) + (Math.pow(this.puntoFin.y - this.puntoInicio.y, 2)))));
    }

    @Override
    public String toString() {
        return "Linea{" +
                "dimensiones=" + dimensiones +
                ", puntoInicio=" + puntoInicio +
                ", puntoFin=" + puntoFin +
                '}';
    }

    public void dibujarLinea(){
        for (int i = 0; i < this.calcularLongitud(); i++) {
            System.out.print("*");
        }
    }
}
