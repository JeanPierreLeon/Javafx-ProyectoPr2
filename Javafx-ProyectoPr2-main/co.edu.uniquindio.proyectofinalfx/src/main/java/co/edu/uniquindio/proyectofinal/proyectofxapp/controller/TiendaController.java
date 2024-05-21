package co.edu.uniquindio.proyectofinal.proyectofxapp.controller;

import co.edu.uniquindio.proyectofinal.proyectofxapp.factory.ModelFactory;

import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Cliente;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Empleado;

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

    public boolean CrearEmpleado(Empleado empleado) {
        return modelFactory.crearEmpleado(empleado);
    }

    public boolean CrearCliente(Cliente cliente) {
        return modelFactory.crearCliente(cliente);
    }

    public boolean actualizarCliente(Cliente cliente) {
        return modelFactory.actualizarCliente(cliente);
    }

    public boolean actualizarEmpleado(Empleado empleado) {
        return modelFactory.actualizarEmpleado(empleado);
    }

    public boolean eliminarCliente(Cliente cliente) {
        return modelFactory.eliminarClientes(cliente);
    }
    public boolean eliminarEmpleado(Empleado empleado) {
        return modelFactory.eliminarEmpleados(empleado);
    }


    public List<Cliente> obtenerClientesPorApellidos(String Apellidos) {
        return modelFactory.obtenerClientesPorApellidos(Apellidos);
    }




    //  public List<Cliente> obtenerClientesPorNombre(String Nombre) {
  //      return modelFactory.obtenerClientesPorNombre(Nombre);
   // }
}
