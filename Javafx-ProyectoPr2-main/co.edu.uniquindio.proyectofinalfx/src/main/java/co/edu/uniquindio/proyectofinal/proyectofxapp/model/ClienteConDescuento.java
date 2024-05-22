package co.edu.uniquindio.proyectofinal.proyectofxapp.model;

import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.ClienteConDescuentoBuilder;

public class ClienteConDescuento extends Cliente {
    private double descuento;

    public ClienteConDescuento(ClienteConDescuentoBuilder builder) {
        super(builder);
        this.descuento = Double.parseDouble(String.valueOf(builder.descuento));
    }

    // Getters
    public double getDescuento() {
        return descuento;
    }
}
