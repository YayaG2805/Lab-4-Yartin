public class Main {
    public static void main(String[] args) {
        // Instancia de la radio del Grupo A
        RadioGrupoA radio = new RadioGrupoA();

        // Ejemplo de encender el radio
        radio.encender();

        // Configuración inicial del volumen
        radio.cambiarVolumen(5);

        // Cambio al modo radio y configuración de una emisora
        radio.cambiarModo("Radio");
        radio.cambiarFrecuencia(); // Cambia entre FM y AM
        radio.cambiarEmisora(0.5); // Ajusta frecuencia
        radio.guardarEmisora(); // Guarda la emisora actual

        // Cambio al modo reproducción
        radio.cambiarModo("Reproducción");
        radio.seleccionarLista("Pop Hits");
        radio.cambiarCancion(1); // Canción siguiente
        radio.escucharCancion(); // Muestra detalles de la canción

        // Cambio al modo teléfono
        radio.cambiarModo("Teléfono");
        radio.conectarTelefono();
        radio.mostrarContactos();
        radio.llamarContacto("Juan Pérez");

        // Cambio al modo productividad
        radio.cambiarModo("Productividad");
        radio.planificarViaje("Ciudad A", "Ciudad B");
        System.out.println(radio.obtenerDetallesViaje());

        // Ejemplo de apagado
        radio.apagar();
    }
}

