package ec.edu.ups.controllers;

import ec.edu.ups.models.*;
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
            opcion=showConsole.showMenuPrincipal();
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


    public  void op1RegistrarProveedor() {
        showConsole.showMessage("\n---- Ha seleccionado la opcion 1. \n\tRegistrar Proveedor para producto");
        showConsole.showMessage("Lista de productos sin proveedor");
        for (int i = 0; i < listsController.getProductos().size(); i++) {
            if (listsController.getProductos().get(i).getProveedor().getNombre()==null){
                System.out.println("id: ("+listsController.getProductos().get(i).getIdProducto()+"), Nombre: ("+listsController.getProductos().get(i).getNombre()+")");
            }
        }
        String productoElejido = showConsole.showIngreseProductoSinProveedor();
        for (int i = 0; i < listsController.getProductos().size(); i++) {
            if(productoElejido.equals(listsController.getProductos().get(i).getIdProducto())){
                listsController.getProductos().get(i).setProveedor(
                        new Proveedor(
                                showConsole.ingresoId("proveedor"),
                                showConsole.ingresoNombre("proveedor"),
                                showConsole.ingresoApellido("proveedor"),
                                showConsole.ingresoTexto("\t\tDetalle:"),
                                showConsole.ingresoDireccion(),
                                showConsole.ingresoTexto("\t\tTelefono: ")
                        )
                );
            }
        }


    }
    public void op2RegistrarProducto() {
        showConsole.showMessage("\n---- Ha seleccionado la opción 2. \n\tRegistrar Producto:");
        int opcionCreacionProducto =0;
        boolean menuCreacionProducto = true;
        do{
            opcionCreacionProducto = showConsole.showMenuIngresoProducto();
            switch (opcionCreacionProducto) {
                case 1:
                    listsController.agregarProducto(new Producto(
                            showConsole.ingresoId("producto"),
                            showConsole.ingresoNombre("producto"),
                            showConsole.ingresoPrecio("producto"),
                            showConsole.ingresoIVA("producto"),
                            new Proveedor()
                    ));
                    menuCreacionProducto = false;
                    break;
                case 2:
                    listsController.agregarProducto(new Producto(
                            showConsole.ingresoId("producto"),
                            showConsole.ingresoNombre("producto"),
                            showConsole.ingresoPrecio("producto"),
                            showConsole.ingresoIVA("producto"),
                            new Proveedor(
                                    showConsole.ingresoId("proveedor"),
                                    showConsole.ingresoNombre("proveedor"),
                                    showConsole.ingresoApellido("proveedor"),
                                    showConsole.ingresoTexto("\t\tDetalle:"),
                                    showConsole.ingresoDireccion(),
                                    showConsole.ingresoTexto("\t\tTelefono: ")
                            )
                    ));
                    menuCreacionProducto = false;
                    break;
                default:
                    showConsole.showError("Opcion no valida");
                    break;

            }
        }while(menuCreacionProducto);
    }

    public void op4ListarProveedores() {
        showConsole.showMessage("\n---- Ha seleccionado la opcion 4. \n\tListar Proveedores");
        showConsole.showListaProveedores(listsController.getProductos());
    }


    public void op5ListarProductos() {
        showConsole.showMessage("\n---- Ha seleccionado la opción 5. \n\tListar Productos");
        showConsole.showListaProductos(listsController.getProductos());
    }
}