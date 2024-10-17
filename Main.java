public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
        Animal animal = new Animal("Generic Animal", 5, "Gris");
        animal.comer();
        animal.dormir();
        animal.hacerSonido();

        System.out.println();

        Perro perro = new Perro("Rex", 3, "Marrón", "Labrador");
        perro.mostrarInfo();
        perro.comer();
        perro.dormir();
        perro.ladrar();
        perro.hacerSonido();

        System.out.println();
        System.out.println();

        // Ejercicio 2
        Delfin delfin = new Delfin();
        delfin.nadar();

        System.out.println();
        System.out.println();

        // Ejercicio 3
        Documento doc = new Documento("Este es el contenido del documento.");
        Impresora impresora = new Impresora();
        impresora.imprimir(doc);

        System.out.println();
        System.out.println();

        // Ejercicio 4
        Estudiante est1 = new Estudiante("Ana", 20, "A001");
        Estudiante est2 = new Estudiante("Luis", 22, "A002");
        Estudiante est3 = new Estudiante("María", 19, "A003");

        Aula aula = new Aula("Matemáticas", "Profesor García");

        aula.agregarEstudiante(est1);
        aula.agregarEstudiante(est2);
        aula.agregarEstudiante(est3);

        System.out.println();

        aula.listarEstudiantes();

        System.out.println();

        aula.eliminarEstudiante(est2);

        System.out.println();

        aula.listarEstudiantes();

        System.out.println();

        est2.estudiar();

        System.out.println();
        System.out.println();

        // Ejercicio 5
        Computadora miComputadora = new Computadora("Dell", "XPS 15");

        System.out.println();

        miComputadora.mostrarInfo();

        System.out.println();

        miComputadora.utilizarProcesador();

        System.out.println();

        miComputadora.instalarProcesador("Intel", "i7-10750H", 2.6);

        System.out.println();

        miComputadora.mostrarInfo();

        System.out.println();

        miComputadora.utilizarProcesador();

        System.out.println();

        miComputadora.instalarProcesador("AMD", "Ryzen 7 4800H", 2.9);

        System.out.println();

        miComputadora.retirarProcesador();

        System.out.println();

        miComputadora.mostrarInfo();

        System.out.println();

        miComputadora.utilizarProcesador();

        System.out.println();
        System.out.println();

        // Ejercicio 6
        Equipo equipoA = new Equipo("Equipo A", "Entrenador López");
        Equipo equipoB = new Equipo("Equipo B", "Entrenador Martínez");

        Jugador jugador1 = new Jugador("Carlos", "Delantero");
        Jugador jugador2 = new Jugador("Lucía", "Defensora");
        Jugador jugador3 = new Jugador("Miguel", "Mediocampista");
        Jugador jugador4 = new Jugador("Sofía", "Portera");

        System.out.println("\n--- Información Inicial ---");
        equipoA.mostrarInfo();
        equipoB.mostrarInfo();
        jugador1.mostrarInfo();
        jugador2.mostrarInfo();
        jugador3.mostrarInfo();
        jugador4.mostrarInfo();

        System.out.println("\n--- Agregar Jugadores al Equipo A ---");
        equipoA.agregarJugador(jugador1);
        equipoA.agregarJugador(jugador2);
        equipoA.agregarJugador(jugador3);

        System.out.println("\n--- Información Después de Agregar Jugadores al Equipo A ---");
        equipoA.mostrarInfo();
        equipoB.mostrarInfo();
        jugador1.mostrarInfo();
        jugador2.mostrarInfo();
        jugador3.mostrarInfo();

        System.out.println("\n--- Jugador4 se une al Equipo B ---");
        jugador4.unirseEquipo(equipoB);

        System.out.println("\n--- Información Después de Agregar Jugador4 al Equipo B ---");
        equipoA.mostrarInfo();
        equipoB.mostrarInfo();
        jugador4.mostrarInfo();

        System.out.println("\n--- Intentar Agregar Jugador1 al Equipo B (Ya está en Equipo A) ---");
        equipoB.agregarJugador(jugador1);

        System.out.println("\n--- Retirar Jugador2 del Equipo A ---");
        equipoA.eliminarJugador(jugador2);

        System.out.println("\n--- Información Final ---");
        equipoA.mostrarInfo();
        equipoB.mostrarInfo();
        jugador2.mostrarInfo();

        System.out.println();
        System.out.println();

        // Ejercicio 7
        Empleado emp1 = new Empleado("Ana Pérez", "Desarrolladora");
        Empleado emp2 = new Empleado("Luis Gómez", "Diseñador");
        Empleado emp3 = new Empleado("María López", "Gestora de Proyectos");

        Proyecto proy1 = new Proyecto("Desarrollo de Sitio Web", "Crear un sitio web corporativo.");
        Proyecto proy2 = new Proyecto("Aplicación Móvil", "Desarrollar una aplicación para dispositivos móviles.");
        Proyecto proy3 = new Proyecto("Rediseño de Marca", "Actualizar la identidad visual de la empresa.");

        System.out.println("\n--- Información Inicial ---");
        emp1.mostrarInfo();
        emp2.mostrarInfo();
        emp3.mostrarInfo();
        proy1.mostrarInfo();
        proy2.mostrarInfo();
        proy3.mostrarInfo();

        System.out.println("\n--- Asignaciones ---");
        emp1.asignarProyecto(proy1, "Frontend Developer");
        emp1.asignarProyecto(proy2, "Backend Developer");
        emp2.asignarProyecto(proy1, "UI/UX Designer");
        emp2.asignarProyecto(proy3, "Brand Designer");
        emp3.asignarProyecto(proy1, "Project Manager");
        emp3.asignarProyecto(proy2, "Project Manager");

        System.out.println("\n--- Información Después de Asignaciones ---");
        emp1.mostrarInfo();
        emp2.mostrarInfo();
        emp3.mostrarInfo();
        proy1.mostrarInfo();
        proy2.mostrarInfo();
        proy3.mostrarInfo();

        System.out.println("\n--- Remover Asignación ---");
        emp1.removerProyecto(proy2); // Ana ya no trabaja en "Aplicación Móvil"

        System.out.println("\n--- Información Después de Remover Asignación ---");
        emp1.mostrarInfo();
        proy2.mostrarInfo();

        System.out.println("\n--- Intentar Asignar Proyecto Ya Asignado ---");
        emp2.asignarProyecto(proy1, "UI/UX Designer"); // Luis ya está asignado al proyecto 1

        System.out.println("\n--- Información Final ---");
        emp1.mostrarInfo();
        emp2.mostrarInfo();
        emp3.mostrarInfo();
        proy1.mostrarInfo();
        proy2.mostrarInfo();
        proy3.mostrarInfo();

        System.out.println();
        System.out.println();

        // Ejercicio 8
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central", "Av. Principal 123");

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-3-16-148410-0", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", "978-0-452-28423-4", 1949);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-0-06-112008-4", 1943);
        Libro libro4 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", "978-84-08-04735-3", 2001);

        miBiblioteca.añadirLibro(libro1);
        miBiblioteca.añadirLibro(libro2);
        miBiblioteca.añadirLibro(libro3);
        miBiblioteca.añadirLibro(libro4);

        miBiblioteca.añadirLibro(libro2);

        System.out.println();

        miBiblioteca.mostrarLibros();

    }
}
