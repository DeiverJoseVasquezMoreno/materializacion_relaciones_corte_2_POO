import java.util.ArrayList;
import java.util.List;

public class Aula {

    private String nombreAula;
    private String profesor;
    private List<Estudiante> estudiantes;

    public Aula(String nombreAula, String profesor) {
        this.nombreAula = nombreAula;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println(estudiante.getNombre() + " ha sido agregado al aula " + nombreAula + ".");
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        if (estudiantes.remove(estudiante)) {
            System.out.println(estudiante.getNombre() + " ha sido eliminado del aula " + nombreAula + ".");
        } else {
            System.out.println(estudiante.getNombre() + " no se encuentra en el aula " + nombreAula + ".");
        }
    }

    public void listarEstudiantes() {
        System.out.println("Aula: " + nombreAula + ", Profesor: " + profesor);
        System.out.println("Lista de Estudiantes:");
        for (Estudiante est : estudiantes) {
            est.mostrarInfo();
            System.out.println("----------------------");
        }
    }

    public String getNombreAula() {
        return nombreAula;
    }

    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
