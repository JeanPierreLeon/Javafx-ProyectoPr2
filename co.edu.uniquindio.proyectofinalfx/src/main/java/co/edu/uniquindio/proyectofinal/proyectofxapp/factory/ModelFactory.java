package co.edu.uniquindio.proyectofinal.proyectofxapp.factory;

import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.ClienteBuilder;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Cliente;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Empleado;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.TiendaDeportiva;

import java.util.ArrayList;
import java.util.List;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private  TiendaDeportiva tiendaDeportiva = TiendaDeportiva.builder().nombre("La activete").build();

    private ModelFactory(){
        inicializarDatos();
    }



    public static  ModelFactory getInstance(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {
        /*Creacion de Clientes*/
        Cliente cliente1= Cliente.builder()
                .idCliente("1")
                .nombre("Samuel")
                .apellidos("Salgado")
                .direccion("Cra 20 calle 34")
                .telefonoCliente("313")
                .build();

        Cliente cliente2= Cliente.builder()
                .idCliente("2")
                .nombre("Pierre")
                .apellidos("Sanchez")
                .direccion("Cra 78 calle 3")
                .telefonoCliente("310")
                .build();

        tiendaDeportiva.getListaClientes().add(cliente1);
        tiendaDeportiva.getListaClientes().add(cliente2);


        /*Creacion de Empleados*/
        Empleado empleado1 = Empleado.builder()
                .IdEmpleado("1")
                .nombreEmpleado("Carlos")
                .apellidos("Perez")
                .cargo("Operador")
                .direccion("Cra 23 calle 45")
                .build();


        Empleado empleado2 = Empleado.builder()
                .IdEmpleado("2")
                .nombreEmpleado("Karla")
                .apellidos("Urrego")
                .cargo("Operadora")
                .direccion("Cra 90 calle 47")
                .telefono("32453453")
                .build();

        tiendaDeportiva.getListaEmpleados().add(empleado1);
        tiendaDeportiva.getListaEmpleados().add(empleado2);

    }

    public void actualizarCliente(String idCliente, String Nombre, String Apellidos, String Direccion, String Telefono) {

        tiendaDeportiva.actualizarClientes(idCliente,Nombre,Apellidos,Direccion,Telefono);

        crearCliente(idCliente,Nombre,Apellidos,Direccion,Telefono);
    }

    public void crearCliente(String idCliente, String Nombre, String Apellidos, String Direccion, String Telefono) {
        Cliente cliente = Cliente.builder()
                .nombre(Nombre)
                .idCliente(idCliente)
                .apellidos(Apellidos)
                .direccion(Direccion)
                .telefonoCliente(Telefono)
                .build();

        tiendaDeportiva.getListaClientes().add(cliente);

    }

    public void eliminarClientes(String Telefono) {
        tiendaDeportiva.eliminarClientes(Telefono);
    }

    public List<Cliente> ObtenerDatosClientes() {
        List<Cliente> ListaClientes = new ArrayList<>();
        ListaClientes = tiendaDeportiva.getListaClientes();
        return ListaClientes;
    }

}
