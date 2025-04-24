package ec.edu.ups;

import java.util.Objects;

public abstract class DetalleCompra {
    private int id;
    private int cantidad;
    private String descripcion;
    private Calculable precioCompre;

    public DetalleCompra(){

    }

    public DetalleCompra(int id, int cantidad, String descripcion, Calculable precioCompre) {
        this.id = id;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioCompre = precioCompre;
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

    public String getDescricion() {
        return descripcion;
    }

    public void setDescricion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Calculable getPrecioCompre() {
        return precioCompre;
    }

    public void setPrecioCompre(Calculable precioCompre) {
        this.precioCompre = precioCompre;
    }

    public abstract double generarModificadorDeCosto();


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DetalleCompra that = (DetalleCompra) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DetalleCompra{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", descripcion='" + descripcion + '\'' +
                ", precioCompre=" + precioCompre +
                '}';
    }
}
