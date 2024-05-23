package co.edu.uniquindio.proyectofinal.proyectofxapp.controller;

import co.edu.uniquindio.proyectofinal.proyectofxapp.factory.ModelFactory;

import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Cliente;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Empleado;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Producto;

import java.util.List;

public class TiendaController {

    ModelFactory modelFactory;

    public TiendaController() {

        modelFactory = ModelFactory.getInstance();

    }

    public List<Cliente> obtenerClientes() {

        return modelFactory.obtenerClientes();
    }

    public List<Empleado> obtenerEmpleados() {

        return modelFactory.obtenerEmpleados();
    }

    public List<Producto> obtenerProductos() {

        return modelFactory.obtenerProductos();
    }

    public boolean CrearEmpleado(Empleado empleado) {
        return modelFactory.crearEmpleado(empleado);
    }

    public boolean CrearCliente(Cliente cliente) {
        return modelFactory.crearCliente(cliente);
    }

    public boolean CrearProducto(Producto producto) {
        return modelFactory.crearProducto(producto);
    }

    public boolean actualizarCliente(Cliente cliente) {
        return modelFactory.actualizarCliente(cliente);
    }

    public boolean actualizarEmpleado(Empleado empleado) {
        return modelFactory.actualizarEmpleado(empleado);
    }
    public boolean actualizarProducto(Producto producto) {
        return modelFactory.actualizarProducto(producto);
    }

    public boolean eliminarCliente(Cliente cliente) {
        return modelFactory.eliminarClientes(cliente);
    }
    public boolean eliminarEmpleado(Empleado empleado) {
        return modelFactory.eliminarEmpleados(empleado);
    }

    public boolean eliminarProducto(Producto producto) {
        return modelFactory.eliminarProducto(producto);
    }
}
