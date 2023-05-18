package GitAna.FicherosAna.Binarios.src.ejemplos.ejemploOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EjemploOutput {
    public static void main(String[] args) {
        // Creamos la lista
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(1, "Roberto", "Aula de DAW1", "11111111"));
        alumnos.add(new Alumno(2, "Valeria", "Aula de DAW1", "11111111"));
        alumnos.add(new Alumno(3, "Daniel", "Aula de DAW1", "11111111"));
        alumnos.add(new Alumno(4, "Francisco", "Aula de DAW1", "11111111"));
        alumnos.add(new Alumno(5, "Jorge", "Aula de DAW1", "11111111"));
        alumnos.add(new Alumno(6, "Aitor", "Aula de DAW1", "11111111"));
        alumnos.add(new Alumno(7, "Christian", "Aula de DAW1", "11111111"));
        alumnos.add(new Alumno(8, "Javier", "Aula de DAW1", "11111111"));
        alumnos.add(new Alumno(9, "Claudia", "Aula de DAW1", "11111111"));
        alumnos.add(new Alumno(10, "Victor", "Aula de DAW1", "11111111"));
        alumnos.add(new Alumno(11, "Valentín", "Aula de DAW1", "11111111"));

        // 1) Ruta / nombre del fichero
        String ruta = "Binarios\\src\\ejemplos\\ejemploOutput\\alumnos.dat";
        // 2) Objeto FileOutputStream
        FileOutputStream flujoSalida = null;
        ObjectOutputStream escritor = null;
        try {
            flujoSalida = new FileOutputStream(ruta);
            // 3) Objeto ObjectOutputStream
             escritor = new ObjectOutputStream(flujoSalida);
             escritor.writeObject(alumnos);




        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Ruta incorrecta");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // hay que cerrarlos en orden inverso al que los has abierto
                escritor.close();
                flujoSalida.close();
            } catch (IOException e) {
                //throw new RuntimeException(e);
                System.out.println("Problema al cerrar el flujo de salida");
            }
        }
    }
}
