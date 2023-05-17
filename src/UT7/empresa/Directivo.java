package UT7.empresa;

public class Directivo extends Empleado{
    Categoria categoria;

    public Directivo(String nombre, int edad, double sueldoBruto, Categoria categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Categoria: " + this.categoria);
    }
}
