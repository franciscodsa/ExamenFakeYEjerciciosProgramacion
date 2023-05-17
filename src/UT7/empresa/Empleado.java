package empresa;

public class Empleado extends Persona {
    double sueldoBruto;

    public Empleado(String nombre, int edad, double sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public double calcularSalarioNeto (double sueldoBruto){
        return  sueldoBruto - (sueldoBruto * 0.15);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Sueldo Bruto: " + this.sueldoBruto);
    }
}
