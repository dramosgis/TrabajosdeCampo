package Problema1.pkg1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class RegistroUsuarios {
    public static void main(String[] args) {
        // Creamos una lista para guardar los usuarios registrados
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        // Bucle para registrar varios usuarios hasta que el usuario escriba "n"
        do {
            try {
                // Pedimos al usuario que ingrese los datos
                System.out.print("Ingrese nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese edad: ");
                int edad = Integer.parseInt(scanner.nextLine()); // Convertimos el texto a número
                if (edad <= 0) throw new NumberFormatException("Edad no válida");

                System.out.print("Ingrese ciudad: ");
                String ciudad = scanner.nextLine();

                // Creamos el objeto y lo agregamos a la lista
                usuarios.add(new Usuario(nombre, edad, ciudad));

            } catch (NumberFormatException e) {
                // Si la edad no es válida, mostramos un mensaje de error
                System.out.println("Edad no válida. Intente nuevamente.");
            }

            // Preguntamos si quiere seguir ingresando más usuarios
            System.out.print("¿Desea ingresar otro usuario? (s/n): ");
            opcion = scanner.nextLine();

        } while (opcion.equalsIgnoreCase("s"));

        // Mostramos un título decorado usando la clase anidada
        ControladorUsuarios.MensajeDecorado.mostrar("Resumen de Usuarios");

        // Mostramos el total de usuarios
        System.out.println("Total de usuarios: " + usuarios.size());

        // Calculamos y mostramos el promedio de edad
        System.out.printf("Promedio de edad: %.2f\n", ControladorUsuarios.calcularPromedioEdad(usuarios));

        // Encontramos el nombre más largo
        String nombreMasLargo = "";
        for (Usuario u : usuarios) {
            if (u.getNombre().length() > nombreMasLargo.length()) {
                nombreMasLargo = u.getNombre();
            }
        }
        System.out.println("Nombre más largo: " + nombreMasLargo);

        // Elegimos un usuario destacado de manera aleatoria
        if (!usuarios.isEmpty()) {
            Random rand = new Random();
            Usuario destacado = usuarios.get(rand.nextInt(usuarios.size()));
            System.out.println("Usuario destacado: " + destacado.getNombre() + " de " + destacado.getCiudad());
        }
    }
}
