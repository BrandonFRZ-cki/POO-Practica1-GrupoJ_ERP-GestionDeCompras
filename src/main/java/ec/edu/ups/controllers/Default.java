package ec.edu.ups.controllers;

import ec.edu.ups.models.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;
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
    public void solicitudesEjemplo() {

        //listsController.agregarSolicitudCompra(new SolicitudCompra(21,new Empleado("05055050","erick","yunga",Departamento.FINANCIERO));
        // Crear productos
        Producto producto1 = new Producto("P001", "Laptop", 800, true, new Proveedor("P001", "Proveedor1", "Apellido1", "Proveedor 1", new Direccion(), "12345"));
        Producto producto2 = new Producto("P002", "Mouse", 20, false, new Proveedor("P002", "Proveedor2", "Apellido2", "Proveedor 2", new Direccion(), "67890"));

        // Crear detalle de compra (productos individuales)
        DetalleCompraProducto detalleProducto1 = new DetalleCompraProducto(1, 2, "Laptop", null, UnidadMedida.KILOS, producto1) {
            @Override
            public double generarModificadorDeCosto() {
                return 0;
            }

            @Override
            public double generarModificacionDeCosto() {
                return 0;
            }
        };
        DetalleCompraProducto detalleProducto2 = new DetalleCompraProducto(2, 3, "Mouse", null, UnidadMedida.KILOS, producto2) {
            @Override
            public double generarModificadorDeCosto() {
                return 0;
            }

            @Override
            public double generarModificacionDeCosto() {
                return 0;
            }
        };



        // Crear solicitud de compra de productos
        List<DetalleCompra> detalles = new ArrayList<>();
        detalles.add(detalleProducto1);
        detalles.add(detalleProducto2);

        SolicitudCompra solicitudCompra = new SolicitudCompra(1, new Empleado(), EstadoSolicitud.SOLICITADA, "Compra de material informático", new GregorianCalendar(), "Laptop y accesorios", "Urgente", detalles, null);

        // Agregar la solicitud de compra al controlador
        listsController.agregarSolicitudCompra(solicitudCompra);

        System.out.println("Solicitud de compra registrada con éxito.");

        // Crear detalle de compra (paquete con productos)
        DetalleCompraPaquete paquete = new DetalleCompraPaquete() {
            @Override
            public double generarModificadorDeCosto() {
                return 0;
            }

            @Override
            public double generarModificacionDeCosto() {
                return 0; // Ajuste si se requiere un cálculo adicional para el paquete
            }

            @Override
            public double calcularCostoTotal() {
                double total = 0;
                for (Producto p : getProductos()) {
                    total += p.getPrecioUnitario();
                }
                return total - getDescuento(); // Descuento aplicado al total
            }
        };

        paquete.addProducto(producto1);
        paquete.addProducto(producto2);
        paquete.setDescuento(100);  // Ejemplo de descuento

        // Crear solicitud de compra de paquete
        List<DetalleCompra> detalle = new ArrayList<>();
        detalles.add(paquete);

        SolicitudCompra solicitud = new SolicitudCompra(1, new Empleado(), EstadoSolicitud.SOLICITADA, "Compra de paquete de productos", new GregorianCalendar(), "Paquete de Laptop y Mouse", "Urgente", detalles, null);

        // Agregar la solicitud de compra al controlador
        listsController.agregarSolicitudCompra(solicitudCompra);

        System.out.println("Solicitud de compra de paquete registrada con éxito.");
    }
}