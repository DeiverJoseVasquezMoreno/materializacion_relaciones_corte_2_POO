public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;

    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("---------------------------");
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Año de Publicación=" + anioPublicacion +
                '}';
    }
}
