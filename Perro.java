public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String color, String raza) {
        super(nombre, edad, color);
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println(this.getNombre() + " está ladrando: ¡Guau guau!");
    }

    @Override
    public void hacerSonido() {
        ladrar();
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrarInfo() {
        System.out.println("Información del perro:");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad() + " años");
        System.out.println("Color: " + this.getColor());
        System.out.println("Raza: " + this.getRaza());
    }
}
