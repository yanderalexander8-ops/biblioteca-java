package servicios;

import modelos.Libro;
import java.util.ArrayList;

public class LibroService {

    private ArrayList<Libro> listaLibros = new ArrayList<>();

    public void registrarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Libro registrado correctamente.");
    }

    public void listarLibros() {

        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        for (Libro libro : listaLibros) {
            System.out.println(libro);
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