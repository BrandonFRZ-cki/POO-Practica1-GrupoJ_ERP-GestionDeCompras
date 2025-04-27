package ec.edu.ups.controllers;

import ec.edu.ups.models.*;


import java.util.GregorianCalendar;


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
        listsController.agregarProducto(
                new Producto(
                        "pb-251",
                        "Papel bond",
                        3.5,
                        true,
                        new Proveedor(
                                "0302174263001",
                                "Viviana",
                                "Zambrano",
                                "Papelería",
                                new Direccion(
                                        "Hurtado de Mensoza", "Reventador", "10-26",
                                        "Cuenca", "Azuay", "Ecuador"),
                                "0987654321")));
        listsController.agregarProducto(
                new Producto(
                        "T554",
                        "Tinta impresora L3250",
                        12.45,
                        true,
                        new Proveedor(
                                "0302174263001",
                                "Viviana",
                                "Zambrano",
                                "Papelería",
                                new Direccion(
                                        "Hurtado de Mensoza", "Reventador", "10-26",
                                        "Cuenca", "Azuay", "Ecuador"), "0987654321")));

        listsController.agregarProducto(
                new Producto(
                        "sku:172",
                        "Curita",
                        0.30,
                        false,
                        new Proveedor(
                                "0102366119",
                                "Rodrigo",
                                "Perez",
                                "Farmacia",
                                new Direccion(
                                        "Av.Mexico", "Guatemala", "S/N",
                                        "Cuenca", "Azuay", "Ecuador"), "0912345678")));
        listsController.agregarProducto(
                new Producto(
                        "sku:WE0001",
                        "Alcohol",
                        2.75,
                        false,
                        new Proveedor(
                                "0102366119",
                                "Rodrigo",
                                "Perez",
                                "Farmacia",
                                new Direccion(
                                        "Av.Mexico", "Guatemala", "S/N",
                                        "Cuenca", "Azuay", "Ecuador"), "0912345678")));
        listsController.agregarProducto(
                new Producto(
                        "sku:18U9277",
                        "Gasa 7.5cm x 7.5cm",
                        3.49,
                        false,
                        new Proveedor(
                                "0102366119",
                                "Rodrigo",
                                "Perez",
                                "Farmacia",
                                new Direccion(
                                        "Av.Mexico", "Guatemala", "S/N",
                                        "Cuenca", "Azuay", "Ecuador"), "0912345678")));

        listsController.agregarProducto(
                new Producto("IDC:006008",
                        "Teclado Sc744 Negro",
                        4.42,
                        true,
                        new Proveedor(
                                "0302174271",
                                "Luis",
                                "Zambrano",
                                "Tecnología",
                                new Direccion(
                                        "La Castellana", "Cartagena", "20-3",
                                        "Cuenca", "Azuay", "Ecuador"), "0987654321")));
    }

    public void empleadoEjemplo() {
        listsController.agregarEmpleado(new Empleado("0107233710", "Brandon", "Rivera", Departamento.RECURSOS_HUMANOS));
        listsController.agregarEmpleado(new Empleado("0101010101", "Erick", "Yunga", Departamento.FINANCIERO));
        listsController.agregarEmpleado(new Empleado("0202020202", "Pedro", "Pesantez", Departamento.MARKETING));
    }

    public void gerenteEjemplo() {
        gerente = new Gerente("0103176194", "Cecilia", "Zambrano", Departamento.DIRECTOR_GENERAL, "123@");
    }
    public void solicitudEjemplo() {
        // --------------------------------------------------------------- Curitas - Empleado Bradon
        SolicitudCompra solicitud1 = new SolicitudCompra(
                1,
                listsController.getEmpleados().get(0),
                EstadoSolicitud.SOLICITADA,
                "Falta tinta",
                new GregorianCalendar(2025, GregorianCalendar.APRIL, 26),
                "Utensilios para imprimir contratos",
                "Sin observaciones"
        );
        solicitud1.addDetalle(new DetalleCompraProducto(
                1,
                4,
                UnidadMedida.UNIDAD,
                listsController.getProductos().get(0)
        ));
        solicitud1.addDetalle(new DetalleCompraProducto(
                2,
                2,
                UnidadMedida.UNIDAD,
                listsController.getProductos().get(1)
        ));
        listsController.agregarSolicitudCompra(solicitud1);

        // --------------------------------------------------------------- Curitas - Empleado Erick
        SolicitudCompra solicitud2 = new SolicitudCompra(
                2,
                listsController.getEmpleados().get(1),
                EstadoSolicitud.SOLICITADA,
                "Botiquín de primeros auxilios",
                new GregorianCalendar(2025, GregorianCalendar.APRIL, 26),
                "Materiales médicos básicos",
                "Urgente"
        );
        solicitud2.addDetalle(new DetalleCompraProducto(
                1,
                10,
                UnidadMedida.UNIDAD,
                listsController.getProductos().get(2)
        ));
        solicitud2.addDetalle(new DetalleCompraProducto(
                2,
                2,
                UnidadMedida.CAJA,
                listsController.getProductos().get(3)

        ));
        listsController.agregarSolicitudCompra(solicitud2);


        // --------------------------------------------------------------- Teclado - Empleado Pedro
        SolicitudCompra solicitud3 = new SolicitudCompra(
                3,
                listsController.getEmpleados().get(2),
                EstadoSolicitud.SOLICITADA,
                "Equipos para nueva contratación",
                new GregorianCalendar(2025, GregorianCalendar.APRIL, 26),
                "Se necesita teclado para nuevo empleado",
                "Solicitar lo antes posible"
        );
        solicitud3.addDetalle(new DetalleCompraProducto(
                4,
                1,
                UnidadMedida.UNIDAD,
                listsController.getProductos().get(5)
        ));
        listsController.agregarSolicitudCompra(solicitud3);
    }


}