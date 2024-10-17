import java.util.ArrayList;
import java.util.List;

public class Empleado {

    private String nombre;
    private String posicion;
    private List<Asignacion> asignaciones; // Lista de asignaciones a proyectos

    public Empleado(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.asignaciones = new ArrayList<>();
    }

    public void asignarProyecto(Proyecto proyecto, String rol) {
        Asignacion asignacion = new Asignacion(this, proyecto, rol);
        if (!asignaciones.contains(asignacion)) {
            asignaciones.add(asignacion);
            proyecto.agregarAsignacion(asignacion);
            System.out.println(
                    this.nombre + " ha sido asignado al proyecto " + proyecto.getNombre() + " como " + rol + ".");
        } else {
            System.out.println(this.nombre + " ya está asignado al proyecto " + proyecto.getNombre() + ".");
        }
    }

    public void removerProyecto(Proyecto proyecto) {
        Asignacion asignacionAEliminar = null;
        for (Asignacion asignacion : asignaciones) {
            if (asignacion.getProyecto().equals(proyecto)) {
                asignacionAEliminar = asignacion;
                break;
            }
        }
        if (asignacionAEliminar != null) {
            asignaciones.remove(asignacionAEliminar);
            proyecto.removerAsignacion(asignacionAEliminar);
            System.out.println(this.nombre + " ha sido removido del proyecto " + proyecto.getNombre() + ".");
        } else {
            System.out.println(this.nombre + " no está asignado al proyecto " + proyecto.getNombre() + ".");
        }
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

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void mostrarInfo() {
        System.out.println("Información del Empleado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        if (asignaciones.isEmpty()) {
            System.out.println("Asignaciones: Ninguna");
        } else {
            System.out.println("Asignaciones:");
            for (Asignacion asignacion : asignaciones) {
                System.out.println(
                        "- Proyecto: " + asignacion.getProyecto().getNombre() + ", Rol: " + asignacion.getRol());
            }
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
