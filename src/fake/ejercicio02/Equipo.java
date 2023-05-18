package fake.ejercicio02;

import java.io.*;
import java.util.*;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Atacantes> jugadoresAtacantes;
    private ArrayList<Defensores> jugadoresDefensores;
    private ArrayList<Porteros> jugadoresPorteros;

    private Set <Integer> numerosEnUso; //LOS SETS NO PERMITEN DUPLICADOS

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.numerosEnUso = new HashSet<>();
        this.jugadoresAtacantes = new ArrayList<>();
        this.jugadoresDefensores = new ArrayList<>();
        this.jugadoresPorteros = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Atacantes> getJugadoresAtacantes() {
        return jugadoresAtacantes;
    }

    public void setJugadoresAtacantes(ArrayList<Atacantes> jugadoresAtacantes) {
        this.jugadoresAtacantes = jugadoresAtacantes;
    }

    public ArrayList<Defensores> getJugadoresDefensores() {
        return jugadoresDefensores;
    }

    public void setJugadoresDefensores(ArrayList<Defensores> jugadoresDefensores) {
        this.jugadoresDefensores = jugadoresDefensores;
    }

    public ArrayList<Porteros> getJugadoresPorteros() {
        return jugadoresPorteros;
    }

    public void setJugadoresPorteros(ArrayList<Porteros> jugadoresPorteros) {
        this.jugadoresPorteros = jugadoresPorteros;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", jugadoresAtacantes=" + jugadoresAtacantes +
                ", jugadoresDefensores=" + jugadoresDefensores +
                ", jugadoresPorteros=" + jugadoresPorteros +
                ", numerosEnUso=" + numerosEnUso +
                '}';
    }

    public void añadeJugador(){
        String respuesta= "S";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quieres añadir un jugador? S/N");
            respuesta = scanner.nextLine().toUpperCase();
            String tipoDeJugador = "";
            if (respuesta.equals("S")) {
                System.out.println("Que tipo de jugador quieres añadir? \n" + "   Atacante: A\n   Defensor: D\n   Portero: P");
                tipoDeJugador = scanner.nextLine().toUpperCase();
                String nombre = "jugador";
                Random random = new Random();

                Integer numero = 1;
                while (numerosEnUso.contains(numero)) {
                    numero = generarNumero();
                }
                int goles = random.nextInt(900);
                int pases = random.nextInt(10000);
                int recuperadas = random.nextInt(5000);
                int atajadas = random.nextInt(750);
                if (tipoDeJugador.equals("A")) {
                    jugadoresAtacantes.add(new Atacantes(nombre + numero, numero, goles, pases, recuperadas));
                    this.numerosEnUso.add(numero);
                } else if (tipoDeJugador.equals("D")) {
                    jugadoresDefensores.add(new Defensores(nombre + numero, numero, goles, pases, recuperadas));
                    this.numerosEnUso.add(numero);
                } else if (tipoDeJugador.equals("P")) {
                    jugadoresPorteros.add(new Porteros(nombre + numero, numero, goles, atajadas));
                    this.numerosEnUso.add(numero);
                } else {
                    System.out.println("Ingrese una opcion valida");
                }
            }

        }while (!respuesta.equals("N"));

    }

    public void añadeJugador(File file){
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
            String [] jugador;
            String line;
            br.readLine();

            //RECUERDA NO PONER br.readLine() PORQUE QUEDARAN LINEAS SIN EVALUARSE
            while ((line = br.readLine())!= null){
                jugador = line.split(";");
                String nombre = jugador[1];
                int numero = Integer.parseInt(jugador[2]);
                int goles = Integer.parseInt(jugador[3]);
                int pases = Integer.parseInt(jugador[4]);
                int atajadas = Integer.parseInt(jugador[4]);


                String tipoDeJugador = jugador[0].toUpperCase();
                if (tipoDeJugador.equals("A")){
                    int recuperadas = Integer.parseInt(jugador[5]);
                    jugadoresAtacantes.add(new Atacantes(nombre, numero,goles, pases, recuperadas));
                    numerosEnUso.add(numero);
                } else if (tipoDeJugador.equals("D")) {
                    int recuperadas = Integer.parseInt(jugador[5]);
                    jugadoresDefensores.add(new Defensores(nombre, numero,goles, pases, recuperadas));
                    numerosEnUso.add(numero);
                } else if (tipoDeJugador.equals("P")) {
                    jugadoresPorteros.add(new Porteros(nombre, numero, goles, atajadas));
                    numerosEnUso.add(numero);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Ha Ocurrido un error inesperado al leer el archivo");
        }
    }

    public Integer generarNumero(){
        Random random = new Random();
        return random.nextInt(99) + 1;
    }

    public Map<Integer, String> generarMapaDePlantilla(){
        Map<Integer, String> mapaDePlantilla = new HashMap<>();

        this.jugadoresPorteros.forEach((jugador) -> {
            Integer dorsal = jugador.getDorsal();
            String nombre = jugador.getNombre();

            mapaDePlantilla.put(dorsal, nombre);
        });

        this.jugadoresAtacantes.forEach((jugador) -> {
            Integer dorsal = jugador.getDorsal();
            String nombre = jugador.getNombre();

            mapaDePlantilla.put(dorsal, nombre);
        });

        this.jugadoresDefensores.forEach((jugador) -> {
            Integer dorsal = jugador.getDorsal();
            String nombre = jugador.getNombre();

            mapaDePlantilla.put(dorsal, nombre);
        });

        return mapaDePlantilla;
    }
}