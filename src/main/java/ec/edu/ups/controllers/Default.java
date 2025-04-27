package ec.edu.ups.controllers;

import ec.edu.ups.models.*;

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
        listsController.agregarProducto(new Producto("pb-251", "Papel bond", 3.5, true,
                new Proveedor("0302174263001", "Viviana", "Zambrano", "Papelería",
                        new Direccion("Hurtado de Mensoza", "Reventador", "10-26", "Cuenca", "Azuay", "Ecuador"), "0987654321")));
        listsController.agregarProducto(new Producto("T554", "Tinta impresora L3250", 12.45, true,
                new Proveedor("0302174263001", "Viviana", "Zambrano", "Papelería",
                        new Direccion("Hurtado de Mensoza", "Reventador", "10-26", "Cuenca", "Azuay", "Ecuador"), "0987654321")));
        listsController.agregarProducto(new Producto("sku:172", "Curitas 100u", 2.25, false,
                new Proveedor("0102366119", "Rodrigo", "Perez", "Farmacia",
                        new Direccion("Av.Mexico", "Guatemala", "S/N", "Cuenca", "Azuay", "Ecuador"), "0912345678")));
        listsController.agregarProducto(new Producto("sku:WE0001", "Alcohol", 2.75, false,
                new Proveedor("0102366119", "Rodrigo", "Perez", "Farmacia",
                        new Direccion("Av.Mexico", "Guatemala", "S/N", "Cuenca", "Azuay", "Ecuador"), "0912345678")));
        listsController.agregarProducto(new Producto("sku:18U9277", "Gasa 7.5cm x 7.5cm", 3.49, false,
                new Proveedor("0102366119", "Rodrigo", "Perez", "Farmacia",
                        new Direccion("Av.Mexico", "Guatemala", "S/N", "Cuenca", "Azuay", "Ecuador"), "0912345678")));
        listsController.agregarProducto(new Producto("IDC:006008", "Teclado Sc744 Negro", 4.42, true,
                new Proveedor("0302174271", "Luis", "Zambrano", "Tecnología",
                        new Direccion("La Castellana", "Cartagena", "20-3", "Cuenca", "Azuay", "Ecuador"), "0987654321")));
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