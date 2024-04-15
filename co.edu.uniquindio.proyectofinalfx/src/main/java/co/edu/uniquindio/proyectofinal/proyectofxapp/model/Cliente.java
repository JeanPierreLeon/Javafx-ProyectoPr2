package co.edu.uniquindio.proyectofinal.proyectofxapp.model;

import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.ClienteBuilder;

public class Cliente {
    String idCliente;
    String nombre;
    String apellidos;
    String direccion;
    String telefonoCliente;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, String apellidos, String direccion, String telefonoCliente) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonoCliente = telefonoCliente;
    }
    public static ClienteBuilder builder(){
        return new ClienteBuilder();
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
}
