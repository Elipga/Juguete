public class Main {
    public static void main(String[] args) throws EinvalidPrpertyException {
        Juguete J = new Juguete("Barbie", 3, 4, 30);
        Juguete H = new JugueteEducativo("Puzzle", 2, 3, 30, 6, 2);
        Juguete K = new JugueteElectronico("cocheElectrico", 1, 5, 30,5);

        double precioJ = J.getPrecio();
        double precioH = H.getPrecio();
        double precioK = K.getPrecio();

        System.out.println("El precio de la Barbie es: " + precioJ);
        System.out.println("El precio del puzzle es: " + precioH);
        System.out.println("El precio del coche eléctrico es: " + precioK);
        }
    }
