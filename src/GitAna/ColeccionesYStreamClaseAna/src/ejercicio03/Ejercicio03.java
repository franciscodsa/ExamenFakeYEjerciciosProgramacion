package GitAna.ColeccionesYStreamClaseAna.src.ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio03 {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Felipe R.", 54, new String[] {"náuseas", "mareos"}));
        pacientes.add(new Paciente("Irene M.", 32, new String[] {"tos", "cansancio", "mareos"}));
        pacientes.add(new Paciente("Carmen C.", 15, new String[] {"ansiedad"}));
        pacientes.add(new Paciente("Santiago A.", 8, new String[] {"fractura de cadeera"}));
        pacientes.add(new Paciente("Isabel A.", 60, new String[] {"tos", "amnesia", "fiebre", "dolor"}));

        System.out.println("Ordenados por nombre: ");
        pacientes.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        pacientes.forEach(p -> System.out.println(p.getNombre()));

        System.out.println("\nOrdenados por edad: ");
        pacientes.sort((p1, p2) -> p1.getEdad() - p2.getEdad());
        pacientes.forEach(p -> System.out.println(p.getEdad()));

        System.out.println("\nOrdenados por número de síntomas: "); // o sea, longitud del array de síntomas
        pacientes.sort((p1, p2) -> p1.getSíntomas().length - p2.getSíntomas().length);
        pacientes.forEach(p -> System.out.println(p.getSíntomas().length));

    }
}
