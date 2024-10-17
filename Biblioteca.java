import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private String direccion;
    private List<Libro> libros; // Lista de libros en la biblioteca

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
    }

    public void añadirLibro(Libro libro) {
        if (libros.contains(libro)) {
            System.out.println("El libro \"" + libro.getTitulo() + "\" ya existe en la biblioteca.");
        } else {
            libros.add(libro);
            System.out.println("Libro \"" + libro.getTitulo() + "\" añadido exitosamente a la biblioteca.");
        }
    }

    public void mostrarLibros() {
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Lista de Libros:");
        System.out.println("---------------------------");
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros registrados.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }

    public void eliminarLibroPorISBN(String isbn) {
        Libro libroAEliminar = null;
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libroAEliminar = libro;
                break;
            }
        }
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("Libro \"" + libroAEliminar.getTitulo() + "\" eliminado exitosamente de la biblioteca.");
        } else {
            System.out.println("No se encontró un libro con ISBN: " + isbn);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", libros=" + libros.size() +
                '}';
    }
}
