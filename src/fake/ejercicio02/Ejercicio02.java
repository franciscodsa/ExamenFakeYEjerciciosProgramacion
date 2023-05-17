package fake.ejercicio02;

import java.io.File;
import java.util.*;

public class Ejercicio02 {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("TaLargo");
        File file = new File("src/fake/ejercicio02/plantilla.txt");
        equipo1.añadeJugador(file);

        //Junto los tres Arraylist del equipo en una sola lista
        List<Jugador> jugadoresEquipo1 = new ArrayList<>();
        equipo1.getJugadoresDefensores().forEach(defensor -> jugadoresEquipo1.add(defensor) );
        equipo1.getJugadoresAtacantes().forEach(atacante -> jugadoresEquipo1.add(atacante) );
        equipo1.getJugadoresPorteros().forEach(portero -> jugadoresEquipo1.add(portero) );


        System.out.println("\nJugadores del equipo ordenados por nombre (" + jugadoresEquipo1.size() + " jugadores):");
        //Ordeno el array jugadoresEquipo1 por el nombre de los jugadores
        jugadoresEquipo1.sort(Comparator.comparing(nombreJugador -> nombreJugador.getNombre()));
        //Lo imprimo
        jugadoresEquipo1.forEach(jugador -> System.out.println(jugador));


        System.out.println("\n\nJugadores ordenadospor valoracion de jugador de mayor a menor:");
        //Ordeno el mismo array de mayor a menor usando la valoración de jugadores
        jugadoresEquipo1.sort(Comparator.comparing((Jugador jugador) -> jugador.valorarJugador()).reversed());
        //Imprimo los jugadores
        jugadoresEquipo1.forEach(jugador -> {
            int puntuacion = jugador.valorarJugador();
            String datosJugador = jugador.toString();
            System.out.println(datosJugador + " |Puntuacion: " + puntuacion);
        });


        //Guardo a los porteros en un array para poder iterar sobre ellos y asi calcular su valoracion y sumarla a la variable
        ArrayList<Porteros> arrPorteros = equipo1.getJugadoresPorteros();
        int sumPorteros = 0;
        for (Porteros portero: arrPorteros ) {
            sumPorteros += portero.valorarJugador();
        }
        //Imprimo el total de puntos de porteros
        System.out.println("\n\nSuma de puntos porteros: " + sumPorteros);
        //El metodo max devuelve un optional de un Objeto Portero
        Optional<Porteros> maxPointsPorteros = arrPorteros.stream().max((portero1, portero2) -> portero1.valorarJugador() - portero2.valorarJugador());
        //Imprimo al Portero con mayor puntuación. Hay que usar .get() para sacar al Obejto Porteros del contenedor Optional y asi poder usar los métodos del objeto
        System.out.println("Portero con mayor puntuacion");
        System.out.println(maxPointsPorteros.get().getNombre() + " | Puntuacion: " + maxPointsPorteros.get().valorarJugador());


        //Hago lo mismo que con porteros
        ArrayList<Atacantes> arrAtacantes = equipo1.getJugadoresAtacantes();
        int sumAtacantes = 0;
        for (Atacantes atacante: arrAtacantes ) {
            sumAtacantes += atacante.valorarJugador();
        }
        System.out.println("\n\nSuma de puntos Atacantes: " + sumAtacantes);
        Optional<Atacantes> maxPointsAtacantes = arrAtacantes.stream().max((atacante1, atacante2) -> atacante1.valorarJugador() - atacante2.valorarJugador());

        System.out.println("Atacante con mayor puntuacion");
        System.out.println(maxPointsAtacantes.get().getNombre() + " | Puntuacion: " + maxPointsAtacantes.get().valorarJugador());

        //Hago lo mismo que con porteros
        ArrayList<Defensores> arrDefensores = equipo1.getJugadoresDefensores();
        int sumDefensores = 0;
        for (Defensores defensor: arrDefensores) {
            sumDefensores += defensor.valorarJugador();
        }
        System.out.println("\n\nSuma de puntos defensores: " + sumDefensores);
        Optional<Defensores> maxPointsDefensores = arrDefensores.stream().max((defensor1, defensor2) -> defensor1.valorarJugador() - defensor2.valorarJugador());

        System.out.println("Defensores con mayor puntuacion:");
        System.out.println(maxPointsDefensores.get().getNombre() + " | Puntuacion: " + maxPointsDefensores.get().valorarJugador());
    }
}