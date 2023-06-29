public class Juguete {
    private String nombre;
    private int numeroJugadores;
    private int edadMinima;
    protected double precioBase;

    public Juguete(String nombre, int numeroJugadores, int edadMinima, double precioBase) throws EinvalidPrpertyException {
        this.nombre = nombre;
        validateName(nombre);
        this.numeroJugadores = numeroJugadores;
        if(numeroJugadores <= 0) throw new EinvalidPrpertyException("El numero de jugadores debe ser al menos 1");
        this.edadMinima = edadMinima;
        if(edadMinima < 0) throw new EinvalidPrpertyException("La edad debe ser mayor que 0");
        this.precioBase = precioBase;
        if(precioBase < 0) throw new EinvalidPrpertyException("El precio base tiene que ser mayor que 0")
    }

    public Juguete(String nombre, int edadMinima, double precioBase) throws EinvalidPrpertyException {
        this.nombre = nombre;
        validateName(nombre);
        this.edadMinima = edadMinima;
        if(edadMinima < 0) throw new EinvalidPrpertyException("La edad debe ser mayor que 0");
        this.precioBase = precioBase;
        if(precioBase < 0) throw new EinvalidPrpertyException("El precio base tiene que ser mayor que 0")

    }

    private static void validateName(String nombre) throws EinvalidPrpertyException {
        if(nombre == null) throw new EinvalidPrpertyException("Debe introducir nombre");
        if(nombre.isEmpty()) throw new EinvalidPrpertyException("Debe introducir nombre");
    }

    public double getPrecioBase() {
        return precioBase;
    }

    double getPrecio() {
        return getPrecioBase();
    }
}

