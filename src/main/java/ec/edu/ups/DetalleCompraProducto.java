package ec.edu.ups;

import java.util.Objects;

public class DetalleCompraProducto extends DetalleCompra {
    private UnidadMedida unidadMedida;
    private double precioUnitario;
    private Producto producto;

    public DetalleCompraProducto() {

    }

    public DetalleCompraProducto(int id, int cantidad, UnidadMedida unidadMedida, double precioUnitario, Producto producto) {
        super(id, cantidad);
        this.unidadMedida = unidadMedida;
        this.precioUnitario = precioUnitario;
        this.producto = producto;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double calcularCostoTotal(){
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DetalleCompraProducto that = (DetalleCompraProducto) o;
        return Double.compare(precioUnitario, that.precioUnitario) == 0 && unidadMedida == that.unidadMedida && Objects.equals(producto, that.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), unidadMedida, precioUnitario, producto);
    }

    @Override
    public String toString() {
        return "DetalleCompraProducto{" +
                "unidadMedida=" + unidadMedida +
                ", precioUnitario=" + precioUnitario +
                ", producto=" + producto +
                '}';
    }
}
