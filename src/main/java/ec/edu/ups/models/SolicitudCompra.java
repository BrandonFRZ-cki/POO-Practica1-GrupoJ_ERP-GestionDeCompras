package ec.edu.ups.models;

import ec.edu.ups.controllers.ListsController;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

public class SolicitudCompra implements Calculable {
    private int idSolicitud;
    private Empleado solicitante;
    private EstadoSolicitud estado;
    private String motivo;
    private GregorianCalendar fechaCreacion;
    private String detalleMaterialesSolcitados;
    private String observaciones;
    private List<DetalleCompra> detalle;
    private Calculable total;

    public SolicitudCompra(){

    }

    public SolicitudCompra(int idSolicitud, Empleado solicitante, EstadoSolicitud estado, String motivo, GregorianCalendar fechaCreacion, String detalleMaterialesSolcitados, String observaciones, List<DetalleCompra> detalle, Calculable total) {
        this.idSolicitud = idSolicitud;
        this.solicitante = solicitante;
        this.estado = estado;
        this.motivo = motivo;
        this.fechaCreacion = fechaCreacion;
        this.detalleMaterialesSolcitados = detalleMaterialesSolcitados;
        this.observaciones = observaciones;
        this.detalle = detalle;
        this.total = total;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Empleado getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Empleado solicitante) {
        this.solicitante = solicitante;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public GregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(GregorianCalendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDetalleMaterialesSolcitados() {
        return detalleMaterialesSolcitados;
    }

    public void setDetalleMaterialesSolcitados(String detalleMaterialesSolcitados) {
        this.detalleMaterialesSolcitados = detalleMaterialesSolcitados;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<DetalleCompra> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleCompra> detalle) {
        this.detalle = detalle;
    }

    public Calculable getTotal() {
        return total;
    }

    public void setTotal(Calculable total) {
        this.total = total;
    }


    public void cambiarEstado(EstadoSolicitud nuevoEstado, Gerente gerente){

    }

    @Override
    public double calcularCostoTotal(){
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SolicitudCompra that = (SolicitudCompra) o;
        return idSolicitud == that.idSolicitud && Objects.equals(solicitante, that.solicitante) && estado == that.estado && Objects.equals(motivo, that.motivo) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(detalleMaterialesSolcitados, that.detalleMaterialesSolcitados) && Objects.equals(observaciones, that.observaciones) && Objects.equals(detalle, that.detalle) && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSolicitud, solicitante, estado, motivo, fechaCreacion, detalleMaterialesSolcitados, observaciones, detalle, total);
    }

    @Override
    public String toString() {
        return "SolicitudCompra{" +
                "idSolicitud=" + idSolicitud +
                ", solicitante=" + solicitante +
                ", estado=" + estado +
                ", motivo='" + motivo + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", detalleMaterialesSolcitados='" + detalleMaterialesSolcitados + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", detalle=" + detalle +
                ", total=" + total +
                '}';
    }
}
