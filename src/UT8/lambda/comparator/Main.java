package UT8.lambda.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Felipe", 54, new  String[]{"Nauseas", "mareos"});
        Paciente paciente2 = new Paciente("Irene", 32, new String[] {"Tos", "cansancio", "mareos"});
        Paciente paciente3 = new Paciente("Carmen", 15, new String[] {"Ansiedad"});
        Paciente paciente4 = new Paciente("Santiago", 8, new String[]{"Fractura de cadera"});
        Paciente paciente5 = new Paciente("Isabel", 60, new String[] {"Tos", "amnesia", "fiebre", "dolor" });

        List <Paciente> pacientes = new ArrayList<>();

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);

        pacientes.sort(Comparator.comparing(p -> p.getNombre()));

        pacientes.forEach(paciente -> {
            String [] sintomas = paciente.getSíntomas();
            System.out.println(paciente.getNombre() + " " + paciente.getEdad() + " sintomas: " + sintomas.length );
        });

        pacientes.sort(Comparator.comparing((Paciente p) -> p.getNombre()).reversed());

        System.out.println("reversed");
        pacientes.forEach(paciente -> {
            String [] sintomas = paciente.getSíntomas();
            System.out.println(paciente.getNombre() + " " + paciente.getEdad() + " sintomas: " + sintomas.length );
        });
        // Sort pacientes by age in ascending order
        pacientes.sort(Comparator.comparingInt(paciente -> paciente.getEdad()));

        // Sort pacientes by age in descending order
        pacientes.sort(Comparator.comparingInt((Paciente paciente) -> paciente.getEdad()).reversed());

        // Sort pacientes by number of symptoms in ascending order
        pacientes.sort(Comparator.comparingInt(paciente -> paciente.getSíntomas().length));

        // Sort pacientes by number of symptoms in descending order
        pacientes.sort(Comparator.comparingInt((Paciente paciente) -> paciente.getSíntomas().length).reversed());

    }
}
