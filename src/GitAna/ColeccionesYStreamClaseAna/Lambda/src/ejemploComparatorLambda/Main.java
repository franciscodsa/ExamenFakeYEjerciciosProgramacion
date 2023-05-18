//package ejemploComparatorLambda;
//
//
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        Socio socio1 = new Socio(3, "Valentin", LocalDate.of(2001, 2, 8));
//        Socio socio2 = new Socio(2, "Claudia", LocalDate.of(2002, 10, 16));
//        Socio socio3 = new Socio(1, "Javier", LocalDate.of(1996, 10, 14));
//        Socio socio4 = new Socio(4, "Victor", LocalDate.of(1991, 5, 10));
//
//        ArrayList<Socio> socios = new ArrayList<>();
//        socios.add(socio1);
//        socios.add(socio2);
//        socios.add(socio3);
//        socios.add(socio4);
//
//        System.out.println("Según entran en el arraylist:");
//        imprimirSocios(socios);
//        System.out.println();
//        // instanciamos Comparator
////        Comparator comparatorFNac = (o1, o2) -> {
////            Socio s1 = (Socio) o1;
////            Socio s2 = (Socio) o2;
////            if (s1.fNacimiento.isBefore(s2.fNacimiento)) {
////                return -1;
////            } else if (socio1.fNacimiento.isAfter(socio2.fNacimiento)) {
////                return 1;
////            } else {
////                return 0;
////            }
////        };
//        // podemos saltarnos un paso, metiendo directamente la expresión lambda como argumento del método sort
//        socios.sort((s1, s2) -> {
//            if (s1.fNacimiento.isBefore(s2.fNacimiento)) {
//                return -1;
//            } else if (socio1.fNacimiento.isAfter(socio2.fNacimiento)) {
//                return 1;
//            } else {
//                return 0;
//            }
//        });
//        imprimirSocios(socios);
//
//        System.out.println("\nOrdenamos por idSocio");
//        socios.sort((s1, s2) -> s1.idSocio - s2.idSocio);
//        imprimirSocios(socios);
//        // ¡¡ATENCIÓN!! --> PARA ORDENAR AL REVÉS HACEMOS LO MISMO PERO INVIRTIENDO EL ORDEN DE LOS SOCIOS EN LA RESTA
//        System.out.println("\nOrdenamos por idSocio al revés");
//        socios.sort((s1, s2) -> s2.idSocio - s1.idSocio);
//        imprimirSocios(socios);
//
//        System.out.println("\nOrdenamos por nombre");
//        socios.sort((s1, s2) -> s1.nombre.compareToIgnoreCase(s2.nombre));
//        imprimirSocios(socios);
//        // ¡¡ATENCIÓN!! --> PARA ORDENAR AL REVÉS HACEMOS LO MISMO PERO INVIRTIENDO EL ORDEN DE LOS SOCIOS EN LA RESTA
//        System.out.println("\nOrdenamos por idSocio al revés");
//        socios.sort((s1, s2) -> s2.nombre.compareToIgnoreCase(s1.nombre));
//        imprimirSocios(socios);
//
//
//
//
//    }
//
//    static void imprimirSocios(ArrayList<Socio> socios) {
//        /*for (Socio elemento: socios) {
//            System.out.println(elemento);
//        }*/
//        socios.forEach(socio -> System.out.println(socio));
//    }
//
//    private static int compare(Socio s1, Socio s2) {
//        return s2.idSocio - s1.idSocio;
//    }
//
//    private static int compare2(Socio s1, Socio s2) {
//        return s1.idSocio - s2.idSocio;
//    }
//}
