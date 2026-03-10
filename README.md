## Día 1 - Configuración del proyecto

Se realizó la configuración inicial del sistema de biblioteca.

Actividades realizadas:

- Creación del proyecto en Visual Studio Code
- Creación de la estructura de carpetas (modelos, servicios, util)
- Creación del archivo main.java
- Creación del archivo config.properties
- Creación del archivo README.md
- Inicialización del repositorio con Git
- Primer commit del proyecto en GitHub

## Día 2 - Creación del modelo Libro

Se creó la clase Libro dentro del paquete modelos.

La clase incluye:

- Atributos del libro (ISBN, título, autor, año, disponibilidad)
- Constructor
- Métodos getters
- Método para cambiar disponibilidad
- Método toString para mostrar la información del libro

## Día 3 - Gestión de libros

Se creó la clase LibroService dentro del paquete servicios.

Funciones implementadas:

- Registrar libros
- Listar libros registrados
- Buscar libro por ISBN

Se utilizó ArrayList para almacenar los libros en memoria.