package Problema1.pkg1;

import java.util.ArrayList;

public class ControladorUsuarios {

    // Método que recibe una lista de usuarios y devuelve el promedio de edad
    public static double calcularPromedioEdad(ArrayList<Usuario> usuarios) {
        if (usuarios.isEmpty()) return 0;  // Evita división entre cero
        int suma = 0;
        for (Usuario u : usuarios) {
            suma += u.getEdad();
        }
        return (double) suma / usuarios.size();
    }

    // Método sobrecargado para buscar un usuario por nombre
    public static Usuario buscarUsuario(ArrayList<Usuario> usuarios, String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
                return u;  // Devuelve el usuario si encuentra coincidencia
            }
        }
        return null; // Si no se encuentra, devuelve null
    }

    // Método sobrecargado para buscar usuarios por ciudad (puede haber varios)
    public static ArrayList<Usuario> buscarUsuarioPorCiudad(ArrayList<Usuario> usuarios, String ciudad) {
        ArrayList<Usuario> encontrados = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u.getCiudad().equalsIgnoreCase(ciudad)) {
                encontrados.add(u);
            }
        }
        return encontrados;
    }

    // Clase anidada estática para mostrar mensajes con formato decorado
    public static class MensajeDecorado {
        public static void mostrar(String mensaje) {
            System.out.println("========== " + mensaje + " ==========");
        }
    }
}
