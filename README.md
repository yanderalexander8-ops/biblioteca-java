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

## Día 4 - Implementación del menú del sistema

Se implementó un menú interactivo en consola dentro del archivo main.java.

El sistema ahora permite al usuario interactuar con el programa mediante diferentes opciones.

Funciones agregadas:

- Registrar libro
- Listar libros
- Buscar libro por ISBN
- Salir del sistema

Para capturar los datos ingresados por el usuario se utilizó la clase Scanner.

## Día 5 - Validación de ISBN duplicado

Se implementó una validación en el sistema para evitar el registro de libros con ISBN repetidos.

Antes de registrar un libro, el sistema verifica si ya existe un libro con el mismo ISBN.

Si el ISBN ya existe, el sistema muestra un mensaje de error y no permite registrar el libro.

## Día 6 - Mejora en visualización de libros

Se mejoró la forma en la que se muestran los libros en consola.

Ahora el sistema presenta los libros con un formato más claro, organizado y fácil de leer, incluyendo:

- Título
- Autor
- Año
- Estado
- Separadores visuales