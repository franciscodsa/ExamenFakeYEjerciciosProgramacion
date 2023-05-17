package UT7.empresa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado("Juan Pérez", 25, 1500.0);
        Empleado empleado2 = new Empleado("María Rodríguez", 30, 2000.0);
        Directivo directivo = new Directivo("Pedro García", 40, 5000.0, Categoria.CEO);

        // Crear clientes
        Cliente cliente1 = new Cliente("Ana López", 35, "123456789");
        Cliente cliente2 = new Cliente("Carlos Gómez", 45, "987654321");

        // Crear lista de empleados y clientes
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(directivo);

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        // Crear UT7.empresa
        Empresa empresa = new Empresa("Mi Empresa", listaEmpleados, listaClientes);

        // Mostrar información de la UT7.empresa
        empresa.mostrar();
        cliente2.mostrar();
    }
}
