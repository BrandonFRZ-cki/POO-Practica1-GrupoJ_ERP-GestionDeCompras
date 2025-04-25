package ec.edu.ups;

import java.util.ArrayList;
import java.util.List;


public class Proveedor extends Persona {
    private String detalleProvedor;
    private List<Producto> productos;
    private String direccion;
    private String telefono;



    public Proveedor() {
        this.productos = new ArrayList<>();
    }
    public Proveedor(String identificacion, String nombre, String apellido, String detalleProvedor,  String direccion, String telefono) {
        super(identificacion, nombre, apellido);
        this.detalleProvedor = detalleProvedor;
        this.direccion = direccion;
        this.telefono = telefono;

        this.productos = new ArrayList<>();
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
