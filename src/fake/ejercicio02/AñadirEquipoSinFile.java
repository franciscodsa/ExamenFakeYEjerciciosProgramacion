package fake.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class AñadirEquipoSinFile {
    public static void main(String[] args) {
        Equipo equipo2 = new Equipo("asdasd");

        equipo2.añadeJugador();

        List<Jugador> jugadoresequipo2 = new ArrayList<>();
        equipo2.getJugadoresDefensores().forEach(defensor -> jugadoresequipo2.add(defensor) );
        equipo2.getJugadoresAtacantes().forEach(atacante -> jugadoresequipo2.add(atacante) );
        equipo2.getJugadoresPorteros().forEach(portero -> jugadoresequipo2.add(portero) );

        System.out.println(jugadoresequipo2.size());
    }
}
