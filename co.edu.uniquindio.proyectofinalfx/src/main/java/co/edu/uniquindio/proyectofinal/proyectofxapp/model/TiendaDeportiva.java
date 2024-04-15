package co.edu.uniquindio.proyectofinal.proyectofxapp.model;

import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.TiendaDeportivaBuilder;

import java.util.ArrayList;
import java.util.List;

public class TiendaDeportiva {
    private String nombre;
    private List<Cliente> ListaClientes = new ArrayList<>();
    private List<Venta> ListaVentas = new ArrayList<>();
    private List<Producto> ListaProductos = new ArrayList<>();
    private List<Empleado> ListaEmpleados = new ArrayList<>();
    private List<Proveedor> listaProveedores = new ArrayList<>();


    public static TiendaDeportivaBuilder builder(){
        return new TiendaDeportivaBuilder();
    }
    public TiendaDeportiva(String nombre, List<Cliente> listaClientes, List<Venta> listaVentas, List<Producto> listaProductos, List<Empleado> listaEmpleados, List<Proveedor> listaProveedores) {
        this.nombre = nombre;
        ListaClientes = listaClientes;
        ListaVentas = listaVentas;
        ListaProductos = listaProductos;
        ListaEmpleados = listaEmpleados;
        this.listaProveedores = listaProveedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return ListaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        ListaClientes = listaClientes;
    }

    public List<Venta> getListaVentas() {
        return ListaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        ListaVentas = listaVentas;
    }

    public List<Producto> getListaProductos() {
        return ListaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        ListaProductos = listaProductos;
    }

    public List<Empleado> getListaEmpleados() {
        return ListaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        ListaEmpleados = listaEmpleados;
    }

    public List<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(List<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    @Override
    public String toString() {
        return "TiendaDeportiva{" +
                "nombre='" + nombre + '\'' +
                ", ListaClientes=" + ListaClientes +
                ", ListaVentas=" + ListaVentas +
                ", ListaProductos=" + ListaProductos +
                ", ListaEmpleados=" + ListaEmpleados +
                ", listaProveedores=" + listaProveedores +
                '}';
    }

    public void eliminarClientes(String TelefonoCliente){
        for(Cliente cliente: getListaClientes()){
            if(cliente.getTelefonoCliente().equals(TelefonoCliente) ){
                getListaClientes().remove(cliente);
                break;
            }
        }
    }
    public void actualizarClientes(String idCliente, String Nombre, String Apellidos, String Direccion, String Telefono) {
        eliminarClientes(Telefono);

    }
}
