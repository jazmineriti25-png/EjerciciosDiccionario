import java.util.HashMap;
import java.util.Scanner;

public class EjerciciosDiccionarios {

    static Scanner sc = new Scanner(System.in);

    // Diccionarios
    static HashMap<Integer, String> estudiantes = new HashMap<>();
    static HashMap<String, String> productos = new HashMap<>();
    static HashMap<String, String> diccionario = new HashMap<>();
    static HashMap<String, String> contactos = new HashMap<>();
    static HashMap<String, Double> calificaciones = new HashMap<>();
    static HashMap<String, Integer> inventario = new HashMap<>();
    static HashMap<String, Double> precios = new HashMap<>();
    static HashMap<String, Integer> frecuencia = new HashMap<>();
    static HashMap<Integer, String> alumnos = new HashMap<>();

    public static void main(String[] args) {

        // Datos iniciales
        estudiantes.put(101, "Ana");
        estudiantes.put(102, "Carlos");
        estudiantes.put(103, "Maria");

        productos.put("P01", "Teclado");
        productos.put("P02", "Mouse");
        productos.put("P03", "Monitor");

        diccionario.put("computadora", "Dispositivo electronico");
        diccionario.put("programacion", "Creacion de programas");
        diccionario.put("algoritmo", "Pasos para resolver un problema");

        contactos.put("Ana", "4411234567");
        contactos.put("Carlos", "4412345678");
        contactos.put("Maria", "4413456789");

        calificaciones.put("Ana", 9.5);
        calificaciones.put("Carlos", 8.0);
        calificaciones.put("Maria", 10.0);

        inventario.put("A01", 15);
        inventario.put("A02", 8);
        inventario.put("A03", 20);

        precios.put("P01", 150.0);
        precios.put("P02", 250.0);
        precios.put("P03", 500.0);

        alumnos.put(1001, "Ana Lopez");
        alumnos.put(1002, "Carlos Perez");
        alumnos.put(1003, "Maria Garcia");

        int opcion;

        do {
            System.out.println("\n===== MENU DE EJERCICIOS =====");
            System.out.println("1. Buscar estudiante por matricula");
            System.out.println("2. Buscar producto por codigo");
            System.out.println("3. Buscar palabra y significado");
            System.out.println("4. Buscar telefono por nombre");
            System.out.println("5. Consultar calificacion");
            System.out.println("6. Consultar existencias");
            System.out.println("7. Actualizar precio");
            System.out.println("8. Eliminar contacto");
            System.out.println("9. Contar frecuencia de palabras");
            System.out.println("10. Sistema de alumnos");
            System.out.println("0. Salir");
            System.out.print("Selecciona un ejercicio: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    ejercicio1();
                    break;

                case 2:
                    ejercicio2();
                    break;

                case 3:
                    ejercicio3();
                    break;

                case 4:
                    ejercicio4();
                    break;

                case 5:
                    ejercicio5();
                    break;

                case 6:
                    ejercicio6();
                    break;

                case 7:
                    ejercicio7();
                    break;

                case 8:
                    ejercicio8();
                    break;

                case 9:
                    ejercicio9();
                    break;

                case 10:
                    ejercicio10();
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 0);
    }

    // EJERCICIO 1: Buscar estudiante por matricula
    public static void ejercicio1() {

        System.out.print("Ingresa la matricula: ");
        int matricula = sc.nextInt();

        if (estudiantes.containsKey(matricula)) {
            System.out.println("Estudiante: " + estudiantes.get(matricula));
        } else {
            System.out.println("Matricula no encontrada.");
        }
    }

    // EJERCICIO 2: Buscar producto por codigo
    public static void ejercicio2() {

        System.out.print("Ingresa el codigo del producto: ");
        String codigo = sc.nextLine();

        if (productos.containsKey(codigo)) {
            System.out.println("Producto: " + productos.get(codigo));
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // EJERCICIO 3: Diccionario de palabras
    public static void ejercicio3() {

        System.out.print("Escribe una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        if (diccionario.containsKey(palabra)) {
            System.out.println("Significado: " + diccionario.get(palabra));
        } else {
            System.out.println("Palabra no encontrada.");
        }
    }

    // EJERCICIO 4: Buscar telefono
    public static void ejercicio4() {

        System.out.print("Ingresa el nombre del contacto: ");
        String nombre = sc.nextLine();

        if (contactos.containsKey(nombre)) {
            System.out.println("Telefono: " + contactos.get(nombre));
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    // EJERCICIO 5: Consultar calificacion
    public static void ejercicio5() {

        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = sc.nextLine();

        if (calificaciones.containsKey(nombre)) {
            System.out.println("Calificacion: " + calificaciones.get(nombre));
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // EJERCICIO 6: Consultar inventario
    public static void ejercicio6() {

        System.out.print("Ingresa el codigo del producto: ");
        String codigo = sc.nextLine();

        if (inventario.containsKey(codigo)) {
            System.out.println("Existencias: " + inventario.get(codigo));
        } else {
            System.out.println("Producto inexistente.");
        }
    }

    // EJERCICIO 7: Actualizar precio
    public static void ejercicio7() {

        System.out.print("Codigo del producto: ");
        String codigo = sc.nextLine();

        if (precios.containsKey(codigo)) {

            System.out.println("Precio anterior: " + precios.get(codigo));

            System.out.print("Ingresa el nuevo precio: ");
            double nuevoPrecio = sc.nextDouble();
            sc.nextLine();

            precios.put(codigo, nuevoPrecio);

            System.out.println("Precio actualizado: " + precios.get(codigo));

        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // EJERCICIO 8: Eliminar contacto
    public static void ejercicio8() {

        System.out.print("Nombre del contacto a eliminar: ");
        String nombre = sc.nextLine();

        if (contactos.containsKey(nombre)) {

            contactos.remove(nombre);

            System.out.println("Contacto eliminado correctamente.");

        } else {
            System.out.println("Contacto no encontrado.");
        }

        System.out.println("Contactos actuales: " + contactos);
    }

    // EJERCICIO 9: Contar frecuencia de palabras
    public static void ejercicio9() {

        frecuencia.clear();

        System.out.print("Escribe una oracion: ");
        String oracion = sc.nextLine().toLowerCase();

        String[] palabras = oracion.split("\\s+");

        for (String palabra : palabras) {

            if (frecuencia.containsKey(palabra)) {

                frecuencia.put(palabra, frecuencia.get(palabra) + 1);

            } else {

                frecuencia.put(palabra, 1);
            }
        }

        System.out.println("\nFrecuencia de palabras:");

        for (String palabra : frecuencia.keySet()) {

            System.out.println(palabra + ": " + frecuencia.get(palabra));
        }
    }

    // EJERCICIO 10: Sistema de alumnos
    public static void ejercicio10() {

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE ALUMNOS ---");
            System.out.println("1. Buscar alumno");
            System.out.println("2. Agregar alumno");
            System.out.println("3. Mostrar alumnos");
            System.out.println("4. Regresar al menu principal");
            System.out.print("Selecciona una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Matricula: ");
                    int matricula = sc.nextInt();

                    if (alumnos.containsKey(matricula)) {
                        System.out.println("Nombre: " + alumnos.get(matricula));
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }

                    break;

                case 2:

                    System.out.print("Nueva matricula: ");
                    int nuevaMatricula = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre del alumno: ");
                    String nombre = sc.nextLine();

                    alumnos.put(nuevaMatricula, nombre);

                    System.out.println("Alumno agregado correctamente.");

                    break;

                case 3:

                    System.out.println("\nLista de alumnos:");

                    for (Integer clave : alumnos.keySet()) {
                        System.out.println(clave + " - " + alumnos.get(clave));
                    }

                    break;

                case 4:

                    System.out.println("Regresando al menu principal.");

                    break;

                default:

                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 4);
    }
}