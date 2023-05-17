package UT7.empresa;

public class Cliente extends Persona{
    String telefonoDeContacto;

    public Cliente(String nombre, int edad, String telefonoDeContacto) {
        super(nombre, edad);
        this.telefonoDeContacto = telefonoDeContacto;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Telefono: " + this.telefonoDeContacto);
    }
}
