package co.edu.uniquindio.proyectofinal.proyectofxapp.model;

public class Venta {
    int idVenta;
    String fecha;
    int idClienteAsociado;

    public Venta() {
    }

    public Venta(int idVenta, String fecha, int idClienteAsociado) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.idClienteAsociado = idClienteAsociado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdClienteAsociado() {
        return idClienteAsociado;
    }

    public void setIdClienteAsociado(int idClienteAsociado) {
        this.idClienteAsociado = idClienteAsociado;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", fecha='" + fecha + '\'' +
                ", idClienteAsociado=" + idClienteAsociado +
                '}';
    }
}
