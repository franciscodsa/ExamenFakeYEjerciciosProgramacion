package GitAna.ColeccionesYStreamClaseAna.Stream.src.ejemplosStream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Transacción t1 = new Transacción(1, "A. Álvarez", "Madrid", LocalDate.now() , 1000.0);
        Transacción t2 = new Transacción(2, "B. Benítez", "Barcelona", LocalDate.now() , 1500.0);
        Transacción t3 = new Transacción(3, "C. Colby", "Londres", LocalDate.now() , 5000.0);
        Transacción t4 = new Transacción(4, "D. Dimitri", "Londres", LocalDate.now() , 500.0);
        Transacción t5 = new Transacción(5, "E. Estevez", "Madrid", LocalDate.now() , 2500.0);

        List<Transacción> transacciones = new ArrayList<>();
        transacciones.add(t1);
        transacciones.add(t2);
        transacciones.add(t3);
        transacciones.add(t4);
        transacciones.add(t5);

        // stream a partir de una lista
        System.out.println("Stream a partir de una lista");
        double totalLondres = transacciones.stream()
                .filter((transacción) -> transacción.getCiudad().equals("Londres"))
                .mapToDouble(transacción -> transacción.getPrecio())
                .sum();
        //System.out.println(totalLondres);

        // stream a partir de un array
        // a)
        System.out.println("Stream a partir de un array");
        String[] frutas = {"mora", "naranja", "nispero", "pera", "plátano",
                "pomelo", "sandia", "melón", "uva", "piña", "melocotón"};
        AtomicInteger contador = new AtomicInteger(1);
//        Arrays.stream(frutas)
//                .filter(fruta -> fruta.length() > 5) // me filtra las frutas cuyo nombre es mayor que 5
//                .map(fruta -> contador.getAndIncrement() + " " + fruta)
//                .forEach(fruta -> System.out.println("* " + fruta));

        // b)
        long numeroDeDefrutas = Stream.of(frutas).count();
        //System.out.println("Número: " + numeroDeDefrutas);

        // filtrar
        List<Integer> números = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            números.add((int) (Math.random() * 200 - 100));
        }

        for (int i = 0; i < números.size(); i++) {
            //System.out.print(números.get(i) + " ");
            if (i % 50 == 0) {
                //System.out.println();
            }
        }

        // Filtramos los número que sean múltiplos de 3
        números.stream()
                .filter(n -> n % 3 == 0)
                .forEach(n -> System.out.print(n + " "));

        long múltiplosDe3 = números.stream()
                .filter(n -> n % 3 == 0)
                .count();
        System.out.println("\nMúltiplos de 3: " + múltiplosDe3);


    }
}
