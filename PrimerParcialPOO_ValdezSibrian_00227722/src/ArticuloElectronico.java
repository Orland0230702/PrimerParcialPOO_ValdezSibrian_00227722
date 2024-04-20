public abstract class ArticuloElectronico implements Articulo {
    protected String nombre;
    protected String modelo;

    public ArticuloElectronico(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    @Override
    public abstract double obtenerPrecio();

    @Override
    public abstract String obtenerDescripcion();
}
