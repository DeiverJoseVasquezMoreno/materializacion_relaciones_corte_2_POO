public class Estudiante {

    private String nombre;
    private int edad;
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void asistirClase() {
        System.out.println(nombre + " está asistiendo a la clase.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void mostrarInfo() {
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Matrícula: " + matricula);
    }
}
