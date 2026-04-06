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

## Día 6 - Mejora visual e implementación de eliminación de libros

En esta fase se realizaron mejoras importantes para optimizar la experiencia del usuario:

# Mejoras realizadas:
- Se reorganizó la visualización de los libros en consola con un formato más claro y legible.
- Se añadió la función de eliminar libros por ISBN.
- Se agregó al menú principal la nueva opción correspondiente.

## Día 7 - Actualización de información de libros

En este día se añadió la funcionalidad para actualizar los datos de un libro existente mediante su ISBN.

### Cambios realizados:
- Nueva opción en el menú para actualizar libros.
- Implementación del método actualizarLibro() en LibroService.
- Agregados setters en la clase Libro para permitir la modificación de atributos.
- Interacción completa con el usuario para modificar título, autor y año.

## 📅 Día 8 - Validaciones y mejoras del sistema
- Validación del año (no permite negativos ni letras).
- Validación del ISBN vacío.
- Validación de opciones del menú.
- Manejo de errores cuando el usuario ingresa datos inválidos.
- Sistema más estable y profesional.