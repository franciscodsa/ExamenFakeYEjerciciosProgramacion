package GitAna.ColeccionesYStreamClaseAna.src; /**
 * @author Daniel Martin Corpa
 * 19/4/23
 * 12:10
 * @version version of class
 * @return value to return
 * @throws Errors that throws
 * @since since version
 * @deprecated Method deprecated
 */

/**
 * @param
 * @see ""
 *
 */
// 1. Crea una clase denominada Hotel con los atributos idHotel (int), zona(String), y
//precio (int). Los valores para zona podrán ser "playa","montaña" o "rural". El
//precio supondremos que es un dato en euros que podrá tomar valores entre 40
//y 150.
//Crea una clase con el método main donde se cree un conjunto sin ordenar de
//12 hoteles. El programa nos mostrará por consola este conjunto de hoteles y
//nos preguntará en qué zona queremos el hotel.
//Tras ésto el programa creará un conjunto ordenado por precio con los hoteles
//cuya zona corresponda con la zona elegida y los mostrará por consola.

public class Hotel {
private int idHotel,precio;
private String zona;

    public Hotel(int idHotel, int precio, String zona) {
        this.idHotel = idHotel;
        this.precio = precio;
        this.zona = zona;

    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Hotel " +
                "idHotel= " + idHotel +
                ", precio= " + precio +
                ", zona= " + zona
                ;
    }
}
