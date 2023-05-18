package GitAna.ColeccionesYStreamClaseAna.Stream.src.ejercicios.ejercicio04;

import java.time.LocalDate;
import java.util.Arrays;

public class Ejercicio04 {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[5];
        clientes[0] = new Cliente("11111111A", "Asdrúbal", LocalDate.of(2004,12,15));
        clientes[1] = new Cliente("22222222B", "Benito", LocalDate.of(2001,5,6));
        clientes[2] = new Cliente("33333333C", "Carlota", LocalDate.of(1988,7,9));
        clientes[3] = new Cliente("44444444D", "Demetria", LocalDate.of(2002,10,10));
        clientes[4] = new Cliente("55555555E", "Esperanza", LocalDate.of(1972,2,2));

        Arrays.stream(clientes)
                .sorted((c1, c2) -> c1.getFechaDeNacimiento().compareTo(c2.getFechaDeNacimiento()))
                .forEach(System.out::println);

    }
}

