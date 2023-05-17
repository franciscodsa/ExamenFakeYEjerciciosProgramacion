package fake.ejercicio01;

import java.io.*;
import java.util.*;


public class Ejercicio01 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        File file = new File("src/fake/ejercicio01/coches.txt");
        String añoFiltro;
        //IMPORTANTE PONER TRUE EN FILEWRITER PARA QUE HAGA APPEND Y NO SOBREESCRIBA EL FICHERO EN CADA EJECUCION
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)){
            if (!file.exists()){
                file.createNewFile();
            }
            String respuesta = "";
            do {
                System.out.println("Quieres ingresar un coche? S/N");
                respuesta = scanner.nextLine().toUpperCase();
                if (respuesta.equals("S")){
                    System.out.println("Matricula: ");
                    String matricula = scanner.nextLine();
                    String añoDeCompra ;
                    String numeroDePuertas;
                    System.out.println("Año de compra: ");
                    añoDeCompra = scanner.nextLine();
                    System.out.println("Numero de puertas: ");
                    numeroDePuertas = scanner.nextLine();
                    bw.write("Coche " + matricula + " " + añoDeCompra + " " + numeroDePuertas + "\n");
                }
            }while (!respuesta.equals("N"));
            System.out.println("Por que año quieres filtrar?");
            añoFiltro = scanner.nextLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        filtrarPorAño(file, añoFiltro);
    }

    public static void filtrarPorAño (File file, String año){
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
            String linea;
            List<String> coche = new ArrayList<>();
            while ((linea= br.readLine())!= null){
                coche = Arrays.stream(linea.split(" ")).toList();
                if (coche.get(2).equals(año)){
                    System.out.println(linea);
                }else {
                    System.out.println("no hay noingun coche de ese año");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo proporcionado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
