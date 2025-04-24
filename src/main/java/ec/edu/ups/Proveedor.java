package ec.edu.ups.proveedor;

import ec.edu.ups.Paquete;
import ec.edu.ups.Persona;
import ec.edu.ups.Producto;

import java.util.List;
import java.util.Objects;

public class Proveedor extends Persona {
    private String detalleProvedor;
    private List<Producto> productos;
    private String direccion;
    private String telefono;
    private List<Paquete> paquete;


    public Proveedor() {

    }

    public Proveedor(String identificacion, String nombre, String apellido, String detalleProvedor, List<Producto> productos, String direccion, String telefono, List<Paquete> paquete) {
        super(identificacion, nombre, apellido);
        this.detalleProvedor = detalleProvedor;
        this.productos = productos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paquete = paquete;
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

    public List<Paquete> getPaquete() {
        return paquete;
    }

    public void setPaquete(List<Paquete> paquete) {
        this.paquete = paquete;
    }

    public void addProducto (Producto producto){
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Proveedor proveedor = (Proveedor) o;
        return Objects.equals(detalleProvedor, proveedor.detalleProvedor) && Objects.equals(productos, proveedor.productos) && Objects.equals(direccion, proveedor.direccion) && Objects.equals(telefono, proveedor.telefono) && Objects.equals(paquete, proveedor.paquete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), detalleProvedor, productos, direccion, telefono, paquete);
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "detalleProvedor='" + detalleProvedor + '\'' +
                ", productos=" + productos +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", paquete=" + paquete +
                '}';
    }
}
