public class Laptop extends ArticuloElectronico {
    private String marca;
    private String procesador;
    private double precio;

    public Laptop(String nombre, String modelo, String marca, String procesador, double precio) {
        super(nombre, modelo);
        this.marca = marca;
        this.procesador = procesador;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        return nombre + " " + modelo + " - " + marca + ", " + procesador;
    }
}
