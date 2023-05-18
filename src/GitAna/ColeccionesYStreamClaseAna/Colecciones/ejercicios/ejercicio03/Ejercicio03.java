package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejercicios.ejercicio03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Implementar una aplicación en la que se insertan 20 números enteros aleatorios
        //entre 1 y 10 (incluidos), que pueden estar repetidos, en una colección.
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaNumeros.add((int) (Math.random() * 10 + 1));
        }
        // antes de imprimir, vamos a ordenar los elementos para ver mejor los repetidos
        listaNumeros.sort((n1, n2) -> n1 - n2);
        listaNumeros.forEach(n -> System.out.print(n + " "));

        // A
        //continuación, se crea una lista con los mismos elementos sin repeticiones.
        // un Set es
        Set<Integer> conjuntoNumeros = new HashSet<>(listaNumeros); // de esta forma le meto la lista

        // otra forma
//        Set<Integer> otroConjunto = new HashSet<>();
//        otroConjunto.addAll(listaNumeros);
        System.out.println();
        conjuntoNumeros.forEach(n -> System.out.print(n + " "));

    }
}
