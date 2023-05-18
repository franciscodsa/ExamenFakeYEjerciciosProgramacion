package GitAna.ExcepcionesAna.src.ejercicios.ejercicio02;

public class Ejercicio02 {
    public static void main(String[] args) {
        //1. ArithmeticException: Esta excepción se lanza cuando ocurre una condición de error aritmético, como la división por cero.
        int x = 5;
        int y = 0;
        try {
            int z = x / y; // Esto arrojará una excepción ArithmeticException
        } catch (ArithmeticException arithmeticException) {
            System.out.println("No se puede realizar una división entre 0");
        }

        //2. NumberFormatException: Esta excepción se lanza cuando se intenta convertir una cadena que no es un número válido en un tipo numérico.
        String str = "abc";
        try {
            int num = Integer.parseInt(str); // Esto arrojará una excepción NumberFormatException porque "abc" no es un número válido
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Tienes que proporicionar algo que pueda convertirse en un número.");
        }
        //3. OverflowException: Esta excepción se lanza cuando se produce un desbordamiento de los límites de un tipo numérico, es decir, cuando se
        //intenta almacenar un valor fuera del rango permitido para ese tipo de datos.
        int x1 = Integer.MAX_VALUE;
        int y1 = x1 + 1000000000; // Esto arrojará una excepción OverflowException porque y excede el valor máximo permitido para un int
        System.out.println(y1);
        System.out.println("ChatGPT bullshit. No salta la excepción pero tampoco da el resultado correcto.");
    }
}
