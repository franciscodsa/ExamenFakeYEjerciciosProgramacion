package UT8.ejercicio01;

public class Hotel {
    private int idHotel;
    private Zona zona;
    private int precio;

    public Hotel(int idHotel, Zona zona, int precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Hotel: \n" +
                "idHotel: " + idHotel +
                ", \nzona: " + zona +
                ", \nprecio: " + precio ;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
