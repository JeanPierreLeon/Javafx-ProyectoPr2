package co.edu.uniquindio.proyectofinal.proyectofxapp.builder;

import co.edu.uniquindio.proyectofinal.proyectofxapp.model.*;

import java.util.ArrayList;
import java.util.List;

public class TiendaDeportivaBuilder {
    protected String nombre;
    protected List<Cliente> ListaClientes = new ArrayList<>();
    protected List<Venta> ListaVentas = new ArrayList<>();
    protected List<Producto> ListaProductos = new ArrayList<>();
    protected List<Empleado> ListaEmpleados = new ArrayList<>();
    protected List<Proveedor> ListaProveedores = new ArrayList<>();

    public TiendaDeportivaBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public TiendaDeportivaBuilder ListaClientes(List<Cliente> ListaClientes) {
        this.ListaClientes = ListaClientes;
        return this;
    }

    public  TiendaDeportivaBuilder ListaVentas ( List<Venta> ListaVentas) {
        this.ListaVentas = ListaVentas;
        return this;
    }

    public  TiendaDeportivaBuilder ListaProductos ( List<Producto> ListaProductos) {
        this.ListaProductos = ListaProductos;
        return this;
    }

    public  TiendaDeportivaBuilder ListaEmpleados ( List<Empleado> ListaEmpleados) {
        this.ListaEmpleados = ListaEmpleados;
        return this;
    }
    public  TiendaDeportivaBuilder ListaProveedores ( List<Proveedor> ListaProveedores) {
        this.ListaProveedores = ListaProveedores;
        return this;
    }



    public TiendaDeportiva build() {
        return new TiendaDeportiva(nombre,ListaClientes,ListaVentas,ListaProductos,ListaEmpleados,ListaProveedores);
    }
}
