package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejemploComparator;

import java.time.LocalDate;

public class Socio {
    int idSocio;
    String nombre;
    LocalDate fNacimiento;

    public Socio(int idSocio, String nombre, LocalDate fNacimiento) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Socio nº " + idSocio + ": " + nombre + " (" + fNacimiento + ")";
    }
}
