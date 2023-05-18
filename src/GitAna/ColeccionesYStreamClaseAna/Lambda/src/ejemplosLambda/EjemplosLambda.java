package GitAna.ColeccionesYStreamClaseAna.Lambda.src.ejemplosLambda;

public class EjemplosLambda {
    public static void main(String[] args) {
        EjemplosLambda ejemplosLambda = new EjemplosLambda();
        ejemplosLambda.ejemplo1(12);

        // instanciamos la interfaz funcional
        ValidaImpar vi = n -> n % 2 != 0;
        // usar el método de la interfaz con el objeto creado
        System.out.println(vi.esImpar(5));

        // otro ejemplo
        DevuelvePI dp = () -> Math.PI;
    }

    public boolean ejemplo1(int n) {
        return n % 2 != 0;
    }

    public boolean ejemplo2(Character c) {
        return c == 'y';
    }

    public double ejemplo3(double x, double y) {
        return x + y;
    }

    public int ejemplo4(int a, int b) {
        return a * a + b * b;
    }

    public int ejemplo5() {
        return 42;
    }

    public double ejemplo6() {
        return Math.PI;
    }

    public void ejemplo7(String s) {
        System.out.println(s);
    }

    public void ejemplo8() {
        System.out.println("Hola, mundo.");
    }

    // Como ejercicio, trata de “traducir” la expresión anterior a un método (estático o de
    //instancia, aquí es irrelevante):
    public int[] sumaResta(int a, int b) {
        int suma = a + b;
        int resta = a - b;
        return new int[] {suma, resta};
    }
}
