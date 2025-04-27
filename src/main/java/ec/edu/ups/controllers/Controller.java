package ec.edu.ups.controllers;

import ec.edu.ups.models.Producto;
import ec.edu.ups.views.ShowConsole;

public class Controller {
    private ShowConsole showConsole;
    private ListsController listsController;

    public Controller(ListsController listsController) {
        this.showConsole = new ShowConsole();
        this.listsController = listsController;
    }

    public void start() {
        int opcion = 0;
        do{
            opcion=showConsole.showMenu();
            switch (opcion) {
                case 1:
                    op1RegistrarProveedor();
                    break;
                case 2:
                    op2RegistrarProducto();
                    break;
                case 3:
                    showConsole.showMessage("\n---- Ha seleccionado la opcion 3. \n\t-------------- Resgistrar Solicitud de Compra");
                    break;
                case 4:
                    op4ListarProveedores();
                    break;
                case 5:
                    op5ListarProductos();
                    break;
                case 6:
                    showConsole.showMessage("\n---- Ha seleccionado la opcion 6. \n\t-------------- Listar Solicitud de compra");
                    break;
                case 7:
                    showConsole.showMessage("\n---- Ha seleccionado la opcion 7. \n\t-------------- Buscar Proveedor por ID ");
                    break;
                case 8:
                    showConsole.showMessage("\n---- Ha seleccionado la opcion 8. \n\t-------------- Buscar Producto por nombre");
                    break;
                case 9:
                    showConsole.showMessage("\n---- Ha seleccionado la opcion 9. \n\t-------------- Buscar Solicitud por numero");
                    break;
                case 10:
                    showConsole.showMessage("\n---- Ha seleccionado la opcion 10. \n\t-------------- Aprobar / Rechazar Solicitud de compra");
                    break;
                case 11:
                    showConsole.showMessage("\n---- Ha seleccionado la opcion 11. \n\t-------------- Salir del programa");
                    break;
            }
        }while(opcion!=11);
    }

    public void op1RegistrarProveedor() {
        showConsole.showMessage("\n---- Ha seleccionado la opción 1. \n\tRegistrar Proveedor:");
    }

    public void op2RegistrarProducto() {
        showConsole.showMessage("\n---- Ha seleccionado la opción 2. \n\tRegistrar Producto:");
        listsController.agregarProducto(new Producto(
                showConsole.ingresoId(),
                showConsole.ingresoNombre(),
                showConsole.ingresoPrecio(),
                showConsole.ingresoIVA()
        ));
    }
    public void op4ListarProveedores() {
        showConsole.showMessage("\n---- Ha seleccionado la opcion 4. \n\tListar Proveedores");
        showConsole.listarProveedores(listsController.getProveedores());
    }

    public void op5ListarProductos() {
        showConsole.showMessage("\n---- Ha seleccionado la opción 5. \n\tListar Productos");
        showConsole.listarProductos(listsController.getProductos());
    }
}