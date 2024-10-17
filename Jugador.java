public class Jugador {
    private String nombre;
    private String posicion;
    private Equipo equipo; // Referencia al Equipo (Asociación Bidireccional)

    public Jugador(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = null; // Inicialmente, el jugador no pertenece a ningún equipo
    }

    public void unirseEquipo(Equipo equipo) {
        if (this.equipo != null) {
            System.out.println(this.nombre + " ya pertenece al equipo " + this.equipo.getNombre() + ".");
            return;
        }
        this.equipo = equipo;
        equipo.agregarJugador(this); // Actualiza la referencia en Equipo
        System.out.println(this.nombre + " se ha unido al equipo " + equipo.getNombre() + ".");
    }

    public void salirEquipo() {
        if (this.equipo == null) {
            System.out.println(this.nombre + " no pertenece a ningún equipo.");
            return;
        }
        Equipo antiguoEquipo = this.equipo;
        this.equipo = null;
        antiguoEquipo.eliminarJugador(this); // Actualiza la referencia en Equipo
        System.out.println(this.nombre + " ha salido del equipo " + antiguoEquipo.getNombre() + ".");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void mostrarInfo() {
        System.out.println("Información del Jugador:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        if (equipo != null) {
            System.out.println("Equipo: " + equipo.getNombre());
        } else {
            System.out.println("Equipo: Sin equipo");
        }
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", equipo=" + (equipo != null ? equipo.getNombre() : "Sin equipo") +
                '}';
    }
}
