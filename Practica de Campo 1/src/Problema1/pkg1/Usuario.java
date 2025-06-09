package Problema1.pkg1;

public class Usuario {
    // Atributos 
    private String nombre;
    private int edad;
    private String ciudad;

    // Constructor
    public Usuario(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // Métodos 
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

