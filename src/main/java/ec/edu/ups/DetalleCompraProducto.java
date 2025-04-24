package ec.edu.ups;

import java.util.Objects;

public abstract class DetalleCompraProducto extends DetalleCompra implements Calculable {
    private UnidadMedida unidadMedida;
    private Producto producto;

    public DetalleCompraProducto() {

    }

    public DetalleCompraProducto(int id, int cantidad, String descricion, Calculable precioCompre, UnidadMedida unidadMedida, Producto producto) {
        super(id, cantidad, descricion, precioCompre);
        this.unidadMedida = unidadMedida;
        this.producto = producto;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public abstract double generarModificacionDeCosto();

    @Override
    public double calcularCostoTotal(){
        return 0;
    }


    @Override
    public String toString() {
        return "DetalleCompraProducto{" +
                "unidadMedida=" + unidadMedida +
                ", producto=" + producto +
                '}';
    }
}
