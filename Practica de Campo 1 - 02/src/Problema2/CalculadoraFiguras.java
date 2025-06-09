package Problema2;

import java.util.ArrayList;
import java.util.Scanner;

// Clase principal que gestiona la calculadora de figuras
public class CalculadoraFiguras {

    // Lista donde se guardan todas las figuras creadas
    static ArrayList<Figura> historial = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            Decorador.linea();
            System.out.println("CALCULADORA DE FIGURAS GEOMETRICAS");
            Decorador.linea();
            System.out.println("1. Calcular area de Circulo");
            System.out.println("2. Calcular area de Rectangulo");
            System.out.println("3. Calcular area de Triangulo");
            System.out.println("4. Ver historial");
            System.out.println("5. Ver estadisticas");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1 -> calcularCirculo(scanner);
                    case 2 -> calcularRectangulo(scanner);
                    case 3 -> calcularTriangulo(scanner);
                    case 4 -> mostrarHistorial();
                    case 5 -> mostrarEstadisticas();
                    case 0 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion invalida. Intente otra vez.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Intente nuevamente.");
                opcion = -1;
            }

        } while (opcion != 0);
    }

    // Metodo para calcular el area de un circulo
    public static void calcularCirculo(Scanner sc) {
        try {
            System.out.print("Ingrese el radio del circulo: ");
            double radio = Double.parseDouble(sc.nextLine());

            if (radio < 0) throw new IllegalArgumentException("El radio no puede ser negativo");

            Figura f = new Circulo(radio);
            historial.add(f);
            System.out.println("Area calculada: " + f.calcularArea());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Metodo para calcular el area de un rectangulo
    public static void calcularRectangulo(Scanner sc) {
        try {
            System.out.print("Ingrese la base del rectangulo: ");
            double base = Double.parseDouble(sc.nextLine());
            System.out.print("Ingrese la altura del rectangulo: ");
            double altura = Double.parseDouble(sc.nextLine());

            if (base < 0 || altura < 0) throw new IllegalArgumentException("Los valores no pueden ser negativos");

            Figura f = new Rectangulo(base, altura);
            historial.add(f);
            System.out.println("Area calculada: " + f.calcularArea());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Metodo para calcular el area de un triangulo
    public static void calcularTriangulo(Scanner sc) {
        try {
            System.out.print("Ingrese la base del triangulo: ");
            double base = Double.parseDouble(sc.nextLine());
            System.out.print("Ingrese la altura del triangulo: ");
            double altura = Double.parseDouble(sc.nextLine());

            if (base < 0 || altura < 0) throw new IllegalArgumentException("Los valores no pueden ser negativos");

            Figura f = new Triangulo(base, altura);
            historial.add(f);
            System.out.println("Area calculada: " + f.calcularArea());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Muestra el historial de figuras creadas
    public static void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay figuras en el historial.");
        } else {
            Decorador.cabecera("HISTORIAL DE FIGURAS CALCULADAS");
            for (Figura f : historial) {
                System.out.println(f);
            }
        }
    }

    // Muestra estadisticas generales
    public static void mostrarEstadisticas() {
        if (historial.isEmpty()) {
            System.out.println("No hay datos para mostrar estadisticas.");
            return;
        }

        double sumaAreas = 0;
        for (Figura f : historial) {
            sumaAreas += f.calcularArea();
        }

        double promedio = sumaAreas / historial.size();

        Decorador.cabecera("ESTADISTICAS GENERALES");
        System.out.println("Total de figuras: " + historial.size());
        System.out.printf("Promedio de areas: %.2f\n", promedio);
    }

    // Clase anidada estatica para decorar la salida
    public static class Decorador {
        public static void linea() {
            System.out.println("======================================");
        }

        public static void cabecera(String titulo) {
            linea();
            System.out.println(titulo);
            linea();
        }
    }
}
