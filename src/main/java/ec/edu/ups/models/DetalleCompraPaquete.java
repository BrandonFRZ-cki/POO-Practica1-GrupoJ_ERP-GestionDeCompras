package ec.edu.ups.models;

import java.util.ArrayList;
import java.util.List;


public class DetalleCompraPaquete extends DetalleCompra implements Calculable{
    private List<Producto> productos;
    private double descuento;

    public DetalleCompraPaquete() {
        this.productos = new ArrayList<>();
    }

    public DetalleCompraPaquete(int id, int cantidad, double descuento) {
        super(id, cantidad);
        this.descuento = descuento;

        this.productos = new ArrayList<>();
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


    public double generarModificacionDeCosto() {
        return 0;
    }

    @Override
    public double calcularCostoTotal(){
        return 0;
    }
    @Override
    public double generarModificadorDeCosto(){
        return 5;
    };



    @Override
    public String toString() {
        return "DetalleCompraPaquete{" +
                "descuento=" + descuento +
                ", productos=" + productos +
                '}';
    }
}
