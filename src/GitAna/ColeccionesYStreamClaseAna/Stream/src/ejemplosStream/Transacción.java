package GitAna.ColeccionesYStreamClaseAna.Stream.src.ejemplosStream;

import java.time.LocalDate;

public class Transacción {
    private int idTransacción;
    private String nombre;
    private String ciudad;
    private LocalDate fecha;
    private double precio;

    public Transacción(int idTransacción, String nombre, String ciudad, LocalDate fecha, double precio) {
        this.idTransacción = idTransacción;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getIdTransacción() {
        return idTransacción;
    }

    public void setIdTransacción(int idTransacción) {
        this.idTransacción = idTransacción;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Transacción{" +
                "idTransacción=" + idTransacción +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", fecha=" + fecha +
                ", precio=" + precio +
                '}';
    }
}
