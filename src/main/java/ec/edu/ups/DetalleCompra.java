package ec.edu.ups;

import java.util.Objects;

public class DetalleCompra {
    private int id;
    private int cantidad;

    public DetalleCompra(){

    }

    public DetalleCompra(int id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DetalleCompra that = (DetalleCompra) o;
        return id == that.id && cantidad == that.cantidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cantidad);
    }

    @Override
    public String toString() {
        return "DetalleCompra{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                '}';
    }
}
