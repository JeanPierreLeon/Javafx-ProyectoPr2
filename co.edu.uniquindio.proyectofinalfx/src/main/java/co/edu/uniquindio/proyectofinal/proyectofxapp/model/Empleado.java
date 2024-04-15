package co.edu.uniquindio.proyectofinal.proyectofxapp.model;

import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.ClienteBuilder;
import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.EmpleadoBuilder;

public class Empleado {

    String IdEmpleado;
    String nombreEmpleado;
    String apellidos;
    String cargo;
    String telefono;
    String direccion;

    public Empleado() {
    }

    public Empleado(String IdEmpleado, String nombreEmpleado, String apellidos, String cargo, String telefono, String direccion) {
        this.IdEmpleado = IdEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public static EmpleadoBuilder builder(){
        return new EmpleadoBuilder();
    }
    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        IdEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "IdEmpleado=" + IdEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cargo='" + cargo + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
