public class JugueteEducativo extends Juguete {
    private int edadMaxima;
    private double bonificacion;

    public JugueteEducativo(String nombre, int numeroJugadores, int edadMinima, double precioBase, int edadMaxima, double bonificacion) throws EinvalidPrpertyException {
        super(nombre, numeroJugadores, edadMinima, precioBase);
        this.edadMaxima = edadMaxima;
        this.bonificacion = bonificacion;
        validateEducativo(edadMinima, precioBase, edadMaxima, bonificacion);
    }

    public JugueteEducativo(String nombre, int edadMinima, double precioBase, int edadMaxima, double bonificacion) throws EinvalidPrpertyException {
        super(nombre, edadMinima, precioBase);
        this.edadMaxima = edadMaxima;
        this.bonificacion = bonificacion;
        validateEducativo(edadMinima, precioBase, edadMaxima, bonificacion);
    }

    private static void validateEducativo(int edadMinima, double precioBase, int edadMaxima, double bonificacion) throws EinvalidPrpertyException {
        if (edadMaxima <= edadMinima) throw new EinvalidPrpertyException("La edad máxima debe ser superior o igual a la edad minima");
        if (bonificacion < 0) throw new EinvalidPrpertyException("La bonificacion debe ser mayor o igual a 0");
        if (bonificacion > precioBase) throw new EinvalidPrpertyException("La bonificacion debe ser menor que el precio base");
    }

    public double getBonificacion() {
        return bonificacion;
    }

    @Override
    public double getPrecio() {
        return (getPrecioBase() - getBonificacion());
    }
}