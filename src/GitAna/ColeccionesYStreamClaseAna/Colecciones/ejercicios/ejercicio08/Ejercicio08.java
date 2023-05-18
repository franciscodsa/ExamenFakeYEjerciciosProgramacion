package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejercicios.ejercicio08;

import java.util.*;

public class Ejercicio08 {
    public static void main(String[] args) {
        // crear 5 académicos
        Academico a3 = new Academico("Arturo Pérez-Reverte", 2003);
        Academico a1 = new Academico("J. A. Pascual", 2002);
        Academico a2 = new Academico("Carmen Iglesias", 2002);
        Academico a4 = new Academico("J. M. Sánchez Ron", 2003);
        Academico a5 = new Academico("J. M. Merino", 2009);

        Map<Character, Academico> academicoMap = new HashMap<>();
        // llenamos el mapa con el método
        nuevoAcadémico(academicoMap, a1, 'T');
        nuevoAcadémico(academicoMap, a2, 'k');
        nuevoAcadémico(academicoMap, a3, 'E');
        nuevoAcadémico(academicoMap, a5, 'm');
        nuevoAcadémico(academicoMap, a4, 'G');

        // imprimimos el mapa
        for (Map.Entry<Character, Academico> entrada: academicoMap.entrySet()) {
            System.out.println(entrada.getKey() + " ---> " + entrada.getValue());
        }

//        Hacer diversos listados de los académicos: primero sin letra, por orden de
//        nombre y de año de ingreso; y después con letra, por orden de letra (clave),
//                nombre y fecha de ingreso. Debemos recordar que, en código Unicode, las
//        mayúsculas van antes que las minúsculas.
        // cojo los académicos (los valores del mapa) y los saco a una lista --> values()
        Collection<Academico> academicoCollection = academicoMap.values();
        // como List implementa Collection, puedo meterlo en una lista
        List<Academico> academicoList = new ArrayList<>(academicoCollection);
        System.out.println(academicoList);
        // ordenamos por nombre
        System.out.println("Académicos (sin letra) por orden de nombre:");
        academicoList.sort((ac1, ac2) -> ac1.getNombre().compareToIgnoreCase(ac2.getNombre()));
        System.out.println(academicoList);
        System.out.println("Académicos (sin letra) por año de ingreso:");
        academicoList.sort((ac1, ac2) -> ac1.getAñoIngreso() - ac2.getAñoIngreso());
        System.out.println(academicoList);
        // con letra --> tirar del mapa
        // para ordenar el mapa por sus claves -> ordenamos las entradas (Entry.Map)
        // nos hacemos una lista de entradas
        List<Map.Entry<Character, Academico>> entryList = academicoMap.entrySet()
                .stream()
                .sorted((entrada1, entrada2) -> entrada1.getKey().compareTo(entrada2.getKey())).toList();
        System.out.println(entryList);
        // con letra --> tirar del mapa
        // ordenar por nombre
        List<Map.Entry<Character, Academico>> entryList2 = academicoMap.entrySet()
                .stream()
                .sorted((entrada1, entrada2) -> entrada1.getValue().getNombre().compareToIgnoreCase(entrada2.getValue().getNombre())).toList(); // entrada.getValue() es un Académico
        System.out.println("\nCon letra, ordenados por nombre:");
        System.out.println(entryList2);
        // ordenar por fecha de ingreso
        List<Map.Entry<Character, Academico>> entryList3 = academicoMap.entrySet()
                .stream()
                .sorted((entrada1, entrada2) -> entrada1.getValue().getAñoIngreso() - entrada2.getValue().getAñoIngreso()).toList();

        System.out.println("\nCon letra, ordenados por año:");
        System.out.println(entryList3);
    }

    static boolean nuevoAcadémico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        // donde se lleva a cabo la inserción después de comprobar que el carácter
        //pasado como parámetro es una letra del abecedario.
        if (Character.isLetter(letra)) {
            academia.put(letra, nuevo);
            return true;
        }
        return false;
    }
}
