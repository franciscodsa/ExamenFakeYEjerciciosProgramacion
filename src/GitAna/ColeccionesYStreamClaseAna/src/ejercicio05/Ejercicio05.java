package GitAna.ColeccionesYStreamClaseAna.src.ejercicio05;

import java.util.function.Function;

public class Ejercicio05 {
    public static void main(String[] args) {
        Function<String, Integer> funcion1 = s -> s.length();
        Function<Integer, Integer> funcion2 = n -> n * n;
        Function<Double, Double> funcion3 = n -> n * 0.1;
    }
}
