package co.edu.uniquindio.proyectofinal.proyectofxapp.builder;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Cliente;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.ClienteConDescuento;


public class ClienteConDescuentoBuilder extends ClienteBuilder<ClienteConDescuentoBuilder> {
    public double descuento;

    public ClienteConDescuentoBuilder descuento(double descuento) {
        this.descuento = descuento;
        return this;
    }

    public ClienteConDescuento build() {
        return new ClienteConDescuento(this);
    }
}
