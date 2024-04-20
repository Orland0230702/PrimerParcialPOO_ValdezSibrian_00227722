import java.util.ArrayList;
public class GestorInventario {
    private ArrayList<Articulo> inventario;

    public GestorInventario() {
        inventario = new ArrayList<>();
    }

    public void agregarArticulo(Articulo articulo) {
        inventario.add(articulo);
    }

    public void modificarArticulo(int indice, Articulo nuevoArticulo) {
        inventario.set(indice, nuevoArticulo);
    }

    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("\t Bienvenido a ElectroMart");
            for (int i = 0; i < inventario.size(); i++) {
                Articulo articulo = inventario.get(i);
                System.out.println((i + 1) + ". " + articulo.obtenerDescripcion() + " - Precio: $" + articulo.obtenerPrecio());
            }
        }
    }

    public int obtenerTamanoInventario() {
        return inventario.size();
    }

    public Articulo obtenerArticulo(int indice) {
        if (indice >= 0 && indice < inventario.size()) {
            return inventario.get(indice);
        } else {
            return null;
        }
    }
}
