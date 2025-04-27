package ec.edu.ups.controllers;

import ec.edu.ups.models.*;
import java.util.List;

public class Default {
    private ListsController listsController;
    private Gerente gerente;

    public Default() {
        this.listsController = new ListsController();
        this.gerente = new Gerente();
    }

    public ListsController getListsController() {
        return listsController;
    }

    public void productosEjemplo() {
        listsController.agregarProducto(new Producto("pb-251", "Papel bond", 3.5, true));
        listsController.agregarProducto(new Producto("T554", "Tinta impresora L3250", 12.45, true));
        listsController.agregarProducto(new Producto("sku:172", "Curitas 100u", 2.25, false));
        listsController.agregarProducto(new Producto("sku:WE0001", "Alcohol", 2.75, false));
        listsController.agregarProducto(new Producto("sku:18U9277", "Gasa 7.5cm x 7.5cm", 3.49, false));
        listsController.agregarProducto(new Producto("IDC:006008", "Teclado Sc744 Negro", 4.42, true));
    }

    public void proveedoresEjemplo() {
        listsController.agregarProveedor(new Proveedor("0302174263001", "Viviana", "Zambrano", "Papelería",
                new Direccion("Hurtado de Mensoza", "Reventador", "10-26", "Cuenca", "Azuay", "Ecuador"), "0987654321"));
        listsController.getProveedores().get(0).addProductoProveedor(listsController.getProductos().get(0));
        listsController.getProveedores().get(0).addProductoProveedor(listsController.getProductos().get(1));
        listsController.agregarProveedor(new Proveedor("0102366119", "Rodrigo", "Perez", "Farmacia",
                new Direccion("Av.Mexico", "Guatemala", "S/N", "Cuenca", "Azuay", "Ecuador"), "0912345678"));
        listsController.getProveedores().get(1).addProductoProveedor(listsController.getProductos().get(2));
        listsController.getProveedores().get(1).addProductoProveedor(listsController.getProductos().get(3));
        listsController.getProveedores().get(1).addProductoProveedor(listsController.getProductos().get(4));
        listsController.agregarProveedor(new Proveedor("0302174271", "Luis", "Zambrano", "Tecnología",
                new Direccion("La Castellana", "Cartagena", "20-3", "Cuenca", "Azuay", "Ecuador"), "0987654321"));
        listsController.getProveedores().get(2).addProductoProveedor(listsController.getProductos().get(5));
    }

    public void empleadoEjemplo() {
        listsController.getEmpleados().add(new Empleado("0107233710", "Brandon", "Rivera", Departamento.RECURSOS_HUMANOS));
        listsController.getEmpleados().add(new Empleado("0101010101", "Erick", "Yunga", Departamento.FINANCIERO));
        listsController.getEmpleados().add(new Empleado("0202020202", "Pedro", "Pesantez", Departamento.MARKETING));
    }

    public void gerenteEjemplo() {
        gerente = new Gerente("0103176194", "Cecilia", "Zambrano", Departamento.DIRECTOR_GENERAL, "123@");
    }
}