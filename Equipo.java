import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String entrenador;
    private List<Jugador> jugadores; // Lista de Jugadores (Asociación Bidireccional)

    public Equipo(String nombre, String entrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        if (jugadores.contains(jugador)) {
            System.out.println(jugador.getNombre() + " ya está en el equipo " + this.nombre + ".");
            return;
        }
        jugadores.add(jugador);
        if (jugador.getEquipo() != this) {
            jugador.unirseEquipo(this); // Asegura la asociación bidireccional
        }
        System.out.println(jugador.getNombre() + " ha sido agregado al equipo " + this.nombre + ".");
    }

    public void eliminarJugador(Jugador jugador) {
        if (!jugadores.contains(jugador)) {
            System.out.println(jugador.getNombre() + " no pertenece al equipo " + this.nombre + ".");
            return;
        }
        jugadores.remove(jugador);
        if (jugador.getEquipo() == this) {
            jugador.salirEquipo(); // Asegura la asociación bidireccional
        }
        System.out.println(jugador.getNombre() + " ha sido eliminado del equipo " + this.nombre + ".");
    }

    public void listarJugadores() {
        System.out.println("Equipo: " + nombre + ", Entrenador: " + entrenador);
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores en el equipo.");
            return;
        }
        System.out.println("Lista de Jugadores:");
        for (Jugador jugador : jugadores) {
            System.out.println("- " + jugador.getNombre() + " (" + jugador.getPosicion() + ")");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void mostrarInfo() {
        System.out.println("Información del Equipo:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Entrenador: " + entrenador);
        listarJugadores();
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", entrenador='" + entrenador + '\'' +
                ", jugadores=" + jugadores.size() +
                '}';
    }
}
