package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejemploClaseParametrizada;

public class Main {
    public static void main(String[] args) {
        // creamos un contenedor para guardar un entero
        Contenedor<Integer> numero = new Contenedor<>();
        numero.guardar(123);
        System.out.println(numero.extraer());

        // creamos un contenedor para guardar un String
        Contenedor<String> texto = new Contenedor<>();
        texto.guardar("Holahola");
        System.out.println(texto.extraer());
    }
}
