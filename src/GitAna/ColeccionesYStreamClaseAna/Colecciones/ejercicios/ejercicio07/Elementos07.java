package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejercicios.ejercicio07;

import java.util.*;

public class Elementos07 {
    public static void main(String[] args) {
//        Insertar en una lista 20 enteros aleatorios entre 1 y 10.
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        // para ver mejor cuáles se repiten, la ordenamos primero
        lista.sort((n1, n2) -> n1 - n2);
        lista.forEach(n -> System.out.print(n + " "));
        System.out.println();
        // vamos a hacer un mapa de frecuencias
        Map<Integer, Integer> frecuencias = new HashMap<>();
        // lo inicializamos poniendo para todas las claves la frecuencia (el valor) a 0
        for (int i = 1; i <= 10 ; i++) {
            frecuencias.put(i, 0);
        }
        // ahora relleno las frecuencias, recorriendo la lista e incrementando el valor (que es como un contador) para cada valor que encuentra
        int clave, valor;
        for (int i = 0; i < lista.size(); i++) {
            clave = lista.get(i);
            valor = frecuencias.get(clave) + 1; // frecuencias.get(clave) contiene el valor para esa clave
            // actualizo la entrada con esa clave y el valor incrementado
            frecuencias.put(clave, valor);
        }
        // imprimo el mapa
        for (Map.Entry<Integer, Integer> entrada: frecuencias.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

//        A partir de ella, crear un
//        conjunto con los elementos de la lista sin repetir, otro con los repetidos y otro
//        con los elementos que aparecen una sola vez en la lista original.
        Set<Integer> numerosSinRepetir = new HashSet<>();
        Set<Integer> numerosRepetidos = new HashSet<>();
        // recorremos el mapa mirando para cada clave qué frecuencia tiene
        for (Map.Entry<Integer, Integer> entrada: frecuencias.entrySet()) {
            if (entrada.getValue() == 1) { // valores únicos
                numerosSinRepetir.add(entrada.getKey());
            } else if (entrada.getValue() > 1) {
                numerosRepetidos.add(entrada.getKey());
            }
        }
        System.out.println("Números repetidos: " + numerosRepetidos);
        System.out.println("Números no repetidos: " + numerosSinRepetir);
    }
}
