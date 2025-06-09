Ejercicio 1: Sistema de Registro de Usuarios y Estadísticas
Objetivo
Implementar una aplicación que permita:
•	Registrar múltiples usuarios con datos personales.
•	Calcular y mostrar estadísticas como el promedio de edad, nombre más largo y selección aleatoria de un usuario destacado.
Estructura de la solución
•	Clase Usuario: Contiene atributos privados nombre, edad y ciudad, con sus respectivos getters y setters. Esto garantiza encapsulamiento y acceso controlado a los datos.
•	Clase ControladorUsuarios: Incluye métodos estáticos para calcular el promedio de edad, buscar usuarios por nombre o ciudad (sobrecarga de métodos) y una clase anidada estática Decorador para imprimir mensajes decorativos.
•	Clase RegistroUsuariosApp (main): Gestiona la entrada del usuario mediante Scanner, registra usuarios en un ArrayList, y al finalizar, muestra las estadísticas solicitadas.
