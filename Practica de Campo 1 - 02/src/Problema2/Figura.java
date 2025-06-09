package Problema2;

public abstract class Figura {
    // Método abstracto que será implementado por cada figura
    public abstract double calcularArea();

    // Devuelve el nombre de la clase (tipo de figura)
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
}
