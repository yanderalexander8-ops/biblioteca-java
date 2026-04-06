import modelos.Libro;
import servicios.LibroService;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LibroService libroService = new LibroService();

        int opcion = 0;

        do {

            System.out.println("\n=== SISTEMA BIBLIOTECA ===");
            System.out.println("1. Registrar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro por ISBN");
            System.out.println("4. Eliminar libro por ISBN");
            System.out.println("5. Actualizar información de un libro");
            System.out.println("6. Salir");

            // Validación de opción del menú
            while (true) {
                try {
                    System.out.print("Seleccione una opción: ");
                    opcion = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Debe ingresar un número válido.");
                }
            }

            switch (opcion) {

                case 1:
                    System.out.println("\n--- REGISTRAR LIBRO ---");

                    // Validar ISBN vacío
                    String isbn;
                    do {
                        System.out.print("ISBN: ");
                        isbn = scanner.nextLine().trim();
                        if (isbn.isEmpty()) {
                            System.out.println("El ISBN no puede estar vacío.");
                        }
                    } while (isbn.isEmpty());

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    // Validar año
                    int anio;
                    while (true) {
                        try {
                            System.out.print("Año: ");
                            anio = Integer.parseInt(scanner.nextLine());

                            if (anio > 0) break;
                            else System.out.println("El año debe ser mayor a 0.");

                        } catch (NumberFormatException e) {
                            System.out.println("Debe ingresar un número válido.");
                        }
                    }

                    Libro libro = new Libro(isbn, titulo, autor, anio);
                    libroService.registrarLibro(libro);

                    break;

                case 2:
                    System.out.println("\n--- LISTAR LIBROS ---");
                    libroService.listarLibros();
                    break;

                case 3:
                    System.out.println("\n--- BUSCAR LIBRO ---");
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
                    System.out.println("\n--- ELIMINAR LIBRO ---");
                    System.out.print("Ingrese ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();

                    boolean eliminado = libroService.eliminarLibro(isbnEliminar);

                    if (eliminado) {
                        System.out.println("Libro eliminado correctamente.");
                    } else {
                        System.out.println("No existe un libro con ese ISBN.");
                    }

                    break;

                case 5:
                    System.out.println("\n--- ACTUALIZAR LIBRO ---");
                    System.out.print("Ingrese ISBN del libro a actualizar: ");
                    String isbnActualizar = scanner.nextLine();

                    Libro libroActualizar = libroService.buscarLibroPorIsbn(isbnActualizar);

                    if (libroActualizar != null) {

                        System.out.print("Nuevo título: ");
                        String nuevoTitulo = scanner.nextLine();

                        System.out.print("Nuevo autor: ");
                        String nuevoAutor = scanner.nextLine();

                        int nuevoAnio;
                        while (true) {
                            try {
                                System.out.print("Nuevo año: ");
                                nuevoAnio = Integer.parseInt(scanner.nextLine());

                                if (nuevoAnio > 0) break;
                                else System.out.println("El año debe ser mayor a 0.");

                            } catch (NumberFormatException e) {
                                System.out.println("Debe ingresar un número válido.");
                            }
                        }

                        libroService.actualizarLibro(libroActualizar, nuevoTitulo, nuevoAutor, nuevoAnio);

                    } else {
                        System.out.println("No existe un libro con ese ISBN.");
                    }

                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}