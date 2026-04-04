package servicios;

import modelos.Libro;
import java.util.ArrayList;

public class LibroService {

    private ArrayList<Libro> listaLibros = new ArrayList<>();

    
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

    
    public void listarLibros() {

    if (listaLibros.isEmpty()) {
        System.out.println("No hay libros registrados.");
        return;
    }

    System.out.println("\n LISTA DE LIBROS \n");

    for (Libro libro : listaLibros) {

        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año: " + libro.getAnio());
        System.out.println("Estado: " + (libro.isDisponible() ? "Disponible" : "Prestado"));
        System.out.println("----------------------------");
    }
}

    
    public Libro buscarLibroPorIsbn(String isbn) {

        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }

        return null;
    }
}