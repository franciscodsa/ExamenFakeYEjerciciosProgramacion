package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejercicios.ejercicio04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Implementar una aplicación donde se insertan 100 números enteros aleatorios
        //entre 1 y 10 incluidos, que pueden estar repetidos, en una colección.
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listaNumeros.add((int) (Math.random() * 10 + 1));
        }
        // antes de imprimir, vamos a ordenar los elementos para ver mejor los repetidos
        listaNumeros.sort((n1, n2) -> n1 - n2);
        listaNumeros.forEach(n -> System.out.print(n + " "));

        // Después se eliminan todos los elementos que valen 5. Mostrar la colección antes y
        //después de la eliminación. Utiliza un iterador.
        // podríamos hacerlo con removeIf, pero me obligan a usar un iterador
        Iterator<Integer> iterator = listaNumeros.iterator();
        while (iterator.hasNext()) {
            Integer número = iterator.next();
            if (número == 5) {
                iterator.remove(); // ¡¡ iterator tiene un método remove() !!
            }
        }
        System.out.println();
        listaNumeros.forEach(n -> System.out.print(n + " "));
    }
}
