package ec.edu.ups;

import ec.edu.ups.Persona;
import ec.edu.ups.Producto;

import java.util.List;
import java.util.Objects;

public class Proveedor extends Persona {
    private String detalleProvedor;
    private List<Producto> productos;
    private String direccion;
    private String telefono;



    public Proveedor() {

    }

    public Proveedor(String detalleProvedor, List<Producto> productos, String direccion, String telefono) {
        this.detalleProvedor = detalleProvedor;
        this.productos = productos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Proveedor(String identificacion, String nombre, String apellido, String detalleProvedor, List<Producto> productos, String direccion, String telefono) {
        super(identificacion, nombre, apellido);
        this.detalleProvedor = detalleProvedor;
        this.productos = productos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDetalleProvedor() {
        return detalleProvedor;
    }

    public void setDetalleProvedor(String detalleProvedor) {
        this.detalleProvedor = detalleProvedor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "detalleProvedor='" + detalleProvedor + '\'' +
                ", productos=" + productos +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
