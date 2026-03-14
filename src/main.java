import modelos.Libro;
import servicios.LibroService;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LibroService libroService = new LibroService();

        int opcion;

        do {

            System.out.println(" SISTEMA BIBLIOTECA ");
            System.out.println("1. Registrar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro por ISBN");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Año: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    Libro libro = new Libro(isbn, titulo, autor, anio);

                    libroService.registrarLibro(libro);

                    break;

                case 2:

                    libroService.listarLibros();

                    break;

                case 3:

                    System.out.print("Ingrese ISBN a buscar: ");
                    String buscarIsbn = scanner.nextLine();

                    Libro encontrado = libroService.buscarLibroPorIsbn(buscarIsbn);

                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }

                    break;

                case 4:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opción inválida.");

            }

        } while (opcion != 4);

        scanner.close();

    }

}