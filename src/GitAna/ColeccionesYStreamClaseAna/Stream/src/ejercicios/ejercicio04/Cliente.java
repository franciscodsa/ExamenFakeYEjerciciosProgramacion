package GitAna.ColeccionesYStreamClaseAna.Stream.src.ejercicios.ejercicio04;

import java.time.LocalDate;

public class Cliente {
    private String DNI;
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Cliente(String DNI, String nombre, LocalDate fechaDeNacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                '}';
    }
}
