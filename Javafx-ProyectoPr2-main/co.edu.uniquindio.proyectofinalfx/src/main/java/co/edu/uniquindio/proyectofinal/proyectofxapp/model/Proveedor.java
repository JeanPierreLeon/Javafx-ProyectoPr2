package co.edu.uniquindio.proyectofinal.proyectofxapp.model;

public class Proveedor {
    int idProvedor;
    String nombreProveedor;
    String direccion;
    int telefono;

    public Proveedor() {
    }

    public Proveedor(int idProvedor, String nombreProveedor, String direccion, int telefono) {
        this.idProvedor = idProvedor;
        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "idProvedor=" + idProvedor +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
