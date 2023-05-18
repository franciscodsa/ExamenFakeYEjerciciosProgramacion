package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejercicios.ejercicio09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio09 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 9. Implementa una agenda telefónica utilizando la clase HashMap, con métodos CRUD (Create, Read, Update, Delete), es decir: dar de alta un contacto, obtener
        //los datos de un contacto, actualizar los datos de un contacto y eliminar un
        //contacto, y un menú para gestionar eso.

        // Vamos a hacer un mapa que guarde teléfono (K) y nombre (V)
        Map<String, String> agenda = new HashMap<>();
        menu(agenda);
    }

    private static void menu(Map<String, String> agenda) {
        int operacion = 0;
        do {
            System.out.println("Elige operación:\n1. Crear contacto\n2. Consultar contacto\n3. Actualizar contacto\n4. Eliminar contacto\n5. Imprimir agenda\n0. Salir");
            operacion = sc.nextInt();sc.nextLine();
            switch (operacion) {
                case 0 -> {break;}
                case 1 -> crearContacto(agenda);
                case 2 -> consultarContacto(agenda);
                case 3 -> actualizarContacto(agenda);
                case 4 -> eliminarContacto(agenda);
                case 5 -> imprimirAgenda(agenda);
                default -> System.out.println("Opción incorrecta.");
            }
        } while (operacion != 0);
    }

    private static void eliminarContacto(Map<String, String> agenda) {
        String telefono = pedirTelefono();
        if (agenda.containsKey(telefono)) {
            agenda.remove(telefono);
        } else {
            System.out.println("El teléfono no está en la agenda.");
        }
    }

    private static void actualizarContacto(Map<String, String> agenda) {
        String telefono = pedirTelefono();
        // tenemos que ver si el teléfono este está en el mapa
        if (agenda.containsKey(telefono)) {
            // guardamos el nombre asociado a ese teléfono
            String nombre = agenda.get(telefono);
            // creamos una entrada con este nombre y el nuevo teléfono
            System.out.print("Nuevo ");
            String nuevo = pedirTelefono();
            agenda.put(nuevo, nombre);
            // elimino la entrada antigua
            agenda.remove(telefono);
        } else {
            System.out.println("El teléfono no está en la agenda.");
        }
    }

    private static void consultarContacto(Map<String, String> agenda) {
        String telefono = pedirTelefono();
        System.out.println(agenda.get(telefono));
    }

    private static void crearContacto(Map<String, String> agenda) {
        String nombre = pedirNombre();
        String telefono = pedirTelefono();
        agenda.put(telefono, nombre);
        System.out.println("Se ha creado el contacto.");
    }

    private static String pedirTelefono() {
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        // quiero quitar todos los espacios al teléfono
        telefono = telefono
                .trim() // quito los espacios de delante y de detrás
                .replace(" ", ""); // quitamos los espacios del medio
        return telefono;
    }

    private static String pedirNombre() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        return nombre;
    }

    private static void imprimirAgenda(Map<String, String> agenda) {
        System.out.println("\nAgenda:");
        for (Map.Entry<String, String> entrada: agenda.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
