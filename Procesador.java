public class Procesador {

    private String marca;
    private String modelo;
    private double velocidad; // en GHz

    public Procesador(String marca, String modelo, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        System.out.println("Procesador " + marca + " " + modelo + " creado.");
    }

    public void procesar() {
        System.out.println("El procesador " + marca + " " + modelo + " está procesando a " + velocidad + " GHz.");
    }

    public void apagar() {
        System.out.println("El procesador " + marca + " " + modelo + " se está apagando.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
