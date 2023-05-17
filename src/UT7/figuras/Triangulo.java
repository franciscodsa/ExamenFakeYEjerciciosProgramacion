package UT7.figuras;

import java.util.ArrayList;

public class Triangulo extends Figura2D{
    Punto p1;
    Punto p2;
    Punto p3;

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        super(3);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangulo(ArrayList<Punto> puntos){
        super(3);
        this.p1 = puntos.get(0);
        this.p2 = puntos.get(1);
        this.p3 = puntos.get(2);

    }

    @Override
    protected ArrayList<Linea> crearLineas() {
        ArrayList<Linea> lineas = new ArrayList<>();
        Linea linea12 = new Linea(this.p1, this.p2);
        Linea linea23 = new Linea(this.p2, this.p3);
        Linea linea31 = new Linea(this.p3, this.p1);

        lineas.add(linea12);
        lineas.add(linea23);
        lineas.add(linea31);

        return lineas;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }

    @Override
    protected double calcularPerimetro() {
        ArrayList<Linea> lineas = crearLineas();
        double perimetro = lineas.get(0).calcularLongitud() + lineas.get(1).calcularLongitud() + lineas.get(2).calcularLongitud() ;
        return perimetro;
    }

    @Override
    protected double calcularArea() {
        ArrayList<Linea> lineas = crearLineas();
        double base = lineas.get(2).calcularLongitud();
        double area = ( base * (lineas.get(1).calcularLongitud() ))/2;
        return 0;
    }
}
