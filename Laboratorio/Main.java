public class Main {
    public static void main(String[] args) {
        RadioGrupoA radio = new RadioGrupoA();

        // Ejemplo de uso en el main
        radio.encender();
        radio.cambiarModo("Productividad");
        radio.planificarViaje("Ciudad A", "Ciudad B");

        // Mostrar detalles del viaje desde el main
        System.out.println(radio.obtenerDetallesViaje());

        // Otros métodos se pueden invocar de forma similar
    }
}
