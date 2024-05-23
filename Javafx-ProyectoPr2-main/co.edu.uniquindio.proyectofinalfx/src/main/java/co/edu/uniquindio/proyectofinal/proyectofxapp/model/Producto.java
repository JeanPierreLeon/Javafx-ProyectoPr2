package co.edu.uniquindio.proyectofinal.proyectofxapp.model;

import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.ClienteBuilder;
import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.EmpleadoBuilder;
import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.ProductoBuilder;

public class Producto {
    String idProducto;
    String nombreProducto;
    String descripcion;
    String precio;
    String stock;


    public Producto() {
    }

    public Producto(String idProducto, String nombreProducto, String descripcion, String precio, String stock) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public static ProductoBuilder builder(){
        return new ProductoBuilder();
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
