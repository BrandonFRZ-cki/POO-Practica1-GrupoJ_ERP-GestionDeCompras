package ec.edu.ups;

import java.util.Objects;

public abstract class Producto {
    private String idProducto;
    private String nombre;
    private double precioUnitario;
    private boolean aplicaIVA;


    public Producto(){

    }

    public Producto(String idProducto, String nombre, double precioUnitario, boolean aplicaIVA) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.aplicaIVA = aplicaIVA;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public boolean isAplicaIVA() {
        return aplicaIVA;
    }

    public void setAplicaIVA(boolean aplicaIVA) {
        this.aplicaIVA = aplicaIVA;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(idProducto, producto.idProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idProducto);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto='" + idProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", aplicaIVA=" + aplicaIVA +
                '}';
    }
}
