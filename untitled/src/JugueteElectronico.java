public class JugueteElectronico extends Juguete{
    private double recargo;

    public JugueteElectronico(String nombre, int numeroJugadores, int edadMinima, double precioBase, double recargo) throws EinvalidPrpertyException {
        super(nombre, numeroJugadores, edadMinima, precioBase);
        this.recargo = recargo;
        if (recargo < 0 ) throw new EinvalidPrpertyException("El recargo tiene que ser mayor o igual a 0");
        if (recargo > precioBase) throw new EinvalidPrpertyException("El recargo debe ser menor que el precio base");

    }

    public JugueteElectronico(String nombre, int edadMinima, double precioBase, double recargo) throws EinvalidPrpertyException {
        super(nombre, edadMinima, precioBase);
        this.recargo = recargo;
        if (recargo < 0 ) throw new EinvalidPrpertyException("El recargo tiene que ser mayor o igual a 0");
        if (recargo > precioBase) throw new EinvalidPrpertyException("El recargo debe ser menor que el precio base");

    }

    public double getRecargo() {
        return recargo;
    }


    public double getPrecio() {
        return (getPrecioBase() + getRecargo());
    }
}

