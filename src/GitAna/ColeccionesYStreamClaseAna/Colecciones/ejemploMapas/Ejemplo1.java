package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejemploMapas;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @see <a href="https://refactorizando.com/metodos-hashmap-java/#:~:text=%C2%BFQu%C3%A9%20es%20un%20HashMap%3F,y%20no%20se%20encuentra%20ordenada.">
 *     Métodos principales de HashMap
 *     </a>
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        // Creamos un mapa
        // K (clave): id
        // V (valor): nombre
        HashMap<Integer, String> mapa = new HashMap<>();
        // 1) Añadir elementos
        mapa.put(1, "Pepito");       
        mapa.put(2, "Juanito");       
        mapa.put(3, "Periquito");       
        mapa.put(4, "Victorito");
        // 2) Recuperar elementos: le doy la clave para que me recupere el valor
        System.out.println(mapa.get(3)); // 3 es la clave, no la posición
        System.out.println(mapa.get(2));
        // 3) Si queremos hacer algo en función de que exista la clave o no: containsKey()
        if (mapa.containsKey(5)) {
            System.out.println(mapa.get(5));
        } else {
            System.out.println("No existe la clave indicada.");
        }
        // 4) Eliminar una entrada de un mapa
        if (mapa.containsKey(4)) {
            mapa.remove(4);
        }
        if (mapa.containsKey(4)) {
            System.out.println(mapa.get(4));
        } else {
            System.out.println("La clave no existe");
        }
    }
}
