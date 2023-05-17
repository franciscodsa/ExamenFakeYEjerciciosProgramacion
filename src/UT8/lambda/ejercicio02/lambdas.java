package UT8.lambda.ejercicio02;

import java.util.*;
import java.util.stream.*;

public class lambdas {

    public static void main(String[] args) {

        // 2.1. Imprimir cada elemento de la lista de Strings
        List<String> listaStrings = Arrays.asList("Hola", "Mundo", "Lambda", "Java");
        listaStrings.forEach(str -> {System.out.println(str);});

        // 2.2. Contar cuántas palabras tienen más de 5 caracteres en una lista de Strings
        List<String> listaStrings2 = Arrays.asList("Hola", "Mundo", "Lambda", "Java");
        long count = listaStrings2.stream().filter(str -> {return str.length() > 5;}).count();
        System.out.println("Hay " + count + " palabras con más de 5 caracteres.");

        // 2.3. Encontrar el número mayor en una lista de números enteros
        List<Integer> listaNumeros = Arrays.asList(2, 4, 6, 8, 10);
        int max = listaNumeros.stream().max((a,b) -> {return a.compareTo(b);}).get();
        System.out.println("El número mayor es: " + max);

        // 2.4. Encontrar la suma de los números pares en una lista de números enteros
        List<Integer> listaNumeros2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = listaNumeros2.stream().filter(n -> {return n % 2 == 0;}).mapToInt(n -> {return n.intValue();}).sum();
        System.out.println("La suma de los números pares es: " + sum);

        // 2.5. Encontrar la persona más joven en una lista de objetos de tipo Persona
        List<Persona> listaPersonas = Arrays.asList(new Persona("Juan", 25), new Persona("María", 30), new Persona("Pedro", 20));
        Persona youngest = listaPersonas.stream().min((a,b) -> {return Integer.compare(a.getEdad(), b.getEdad());}).get();
        System.out.println("La persona más joven es: " + youngest.getNombre());

        // 2.6. Ordenar la lista de objetos de tipo Persona por edad, de menor a mayor
        List<Persona> listaPersonas2 = Arrays.asList(new Persona("Juan", 25), new Persona("María", 30), new Persona("Pedro", 20));
        listaPersonas2.sort((a,b) -> {return Integer.compare(a.getEdad(), b.getEdad());});
        listaPersonas2.forEach(p -> {System.out.println(p.getNombre() + " tiene " + p.getEdad() + " años.");});

        // 2.7. Filtrar las personas que tienen una edad mayor a 30 en una lista de objetos de tipo Persona
        List<Persona> listaPersonas3 = Arrays.asList(new Persona("Juan", 25), new Persona("María", 30), new Persona("Pedro", 20));
        List<Persona> mayoresDe30 = listaPersonas.stream().filter(p -> {return p.getEdad() > 30;}).collect(Collectors.toList());
        mayoresDe30.forEach(p -> {System.out.println(p.getNombre() + " tiene más de 30 años.");});

        //2.8. Para calcular el precio total de una lista de objetos de tipo Producto:
        List<Producto> listaProductos = Arrays.asList(new Producto("Lápiz", 2.50), new Producto("Borrador", 1.20), new Producto("Cuaderno", 4.50));
        double total = listaProductos.stream().mapToDouble(p -> p.getPrecio()).sum();
        System.out.println("El precio total de la lista es: " + total);

        //2.9. Para ordenar una lista de objetos de tipo Producto por precio, de mayor a menor:

        List<Producto> listaProductos2 = Arrays.asList(new Producto("Lápiz", 2.50), new Producto("Borrador", 1.20), new Producto("Cuaderno", 4.50));
        listaProductos2.sort((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()));
        listaProductos2.forEach(p -> System.out.println(p.getNombre() + " cuesta " + p.getPrecio()));

        //2.10. Para filtrar los productos que tienen un precio menor a 10 en una lista de objetos de tipo Producto:
        List<Producto> listaProductos3 = Arrays.asList(new Producto("Lápiz", 2.50), new Producto("Borrador", 1.20), new Producto("Cuaderno", 4.50));
        List<Producto> baratos = listaProductos3.stream().filter(p -> p.getPrecio() < 10).collect(Collectors.toList());
        baratos.forEach(p -> System.out.println(p.getNombre() + " cuesta menos de 10"));

    }
}

