package ec.edu.ups.controllers;

import ec.edu.ups.models.*;
import ec.edu.ups.views.ShowConsole;

import java.util.GregorianCalendar;

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
                    op3RegistrarSolicitud();
                    break;
                case 4:
                    op4ListarProveedores();
                    break;
                case 5:
                    op5ListarProductos();
                    break;
                case 6:

                    op6ListarSolicitudes();
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

    public void op3RegistrarSolicitud() {
        showConsole.showMessage("\n---- Ha seleccionado la opción 3. \n\tRegistrar Solicitud");
        int opcionSolicitud = showConsole.showMenuIngresoSolicitud();
        if(opcionSolicitud==1){
            int nuevoId = listsController.getSolicitudes().size() + 1;
            Empleado empleadoSeleccionado=null;

            showConsole.showMessage("-------- QUIEN ERES");
            showConsole.showListaEmpleados(listsController.getEmpleados());
            String id =showConsole.ingresoId(" empleado (el suyo)");
            for (int i = 0; i < listsController.getEmpleados().size(); i++) {
                if(id.equals(listsController.getEmpleados().get(i).getIdentificacion())){
                    empleadoSeleccionado = listsController.getEmpleados().get(i);
                }
            }
            if(empleadoSeleccionado!=null){
                SolicitudCompra solicitud = new SolicitudCompra(
                        nuevoId,
                        empleadoSeleccionado,
                        EstadoSolicitud.SOLICITADA,
                        showConsole.ingresoTexto("--- Motivo : "),
                        new GregorianCalendar(
                                showConsole.ingresoNumero("\n\t\tAño: "),
                                showConsole.ingresoNumero("\n\t\tMes: ")-1,
                                showConsole.ingresoNumero("\n\t\tDia:")
                        ),
                        showConsole.ingresoTexto("--- Detalles del Material : "),
                        showConsole.ingresoTexto("--- Observaciones :")
                );
                boolean agregarOtroProducto = true;
                int contadorDetalle = 1;
                do {
                    Producto productoSeleccionado=null;
                    do {
                        System.out.println("Seleccione un producto para agregar a la solicitud:");
                        for (int i = 0; i < listsController.getProductos().size(); i++) {
                            System.out.println("ID: "+listsController.getProductos().get(i).getIdProducto()+" Nombre:"+listsController.getProductos().get(i).getNombre());
                        }

                        String idProd = showConsole.ingresoId("producto que quiere agregar ");
                        for (int i = 0; i < listsController.getProductos().size(); i++) {
                            if(listsController.getProductos().get(i).getIdProducto().equals(idProd)){
                                productoSeleccionado = listsController.getProductos().get(i);
                            }
                        }
                        if(productoSeleccionado==null){
                            showConsole.showError("El producto no existe");
                        }
                    }while(productoSeleccionado==null);

                    DetalleCompraProducto detalle = new DetalleCompraProducto(
                            contadorDetalle++,
                            showConsole.ingresoNumero("\n\t\tCantidad : "),
                            showConsole.ingresoUnidadMedida(),
                            productoSeleccionado
                    );

                    solicitud.addDetalle(detalle);
                    agregarOtroProducto = showConsole.ingresoTexto2("¿Desea agregar otro producto? (SI/NO): ").equalsIgnoreCase("si");

                } while (agregarOtroProducto);

                listsController.agregarSolicitudCompra(solicitud);

            }
            else{
                showConsole.showError("Usted no es parte de la empresa");
            }
        }
    }


    public void op4ListarProveedores() {
        showConsole.showMessage("\n---- Ha seleccionado la opcion 4. \n\tListar Proveedores");
        showConsole.showListaProveedores(listsController.getProductos());
    }

    public void op5ListarProductos() {
        showConsole.showMessage("\n---- Ha seleccionado la opción 5. \n\tListar Productos");
        showConsole.showListaProductos(listsController.getProductos());
    }

    public void op6ListarSolicitudes() {
        showConsole.showMessage("\n---- Ha seleccionado la opcion 6. \n\tListar Solicitud de compra");
        showConsole.showListaSolicitudes(listsController.getSolicitudes());

    }
}