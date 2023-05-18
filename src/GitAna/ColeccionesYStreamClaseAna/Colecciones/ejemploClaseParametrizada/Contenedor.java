package GitAna.ColeccionesYStreamClaseAna.Colecciones.ejemploClaseParametrizada;

public class Contenedor <T>{ // T = cualquier tipo de dato
    private  T objeto;

    public Contenedor() {
    }

    // hago un setter a mi manera
    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    // hago un getter a mi manera
    public T extraer() {
        return objeto;
    }
}
