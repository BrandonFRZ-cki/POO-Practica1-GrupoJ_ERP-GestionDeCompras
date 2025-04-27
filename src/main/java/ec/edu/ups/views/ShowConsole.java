package ec.edu.ups.views;

import ec.edu.ups.models.Direccion;
import ec.edu.ups.models.Producto;

import java.util.List;
import java.util.Scanner;

public class ShowConsole {
    Scanner scanner = new Scanner(System.in);
    //--------------------------------------------------------- MENSAJES
    public void showMessage(String mensaje) {
        System.out.println(mensaje);
    }
    public void showError(String mensaje) {
        System.err.println("ERROR: "+mensaje);
    }

    //--------------------------------------------------------- MENUS
    public int showMenuPrincipal() {
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
    public int showMenuIngresoProducto() {
        System.out.println("-------------- MENU CREACION DE PRODUCTOS ---------------");
        System.out.println("1.  Desea Crear Solo El Producto");
        System.out.println("2.  Producto con proveedor");
        System.out.println("---------------------------------------------------------");
        System.out.print("Opcion: ");
        return scanner.nextInt();
    }

    //--------------------------------------------------------- INGRESAR
    public String ingresoId(String mensaje){
        System.out.print("\n\t\tIngrese id del "+mensaje+": ");
        String id = scanner.next();
        scanner.nextLine();
        return id;
    }
    public String ingresoNombre(String mensaje){
        System.out.print("\n\t\tIngrese el nombre del "+mensaje+": ");
        String nombre = scanner.nextLine();
        return nombre;
    }
    public String ingresoApellido(String mensaje){
        System.out.print("\n\t\tIngrese apellido del "+mensaje+": ");
        String apellido = scanner.nextLine();
        return apellido;
    }
    public double ingresoPrecio(String mensaje){
        System.out.print("\n\t\tIngrese el precio del "+mensaje+" (con coma , ) : ");
        double precio = scanner.nextDouble();
        return precio;
    }
    public boolean ingresoIVA(String mensaje){
        System.out.print("\n\t\tEl "+mensaje+" tiene IVA? Si/NO: ");
        return scanner.next().equalsIgnoreCase("Si");
    }
    public Direccion ingresoDireccion(){
        System.out.println("\n\t\tDireccion- --  ");
        return new Direccion(
                ingresoTexto("\n\t\t\tCalle Principal  : "),
                ingresoTexto("\n\t\t\tCalle Segundaria : "),
                ingresoTexto("\n\t\t\tNumeracion       : "),
                ingresoTexto("\n\t\t\tCiudad           : "),
                ingresoTexto("\n\t\t\tProvincia        : "),
                ingresoTexto("\n\t\t\tPais             : ")
        );
    }
    public String ingresoTexto(String mensaje){
        System.out.print(mensaje);
        String ingresado = scanner.nextLine();
        return ingresado;
    }

    //--------------------------------------------------------- LISTAR
    public void showListaProductos(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public void showListaProveedores(List<Producto> productos) {
        for (int i = 0; i < productos.size(); i++) {
            if (i == productos.size() - 1 || !productos.get(i).getProveedor().equals(productos.get(i + 1).getProveedor())) {
                System.out.println(productos.get(i).getProveedor());
            }
        }
    }





}
