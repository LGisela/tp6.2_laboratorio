
package productos;

import java.util.TreeSet;
import java.util.Iterator;

public class GestorDeProductos {
    private TreeSet<Producto> productos;

    
    public GestorDeProductos() {
        productos = new TreeSet<>();
    }

    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    
    public void eliminarProducto(int codigo) {
        productos.removeIf(producto -> producto.getCodigo() == codigo);
    }

     public Producto buscarProducto(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }
    
    
    
    
    
    public void modificarProducto(int codigo, String descripcion, double precio, int stock, String rubro) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            producto.setDescripcion(descripcion);
            producto.setPrecio(precio);
            producto.setStock(stock);
            producto.setRubro(rubro);
        }
    }

    
   

    
    public void consultarPorRubro(String rubro) {
        for (Producto producto : productos) {
            if (producto.getRubro().equalsIgnoreCase(rubro)) {
                System.out.println(producto);
            }
        }
    }

    
    public void consultarPorNombre(String descripcion) {
        for (Producto producto : productos) {
            if (producto.getDescripcion().equalsIgnoreCase(descripcion)) {
                System.out.println(producto);
            }
        }
    }

    
    public void consultarPorPrecio(double precio) {
        for (Producto producto : productos) {
            if (producto.getPrecio() == precio) {
                System.out.println(producto);
            }
        }
    }
}

