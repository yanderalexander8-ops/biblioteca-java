package modelos;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int anio;
    private boolean disponible = true;

    public Libro(String isbn, String titulo, String autor, int anio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    // GETTERS
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + isbn + '\'' +
                ", Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Año=" + anio +
                ", Estado=" + (disponible ? "Disponible" : "Prestado") +
                '}';
    }
}