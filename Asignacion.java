import java.util.Objects;

public class Asignacion {

    private Empleado empleado;
    private Proyecto proyecto;
    private String rol; // Rol del empleado en el proyecto, por ejemplo

    public Asignacion(Empleado empleado, Proyecto proyecto, String rol) {
        this.empleado = empleado;
        this.proyecto = proyecto;
        this.rol = rol;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Asignacion that = (Asignacion) o;

        if (!Objects.equals(empleado, that.empleado)) return false;
        return Objects.equals(proyecto, that.proyecto);
    }

    @Override
    public int hashCode() {
        int result = empleado != null ? empleado.hashCode() : 0;
        result = 31 * result + (proyecto != null ? proyecto.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Asignacion{" +
                "empleado=" + empleado.getNombre() +
                ", proyecto=" + proyecto.getNombre() +
                ", rol='" + rol + '\'' +
                '}';
    }
}
