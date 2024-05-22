package co.edu.uniquindio.proyectofinal.proyectofxapp.model;

import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.ClienteBuilder;
import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.ClienteConDescuentoBuilder;
import co.edu.uniquindio.proyectofinal.proyectofxapp.services.ClienteDecorator;

public class Cliente implements ClienteDecorator {
    private String idCliente;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefonoCliente;
    private double descuento;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, String apellidos, String direccion, String telefonoCliente, double descuento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonoCliente = telefonoCliente;
        this.descuento=descuento;
    }
    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }
    public Cliente(ClienteConDescuentoBuilder builder) {
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefonoCliente +
                '}';
    }

    @Override
    public double calcularPrecio(double precioBase) {
        getDescuento();
        double precioConDescuento = precioBase - getDescuento();
        return precioConDescuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
