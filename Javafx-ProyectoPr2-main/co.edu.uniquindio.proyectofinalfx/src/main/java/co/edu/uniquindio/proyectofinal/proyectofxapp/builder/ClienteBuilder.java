package co.edu.uniquindio.proyectofinal.proyectofxapp.builder;

import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Cliente;

public class ClienteBuilder <T extends ClienteBuilder<T>>{
    protected String idCliente;
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected String telefonoCliente;

    protected double descuento;

    public T idCliente(String idCliente){
        this.idCliente=idCliente;
        return self();
    }

    public T nombre(String nombre){
        this.nombre=nombre;
        return self();
    }

    public T apellidos(String apellidos){
        this.apellidos=apellidos;
        return self();
    }
    public T direccion(String direccion){
        this.direccion=direccion;
        return self();
    }

    public T telefonoCliente(String telefonoCliente){
        this.telefonoCliente=telefonoCliente;
        return self();
    }

    public T descuento(double descuento){
        this.descuento=descuento;
        return self();
    }
    public Cliente build(){
        return new Cliente(idCliente,nombre,apellidos,direccion,telefonoCliente,descuento);
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }


}
