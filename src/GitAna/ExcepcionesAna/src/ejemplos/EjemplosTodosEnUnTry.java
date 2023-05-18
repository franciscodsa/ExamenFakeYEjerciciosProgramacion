package GitAna.ExcepcionesAna.src.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemplosTodosEnUnTry {
    public static void main(String[] args) {
        try {
            // arrays
            String[] array = {"uno", "dos", "tres"};
            System.out.println(array[3]); // de aquí ya salta una excepción y se va al catch; no se ejecuta el resto del código de este try

            // dividir por 0
            int numerador = 5;
            int denominador = 0;
            System.out.println(numerador / denominador);

            // no concuerda el tipo de dato con la entrada por teclado
            Scanner sc = new Scanner(System.in);
            int entero = sc.nextInt();
        } catch (IndexOutOfBoundsException mesalgodelarray) {
            System.out.println("Me salgo del array");
        } catch (ArithmeticException aritmética) {
            System.out.println("Estoy dividiendo por 0");
        } catch (InputMismatchException datodeotrotipo) {
            System.out.println("No has introducido un número. Has metido otra cosa.");
        } catch (Exception e) {
            System.out.println("Excepción genérica.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }






    }
}
