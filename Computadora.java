public class Computadora {

    private String marca;
    private String modelo;
    private Procesador procesador;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("Computadora " + marca + " " + modelo + " creada.");
    }

    public void instalarProcesador(String marcaProcesador, String modeloProcesador, double velocidad) {
        if (this.procesador == null) {
            this.procesador = new Procesador(marcaProcesador, modeloProcesador, velocidad);
            System.out.println("Procesador instalado en la computadora " + marca + " " + modelo + ".");
        } else {
            System.out.println("La computadora ya tiene un procesador instalado.");
        }
    }

    public void retirarProcesador() {
        if (this.procesador != null) {
            this.procesador.apagar();
            System.out.println("Procesador " + procesador.getMarca() + " " + procesador.getModelo() + " retirado de la computadora " + marca + " " + modelo + ".");
            this.procesador = null;
        } else {
            System.out.println("No hay ningún procesador instalado para retirar.");
        }
    }

    public void utilizarProcesador() {
        if (this.procesador != null) {
            procesador.procesar();
        } else {
            System.out.println("No hay ningún procesador instalado para utilizar.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Información de la Computadora:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        if (procesador != null) {
            System.out.println("Procesador: " + procesador.getMarca() + " " + procesador.getModelo() + " a " + procesador.getVelocidad() + " GHz");
        } else {
            System.out.println("Procesador: No instalado");
        }
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

    public Procesador getProcesador() {
        return procesador;
    }
}
