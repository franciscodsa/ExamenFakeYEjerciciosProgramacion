package UT7.empresa;

import java.util.ArrayList;

public class Empresa {
    String nombre;
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Empresa(String nombre, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                ", clientes=" + clientes +
                '}';
    }

    public void mostrar (){
        System.out.println(this);
    }
}
