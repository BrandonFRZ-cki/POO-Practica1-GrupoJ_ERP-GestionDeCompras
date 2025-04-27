package ec.edu.ups.views;

import ec.edu.ups.models.Producto;
import ec.edu.ups.models.Proveedor;

import java.util.List;
import java.util.Scanner;

public class ShowConsole {
    Scanner scanner = new Scanner(System.in);
    public void showMessage(String mensaje) {
        System.out.println(mensaje);
    }
    public int showMenu() {
        System.out.println("\n======= SISTEMA DE GESTIÓN DE COMPRAS =======");
        System.out.println("-------------- MENU PRINCIPAL ---------------");
        System.out.println("1.  Resgistrar Proveedor");
        System.out.println("2.  Registrar Producto");
        System.out.println("3.  Registrar Solicitud de compra");
        System.out.println("4.  Listar Proveedores");
        System.out.println("5.  Listar Productos");
        System.out.println("6.  Listar Solicitud de compra");
        System.out.println("7.  Buscar Proveedor por ID");
        System.out.println("8.  Buscar Producto por nombre");
        System.out.println("9.  Buscar Solicitud por numero");
        System.out.println("10. Aprobar / Recuperar Solicitud de compra");
        System.out.println("11. Salir");
        System.out.println("--------------------------------------------");
        System.out.print("Opcion: ");
        return scanner.nextInt();
    }
    public String ingresoId(){
        System.out.print("\n\t\tIngrese id : ");
        String id = scanner.next();
        scanner.nextLine();
        return id;
    }
    public String ingresoNombre(){
        System.out.print("\n\t\tIngrese el nombre: ");
        String nombre = scanner.nextLine();
        return nombre;
    }
    public String ingresoApellido(){
        System.out.print("\n\t\tIngrese apellido: ");
        String apellido = scanner.nextLine();
        return apellido;
    }
    public double ingresoPrecio(){
        System.out.print("\n\t\tIngrese el precio (con coma , ): ");
        double precio = scanner.nextDouble();
        return precio;
    }
    public boolean ingresoIVA(){
        System.out.print("\n\t\tTiene IVA? Si/NO: ");
        return scanner.next().equalsIgnoreCase("Si");
    }
    public void listarProductos( List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public void listarProveedores( List<Proveedor> proveedores) {
        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor);
        }
    }




}
