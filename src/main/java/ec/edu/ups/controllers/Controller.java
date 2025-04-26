package ec.edu.ups.controllers;

import ec.edu.ups.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List <Producto> productos;


    public Controller() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {}

    public void productosDefault(){
        productos.add( new Producto("pb-251","Papel bond",3.5,true ));
        productos.add( new Producto("T554","Tinta impresora L3250",12.45,true ));

        productos.add( new Producto("sku:172","Curitas 100u",2.25,false ));
        productos.add( new Producto("sku:WE0001","Alcohol",2.75,false ));
        productos.add( new Producto("sku:18U9277","Gasa 7.5cm x 7.5cm",3.49,false ));

        productos.add( new Producto("IDC:006008","Teclado Sc744 Negro",4.42,true ));
    }
}
