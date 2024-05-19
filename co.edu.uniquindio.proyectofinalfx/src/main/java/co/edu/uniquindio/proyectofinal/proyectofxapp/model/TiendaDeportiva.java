package co.edu.uniquindio.proyectofinal.proyectofxapp.model;

import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.TiendaDeportivaBuilder;

import java.util.ArrayList;
import java.util.List;

public class TiendaDeportiva {
    private String nombre;
    private static List<Cliente> ListaClientes = new ArrayList<>();
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

    public  List<Cliente> getListaClientes() {
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

    public boolean eliminarClientes(Cliente clienteEliminar){
        Cliente clienteEncontrado = obtenerCliente(clienteEliminar.getIdCliente());
        if(clienteEncontrado != null){
            getListaClientes().remove(clienteEncontrado);
            return true;
        }else{
            return  false;
        }
    }

    public boolean eliminarEmpleados(Empleado empleadoEliminar) {
        Empleado empleadoEncontrado = obtenerEmpleado(empleadoEliminar.getIdEmpleado());
        if(empleadoEncontrado != null){
            getListaEmpleados().remove(empleadoEncontrado);
            return true;
        }else{
            return  false;
        }
    }
    public boolean actualizarClientes(Cliente cliente) {
        Cliente clienteEncontrado = obtenerCliente(cliente.getIdCliente());
        if(clienteEncontrado != null){
            getListaClientes().remove(clienteEncontrado);
            getListaClientes().add(cliente);
            return true;
        }else{
            return  false;
        }
    }

    public boolean actualizarEmpleados(Empleado empleado) {
        Empleado empleadoEncontrado = obtenerEmpleado(empleado.getIdEmpleado());
        if(empleadoEncontrado != null){
            getListaEmpleados().remove(empleadoEncontrado);
            getListaEmpleados().add(empleado);
            return true;
        }else{
            return  false;
        }
    }

/*
    public static List<Cliente> obtenerClientesPorApellidos(String Apellidos) {
        List<Cliente> listaClientesPorApellidos = new ArrayList<>();

        for (Cliente cliente: getListaClientes()) {
            if(cliente.getApellidos().equalsIgnoreCase(Apellidos)){
                listaClientesPorApellidos.add(cliente);
            }
        }

        return listaClientesPorApellidos;
    }
*/

    private Cliente obtenerCliente(String idCliente) {
        Cliente cliente = null;
        for (Cliente cliente1: getListaClientes()) {
            if(cliente1.getIdCliente().equalsIgnoreCase(idCliente)){
                cliente = cliente1;
                break;
            }
        }

        return cliente;
    }

    public boolean crearCliente(Cliente nuevoCliente) {

        Cliente ClienteEncontrado = obtenerCliente(nuevoCliente.getIdCliente());
        if(ClienteEncontrado == null){
            getListaClientes().add(nuevoCliente);
            return true;
        }else{
            return  false;
        }

    }
    private Empleado obtenerEmpleado(String idEmpleado) {
        Empleado empleado = null;
        for (Empleado empleado1: getListaEmpleados()) {
            if(empleado1.getIdEmpleado().equalsIgnoreCase(idEmpleado)){
                empleado = empleado1;
                break;
            }
        }

        return empleado;
    }
    public boolean crearEmpleado(Empleado nuevoEmpleado) {

        Empleado empleadoEncontrado = obtenerEmpleado(nuevoEmpleado.getIdEmpleado());
        if(empleadoEncontrado == null){
            getListaEmpleados().add(nuevoEmpleado);
            return true;
        }else{
            return  false;
        }

    }
    public List<Cliente> obtenerClientesPorApellido(String Apellidos) {
        List<Cliente> listaClientesPorApellidos = new ArrayList<>();

        for (Cliente cliente: getListaClientes()) {
            if(cliente.getApellidos().equalsIgnoreCase(Apellidos)){
                listaClientesPorApellidos.add(cliente);
            }
        }

        return listaClientesPorApellidos;

    }



}
