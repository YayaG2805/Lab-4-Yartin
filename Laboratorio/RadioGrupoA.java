class RadioGrupoA implements RadioInterface {
    private boolean estado;
    private int volumen;
    private String modoActual;
    private String frecuencia;
    private List<Double> emisorasGuardadas = new ArrayList<>();
    private double emisoraActual;
    private List<String> listaReproduccion = new ArrayList<>();
    private String cancionActual;
    private boolean telefonoConectado;
    private List<String> contactos = new ArrayList<>();
    private String destinoInicial;
    private String destinoFinal;

    // Métodos Generales
    @Override
    public void encender() {
        estado = true;
    }

    @Override
    public void apagar() {
        estado = false;
    }

    @Override
    public void cambiarVolumen(int valor) {
        if (estado) volumen += valor;
    }

    @Override
    public void cambiarModo(String modo) {
        if (estado) modoActual = modo;
    }

    // Métodos de Modo Radio
    @Override
    public void cambiarFrecuencia() {
        if (estado && "Radio".equals(modoActual)) {
            frecuencia = "FM".equals(frecuencia) ? "AM" : "FM";
        }
    }

    @Override
    public void cambiarEmisora(double cambio) {
        if (estado && "Radio".equals(modoActual)) {
            emisoraActual += cambio;
        }
    }

    @Override
    public void guardarEmisora() {
        if (estado && "Radio".equals(modoActual) && emisorasGuardadas.size() < 50) {
            emisorasGuardadas.add(emisoraActual);
        }
    }

    @Override
    public void cargarEmisora(int posicion) {
        if (estado && "Radio".equals(modoActual) && posicion < emisorasGuardadas.size()) {
            emisoraActual = emisorasGuardadas.get(posicion);
        }
    }

    // Métodos de Modo Reproducción
    @Override
    public void seleccionarLista(String lista) {
        if (estado && "Reproducción".equals(modoActual)) {
            listaReproduccion.add(lista);
        }
    }

    @Override
    public void cambiarCancion(int direccion) {
        if (estado && "Reproducción".equals(modoActual) && !listaReproduccion.isEmpty()) {
            // Cambia la canción en la lista
        }
    }

    @Override
    public void escucharCancion() {
        if (estado && "Reproducción".equals(modoActual)) {
            // Mostrar información de la canción actual
        }
    }

    // Métodos de Modo Teléfono
    @Override
    public void conectarTelefono() {
        if (estado && "Teléfono".equals(modoActual)) {
            telefonoConectado = true;
        }
    }

    @Override
    public void desconectarTelefono() {
        if (estado && "Teléfono".equals(modoActual)) {
            telefonoConectado = false;
        }
    }

    @Override
    public void mostrarContactos() {
        if (estado && "Teléfono".equals(modoActual)) {
            // Mostrar lista de contactos
        }
    }

    @Override
    public void llamarContacto(String nombre) {
        if (estado && "Teléfono".equals(modoActual)) {
            // Realizar llamada al contacto
        }
    }

    @Override
    public void cambiarASpeaker() {
        if (estado && "Teléfono".equals(modoActual)) {
            // Cambiar entre speaker y auriculares
        }
    }

    // Métodos de Modo Productividad
    @Override
    public void planificarViaje(String destinoInicial, String destinoFinal) {
        if (estado && "Productividad".equals(modoActual)) {
            this.destinoInicial = destinoInicial;
            this.destinoFinal = destinoFinal;
        }
    }

    @Override
    public String obtenerDetallesViaje() {
        if (estado && "Productividad".equals(modoActual)) {
            return "Viaje desde " + destinoInicial + " hasta " + destinoFinal;
        }
        return "";
    }
}
