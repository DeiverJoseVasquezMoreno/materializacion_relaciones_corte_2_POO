import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private String nombre;
    private String descripcion;
    private List<Asignacion> asignaciones; // Lista de asignaciones de empleados

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.asignaciones = new ArrayList<>();
    }

    public void agregarAsignacion(Asignacion asignacion) {
        if (!asignaciones.contains(asignacion)) {
            asignaciones.add(asignacion);
        }
    }

    public void removerAsignacion(Asignacion asignacion) {
        asignaciones.remove(asignacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void mostrarInfo() {
        System.out.println("Información del Proyecto:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        if (asignaciones.isEmpty()) {
            System.out.println("Asignaciones: Ninguna");
        } else {
            System.out.println("Asignaciones:");
            for (Asignacion asignacion : asignaciones) {
                System.out.println("- Empleado: " + asignacion.getEmpleado().getNombre() + ", Rol: " + asignacion.getRol());
            }
        }
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
