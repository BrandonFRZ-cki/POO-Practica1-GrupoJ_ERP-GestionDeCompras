package ec.edu.ups;

import java.util.List;
import java.util.Objects;

public class Paquete {
    private int codigo;
    private double precio;
    private List<Producto> productos;

    public Paquete(){

    }

    public Paquete(int codigo, double precio, List<Producto> productos) {
        this.codigo = codigo;
        this.precio = precio;
        this.productos = productos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paquete paquete = (Paquete) o;
        return codigo == paquete.codigo && Double.compare(precio, paquete.precio) == 0 && Objects.equals(productos, paquete.productos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, precio, productos);
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "codigo=" + codigo +
                ", precio=" + precio +
                ", productos=" + productos +
                '}';
    }
}
