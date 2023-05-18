package GitAna.ColeccionesYStreamClaseAna.src.ejercicio02;

import java.util.*;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Para practicar con lambda:
        //2.1. Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de la lista.
        String reservadas = "abstract,continue,for,new,switch,assert,default,goto,package,synchronized,boolean,do,if,private,this,break,double,implements,protected,throw,byte,else,import,public,throws,case,enum,instanceof,return,transient,catch,extends,int,short,try,char,final,interface,static,void,class,finally,long,strictfp,volatile,const,float,native,super,while";
        String[] palabrasReservadas = reservadas.split(",");
        //System.out.println(Arrays.toString(palabrasReservadas));
        // hay dos formas de pasar este array a una lista
        //List<String> listaPalabras = Arrays.stream(palabrasReservadas).toList();
        List<String> lista = Arrays.asList(palabrasReservadas);
        lista.forEach(n -> System.out.print(n + " "));
        //2.2. Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras tienen más de 5 caracteres.
        long filtro = lista.stream()
                .filter(palabra -> palabra.length() > 5)
                .count();
        System.out.println("\n" + filtro);
        //2.3. Crea una lista de números enteros y utiliza una expresión lambda para encontrar el número mayor.
        List<Integer> enteros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            enteros.add((int) (Math.random() * 200 - 100));
        }
        // para sacar el máximo de una lista, tenemos dos opciones
        // 1) ordenar de mayor a menor y luego coger el primer número
        enteros.sort((n1, n2) -> n2 - n1);
        System.out.println(enteros);
        System.out.println("Máximo: " + enteros.get(0));
        // 2) método max -> ¡¡¡NEW!!! EL PROBLEMA ES QUE max DEVUELVE UN OPTIONAL ¿cómo se utiliza? 1) lo guardamos y 2) utilizamos un if con isPresent() y luego get()
        Optional<Integer> máximo = enteros.stream().max((n1, n2) -> n1 - n2);
        // para sacar el número es así:
        if (máximo.isPresent()) {
            System.out.println("Máximo: " + máximo.get());
        }
        //2.4. Crea una lista de números enteros y utiliza una expresión lambda para encontrar la suma de los números pares.
        int suma= enteros.stream()
                .filter(n -> n % 2 == 0) // filtramos los pares
                .reduce(0, (a, b) -> a + b);
        System.out.println("Suma: " + suma);
        //2.5. Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para encontrar la persona más joven.
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("A", "15"));
        personas.add(new Persona("B", "10"));
        personas.add(new Persona("C", "53"));
        personas.add(new Persona("D", "40"));
        personas.add(new Persona("E", "27"));

        Persona persona = personas.stream()
                .sorted((p1,p2)-> Integer.parseInt(p1.getEdad())  - Integer.parseInt(p2.getEdad())) // ordenamos por edad
                .findFirst()
                .get();// cogemos el primero, como findFirst() devuelve un Optional
        System.out.println("Persona más joven: " + persona);
                //.ifPresent(p-> System.out.println("La persona mas joven es " + p)); // otra forma, si queremos imprimir directamente

        System.out.println("\n2.6");
        // 2.6. Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para ordenar la lista por edad, de menor a mayor.
        personas.stream()
                .sorted((p1,p2) -> Integer.parseInt(p1.getEdad())  - Integer.parseInt(p2.getEdad()))
                .forEach(n-> System.out.println(n + " "));
        //2.7. Crea una lista de objetos de tipo Persona y utiliza una expresión lambda para filtrar las personas que tienen una edad mayor a 30.
        System.out.println("\n2.7");
        personas.stream()
                .filter(p -> Integer.parseInt(p.getEdad()) > 30)
                .forEach(System.out::println);

        //2.8. Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una expresión lambda para calcular el precio total de la lista.
        System.out.println("2.8");
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Café Latte", 0.9));
        productos.add(new Producto("Aceite de oliva", 3.98));
        productos.add(new Producto("Horchata", 0.94));
        productos.add(new Producto("Tomate pera", 1.89));
        productos.add(new Producto("Café natural molido", 2.67));
        productos.add(new Producto("Bolsas de basura", 1.95));

        double precioTotal =productos.stream()
                .mapToDouble(p -> p.getPrecio())// queremos "mapear" cada producto con su precio; significa: para cada producto, sacame el precio
                .reduce(0,(a,b)-> a+ b);
        System.out.printf("El precio total es: %.2f", precioTotal);
        //2.9. Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar la lista por precio, de mayor a menor.
        //.sorted((p1, p2) -> (p2.getPrecio() - p1.getPrecio())) --> con double no se puede hacer esto
        // Como para ordenar tenemos números decimales tenemos que "reescribir" el método compare de la interfaz Comparator
        // 1) Instanciamos la interfaz comparator
        Comparator<Producto> comparator = new Comparator<Producto>() {
            // 2) reescribimos el método
            @Override
            public int compare(Producto o1, Producto o2) {
                if (o1.getPrecio() > o2.getPrecio()) {
                    return -1;
                } else if (o1.getPrecio() < o2.getPrecio()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        // 3) Y ese comparador ya se lo pasamos al método sorted
        // Opción Ana (loser)
        System.out.println("\nOpción Ana");
        productos.stream()
                .sorted(comparator)
                .forEach(System.out::println);

        // opción Valentín:
        System.out.println("Opción Valentín");
        productos.stream()
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .forEach(System.out::println);

        // Opción Víctor:
        System.out.println("Opción Víctor");
        productos.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()))
                .forEach(n -> System.out.println(n + ""));

        //2.10. Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar los productos que tienen un precio menor a 10.
        System.out.println("2.10");
        productos.stream()
                .filter(producto -> producto.getPrecio() < 1)
                .forEach(System.out::println);



    }
}
