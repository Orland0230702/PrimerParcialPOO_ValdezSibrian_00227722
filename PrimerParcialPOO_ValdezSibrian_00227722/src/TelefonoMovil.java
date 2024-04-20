public class TelefonoMovil extends ArticuloElectronico {
    private String marca;
    private String almacenamiento;
    private double precio;

    public TelefonoMovil(String nombre, String modelo, String marca, String almacenamiento, double precio) {
        super(nombre, modelo);
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String obtenerDescripcion() {
        return nombre + " " + modelo + " - " + marca + ", " + almacenamiento;
    }
}
