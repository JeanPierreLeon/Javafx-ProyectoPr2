package co.edu.uniquindio.proyectofinal.proyectofxapp.builder;

import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Cliente;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Empleado;

public class EmpleadoBuilder <T extends EmpleadoBuilder<T>> {
    protected String IdEmpleado;
    protected String nombreEmpleado;
    protected String apellidos;
    protected String cargo;
    protected String telefono;
    protected String direccion;

    public T IdEmpleado(String IdEmpleado){
        this.IdEmpleado=IdEmpleado;
        return self();
    }

    public T nombreEmpleado(String nombreEmpleado ){
        this.nombreEmpleado=nombreEmpleado;
        return self();
    }
    public T apellidos(String apellidos){
        this.apellidos=apellidos;
        return self();
    }
    public T cargo(String cargo){
        this.cargo=cargo;
        return self();
    }

    public T telefono(String telefono){
        this.telefono=telefono;
        return self();
    }
    public T direccion(String direccion){
        this.direccion=direccion;
        return self();
    }

    public Empleado build(){
        return new Empleado(IdEmpleado,nombreEmpleado,apellidos,cargo,telefono,direccion);
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

}
