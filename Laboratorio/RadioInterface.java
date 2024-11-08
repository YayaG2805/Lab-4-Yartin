interface RadioInterface {
    // Métodos generales
    void encender();
    void apagar();
    void cambiarVolumen(int valor);
    void cambiarModo(String modo);

    // Métodos de Modo Radio
    void cambiarFrecuencia();
    void cambiarEmisora(double cambio);
    void guardarEmisora();
    void cargarEmisora(int posicion);

    // Métodos de Modo Reproducción
    void seleccionarLista(String lista);
    void cambiarCancion(int direccion);
    void escucharCancion();

    // Métodos de Modo Teléfono
    void conectarTelefono();
    void desconectarTelefono();
    void mostrarContactos();
    void llamarContacto(String nombre);
    void cambiarASpeaker();

    // Métodos de Modo Productividad
    void planificarViaje(String destinoInicial, String destinoFinal);
    String obtenerDetallesViaje();
}
