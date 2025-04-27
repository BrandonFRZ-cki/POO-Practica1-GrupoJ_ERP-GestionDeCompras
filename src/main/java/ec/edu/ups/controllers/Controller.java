package ec.edu.ups.controllers;

import ec.edu.ups.models.Producto;
import ec.edu.ups.views.ShowConsole;

public class Controller {
    private ShowConsole showConsole;
    private ListsController listsController;
    public Controller() {
        showConsole = new ShowConsole();
        listsController = new ListsController();
    }


    public void start() {
        int opcion=0;
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
                    showConsole.showMessage("\n---- Ha seleccionado la opcion 4. \n\t-------------- Listar Proveedores");
                    break;
                case 5:
                    showConsole.showMessage("\n---- Ha seleccionado la opcion 5. \n\t-------------- Listar Productos");
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
        showConsole.showMessage("\n---- Ha seleccionado la opcion 1. \n\tResgistrar Proveedor:");
    }
    public void op2RegistrarProducto() {
        showConsole.showMessage("\n---- Ha seleccionado la opcion 2. \n\tResgistrar Producto:");
        listsController.agregarProducto(new Producto(
                showConsole.ingresoId(),
                showConsole.ingresoNombre(),
                showConsole.ingresoPrecio(),
                showConsole.ingresoIVA()
        ));
    }

}
