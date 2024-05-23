package co.edu.uniquindio.proyectofinal.proyectofxapp.builder;

import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Empleado;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Producto;

public class ProductoBuilder <T extends ProductoBuilder<T>> {
    protected String idProducto;
    protected String nombreProducto;
    protected String descripcion;
    protected String precio;
    protected String stock;

    public T idProducto(String idProducto){
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

    public T precio(String precio){
        this.precio=precio;
        return self();
    }

    public T stock(String stock){
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
