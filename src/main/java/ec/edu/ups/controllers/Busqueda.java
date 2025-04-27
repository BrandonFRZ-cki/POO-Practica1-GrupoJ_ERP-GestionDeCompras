package ec.edu.ups.controllers;

import ec.edu.ups.models.Producto;
import ec.edu.ups.models.Proveedor;

import java.util.List;

public class Busqueda {
    private static Proveedor busquedaPorId(List<Proveedor> proveedores,String id){
        for (Proveedor proveedor : proveedores){
            if (proveedor.getIdentificacion().equalsIgnoreCase(id)) {
                return proveedor;
            }
        }
        return null;
    }
    public static Producto productoPorNombre(List<Producto> productos, String nombre){
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                return producto;
            }
        }
        return null;
    }
}
