package ec.edu.ups;

import java.util.Objects;

public class DetalleCompraPaquete extends DetalleCompra{
    private double precioPack;
    private Paquete paquete;
    private double descuento;

    public DetalleCompraPaquete() {

    }

    public DetalleCompraPaquete(int id, int cantidad, double precioPack, Paquete paquete, double descuento) {
        super(id, cantidad);
        this.precioPack = precioPack;
        this.paquete = paquete;
        this.descuento = descuento;
    }

    public double getPrecioPack() {
        return precioPack;
    }

    public void setPrecioPack(double precioPack) {
        this.precioPack = precioPack;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double calcularCostoTotal(){
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DetalleCompraPaquete that = (DetalleCompraPaquete) o;
        return Double.compare(precioPack, that.precioPack) == 0 && Double.compare(descuento, that.descuento) == 0 && Objects.equals(paquete, that.paquete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), precioPack, paquete, descuento);
    }

    @Override
    public String toString() {
        return "DetalleCompraPaquete{" +
                "precioPack=" + precioPack +
                ", paquete=" + paquete +
                ", descuento=" + descuento +
                '}';
    }
}
