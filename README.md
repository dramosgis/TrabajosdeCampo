Ejercicio 1: Sistema de Registro de Usuarios y Estadísticas

Objetivo
Implementar una aplicación que permita:
•	Registrar múltiples usuarios con datos personales.
•	Calcular y mostrar estadísticas como el promedio de edad, nombre más largo y selección aleatoria de un usuario destacado.
Estructura de la solución
•	Clase Usuario: Contiene atributos privados nombre, edad y ciudad, con sus respectivos getters y setters. Esto garantiza encapsulamiento y acceso controlado a los datos.
•	Clase ControladorUsuarios: Incluye métodos estáticos para calcular el promedio de edad, buscar usuarios por nombre o ciudad (sobrecarga de métodos) y una clase anidada estática Decorador para imprimir mensajes decorativos.
•	Clase RegistroUsuariosApp (main): Gestiona la entrada del usuario mediante Scanner, registra usuarios en un ArrayList, y al finalizar, muestra las estadísticas solicitadas.



Ejercicio 2: Calculadora de Figuras Geométricas

Objetivo
Desarrollar un sistema que:
•	Permita al usuario calcular el área de distintas figuras (círculo, rectángulo, triángulo).
•	Mantenga un historial de cálculos realizados.
•	Presente estadísticas al finalizar (promedio de áreas, total de figuras).

Estructura de la solución
•	Clase abstracta Figura: Define el método abstracto calcularArea(), que es implementado por las subclases.
•	Subclases Circulo, Rectangulo, Triangulo: Cada clase hereda de Figura y calcula su área específica usando Math.
•	Clase Decorador: Clase anidada con métodos para imprimir cabeceras y líneas decorativas.
•	Clase CalculadoraFigurasApp (main): Controla el flujo del programa, entrada del usuario y visualización del historial y estadísticas.
