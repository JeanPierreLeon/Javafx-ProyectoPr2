package co.edu.uniquindio.proyectofinal.proyectofxapp.builder;

import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Empleado;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Producto;

public class ProductoBuilder <T extends ProductoBuilder<T>> {
    protected int idProducto;
    protected String nombreProducto;
    protected String descripcion;
    protected int precio;
    protected boolean stock;

    public T idProducto(int idProducto){
        this.idProducto=idProducto;
        return self();
    }

    public T nombreProducto(String nombreProducto){
        this.nombreProducto=nombreProducto;
        return self();
    }

    public T descripcion(String descripcion){
        this.descripcion=descripcion;
        return self();
    }

    public T precio(int precio){
        this.precio=precio;
        return self();
    }

    public T stock(boolean stock){
        this.stock=stock;
        return self();
    }

    public Producto build(){
        return new Producto(idProducto,nombreProducto,descripcion,precio,stock);
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }
}
