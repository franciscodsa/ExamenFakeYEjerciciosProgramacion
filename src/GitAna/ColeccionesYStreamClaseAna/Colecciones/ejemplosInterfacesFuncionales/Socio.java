package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejemplosInterfacesFuncionales;

import java.time.Instant;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Socio {
    int idSocio;
    String nombre;
    LocalDate fNacimiento;

    public Socio(int idSocio, String nombre, LocalDate fNacimiento) {
        this.idSocio = idSocio;
        //this.idSocio = idSocio;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Socio nº " + idSocio + ": " + nombre + " (" + fNacimiento + ")";
    }
}
