package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejemploMapas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @see <a href="https://www.discoduroderoer.es/formas-de-recorrer-un-hashmap-en-java/">
 *     Formas de recorrer un HashNao</a>
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        // Formas de recorrer un mapa:
        HashMap<Integer, String> map = generarMapa();
        // 1) recorriendo el conjunto de claves: keySet()
        for (Integer clave: map.keySet()) { // keyset es el conjunto de claves
            //System.out.println("Clave: " + clave + " Valor: " + map.get(clave));
        }
        System.out.println();
        // 2) Con un iterador sobre el conjunto de claves (keySet())
        Iterator<Integer> integerIterator = map.keySet().iterator();
        while (integerIterator.hasNext()) {
            Integer clave = integerIterator.next();
            // y ya con esta clave puedo recurperar el valor
            //System.out.println("K: " + clave + " V: " + map.get(clave));
        }
        // 3) Con la entrada completa: Map.Entry
        for (Map.Entry entrada: map.entrySet()) {
            //System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

        // 4) Con Map.Entry, entrySet() e Iterator para iterar sobre el conjunto de entradas
        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry entrada = entryIterator.next(); // cojo la entrada siguiente
            System.out.println(entrada.getKey() + " <> " + entrada.getValue());
        }

        // 5) Si quiero recorrer sólo las claves: keySet() -> lo convierto en array e imprimo ese array
        System.out.print("\nClaves: " + map.keySet());

        // 6) Si quiero recorrer sólo los valores -> values() -> lo convierto en array e imprimo ese array
        System.out.println("\n\nValores: " + map.values());
    }

    public static HashMap<Integer, String> generarMapa() {
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Pepito");
        mapa.put(2, "Juanito");
        mapa.put(3, "Periquito");
        mapa.put(4, "Victorito");

        return mapa;
    }
}
