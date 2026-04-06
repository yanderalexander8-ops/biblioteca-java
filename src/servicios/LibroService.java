package servicios;

import modelos.Libro;
import java.util.ArrayList;

public class LibroService {

    private ArrayList<Libro> listaLibros = new ArrayList<>();

    // Registrar libro con validación ISBN duplicado
    public void registrarLibro(Libro libro) {

        for (Libro l : listaLibros) {
            if (l.getIsbn().equals(libro.getIsbn())) {
                System.out.println("Error: Ya existe un libro con ese ISBN.");
                return;
            }
        }

        listaLibros.add(libro);
        System.out.println("Libro registrado correctamente.");
    }

    // Listar libros
    public void listarLibros() {

        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        System.out.println("\n====== LISTA DE LIBROS ======\n");

        for (Libro libro : listaLibros) {

            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año: " + libro.getAnio());
            System.out.println("Estado: " + (libro.isDisponible() ? "Disponible" : "Prestado"));
            System.out.println("----------------------------");
        }
    }

    // Buscar por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {

        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }

        return null;
    }

    // Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {

        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                listaLibros.remove(libro);
                return true;
            }
        }

        return false;
    }

    // ACTUALIZAR LIBRO (LO QUE TE FALTABA)
    public void actualizarLibro(Libro libro, String nuevoTitulo, String nuevoAutor, int nuevoAnio) {

        libro.setTitulo(nuevoTitulo);
        libro.setAutor(nuevoAutor);
        libro.setAnio(nuevoAnio);

        System.out.println("Libro actualizado correctamente.");
    }
}