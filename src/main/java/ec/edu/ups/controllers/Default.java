package ec.edu.ups.controllers;

import ec.edu.ups.models.Direccion;
import ec.edu.ups.models.Producto;
import ec.edu.ups.models.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class Default {

    private List <Producto> productos;
    private List <Proveedor> proveedores;


    public Default() {
        this.productos = new ArrayList<>();
        this.proveedores = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public void agregarProducto(Producto producto) {}

    public void productosEjemplo(){
        productos.add( new Producto("pb-251","Papel bond",3.5,true ));
        productos.add( new Producto("T554","Tinta impresora L3250",12.45,true ));

        productos.add( new Producto("sku:172","Curitas 100u",2.25,false ));
        productos.add( new Producto("sku:WE0001","Alcohol",2.75,false ));
        productos.add( new Producto("sku:18U9277","Gasa 7.5cm x 7.5cm",3.49,false ));

        productos.add( new Producto("IDC:006008","Teclado Sc744 Negro",4.42,true ));
    }
    public void proveedoresEjemplo(){
        proveedores.add( new Proveedor("0302174263001","Viviana","Zambrano","Papeleria",new Direccion("Hurtado de Mensoza","Reventador","10-26","Cuenca","Azuay","Ecuador"),"0987654321"));
        proveedores.get(0).addProductoProveedor(productos.get(0));
        proveedores.get(0).addProductoProveedor(productos.get(1));

        proveedores.add( new Proveedor("0102366119","Rodrigo","Perez","Farmacia",new Direccion("Av.Mexico","Guatemala","S/N","Cuenca","Azuay","Ecuador"),"0912345678"));
        proveedores.get(1).addProductoProveedor(productos.get(2));
        proveedores.get(1).addProductoProveedor(productos.get(3));
        proveedores.get(1).addProductoProveedor(productos.get(4));

        proveedores.add( new Proveedor("0302174271","Luis","Zambrano","Tecnologia",new Direccion("La Castellana","Cartagena","20-3","Cuenca","Azuay","Ecuador"),"0987654321"));
        proveedores.get(2).addProductoProveedor(productos.get(5));

    }

}
