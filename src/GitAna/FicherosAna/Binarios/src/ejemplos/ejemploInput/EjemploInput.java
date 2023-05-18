package GitAna.FicherosAna.Binarios.src.ejemplos.ejemploInput;

//import ejemplos.ejemploOutput.Alumno;

import GitAna.FicherosAna.Binarios.src.ejemplos.ejemploOutput.Alumno;

import java.io.*;
import java.util.List;

public class EjemploInput {
    public static void main(String[] args) {
        // vamos a deserializar el fichero alumnos.dat
        // 1) Ruta
        String ruta = "Binarios\\src\\ejemplos\\ejemploOutput\\alumnos.dat";
        // 2) Objeto FileInputStream
        FileInputStream fileInputStream = null;
        // 3) Objeto ObjectInputStream (lector)
        ObjectInputStream lector = null;
        try {
            fileInputStream = new FileInputStream(ruta);
            lector = new ObjectInputStream(fileInputStream);
            // como hemos guardado una lista, lo vamos a recuperar en la misma forma
            List<Alumno> alumnos = (List<Alumno>) lector.readObject();
            alumnos.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Fichero no encontrado.");
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Error de E/S");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("No encuentra la clase Alumno");
        }
    }
}
