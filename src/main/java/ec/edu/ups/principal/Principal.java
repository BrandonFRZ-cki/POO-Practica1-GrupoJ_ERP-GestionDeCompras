package ec.edu.ups.principal;

import ec.edu.ups.controllers.Controller;
import ec.edu.ups.controllers.Default;

public class Principal {
    public static void main(String[] args) {
        Default ejemplo = new Default();
        ejemplo.productosEjemplo();
        ejemplo.proveedoresEjemplo();
        ejemplo.empleadoEjemplo();
        ejemplo.gerenteEjemplo();

        Controller controller = new Controller(ejemplo.getListsController());
        controller.start();
    }
}