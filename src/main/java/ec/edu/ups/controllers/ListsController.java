package ec.edu.ups.controllers;

import ec.edu.ups.models.Empleado;
import ec.edu.ups.models.Producto;
import ec.edu.ups.models.Proveedor;
import ec.edu.ups.models.SolicitudCompra;

import java.util.ArrayList;
import java.util.List;

public class ListsController {
    private List<Producto> productos;
    private List<Proveedor> proveedores;
    private List<Empleado> empleados;
    private List<SolicitudCompra> solicitudes;


    public ListsController() {
        this.productos = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.solicitudes = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<SolicitudCompra> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<SolicitudCompra> solicitudes) {
        this.solicitudes = solicitudes;
    }
}
