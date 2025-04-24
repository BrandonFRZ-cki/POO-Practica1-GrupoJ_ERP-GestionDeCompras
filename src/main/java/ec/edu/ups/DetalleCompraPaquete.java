package ec.edu.ups;

import java.util.List;


public abstract class DetalleCompraPaquete extends DetalleCompra implements Calculable{
    private List<Producto> productos;
    private double descuento;

    public DetalleCompraPaquete() {

    }

    public DetalleCompraPaquete(int id, int cantidad, String descricion, Calculable precioCompre, double descuento, List<Producto> productos) {
        super(id, cantidad, descricion, precioCompre);
        this.descuento = descuento;
        this.productos = productos;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }


    public void addProducto(Producto producto){
        productos.add(producto);
    }


    public abstract double generarModificacionDeCosto();

    @Override
    public double calcularCostoTotal(){
        return 0;
    }



    @Override
    public String toString() {
        return "DetalleCompraPaquete{" +
                "descuento=" + descuento +
                ", productos=" + productos +
                '}';
    }
}
