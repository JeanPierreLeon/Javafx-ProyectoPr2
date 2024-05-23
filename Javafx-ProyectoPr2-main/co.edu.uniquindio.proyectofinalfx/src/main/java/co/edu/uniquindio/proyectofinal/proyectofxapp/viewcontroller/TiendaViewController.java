package co.edu.uniquindio.proyectofinal.proyectofxapp.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyectofinal.proyectofxapp.builder.ClienteConDescuentoBuilder;
import co.edu.uniquindio.proyectofinal.proyectofxapp.controller.TiendaController;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Cliente;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.ClienteConDescuento;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Empleado;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Producto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TiendaViewController {
    TiendaController tiendaController;
    Cliente clienteSeleccionado;
    Empleado empleadoSeleccionado;
    Producto productoSeleccionado;
    ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList();
    ObservableList<Producto> listaProductos = FXCollections.observableArrayList();
    ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private TextField txtFiltrar;


    @FXML
    private URL location;

    @FXML
    private TableView<Cliente> TableCliente;

    @FXML
    private TableView<Empleado> TableEmpleado;

    @FXML
    private TableView<Producto> TableProducto;

    @FXML
    private Button btnFiltrarApellidos;

    @FXML
    private Button btnCrearProducto;

    @FXML
    private Button btnEliminarProducto;

    @FXML
    private Button btnActualizarProducto;

    @FXML
    private Button btnFiltrarNombre;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private Button btnActualizarEmpleado;

    @FXML
    private Button btnEliminarEmpleado;

    @FXML
    private Button btnCearCliente;

    @FXML
    private Button btnCrearEmpleado;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private TableColumn<Producto, String> colNombreProducto;

    @FXML
    private TableColumn<Producto, String> colPrecio;

    @FXML
    private TableColumn<Producto, String> colProducto;

    @FXML
    private TableColumn<Producto, String> colStock;

    @FXML
    private TableColumn<Producto, String> colDescripcion;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private TextField txtIDProducto;

    @FXML
    private TextField txtNombreProducto;

    @FXML
    private TextField txtPrecioProducto;

    @FXML
    private TextField txtStock;

    @FXML
    private TableColumn<Cliente, String> colApellidos;

    @FXML
    private TableColumn<Cliente, String> colCliente;

    @FXML
    private TableColumn<Cliente, String> colDireccion;

    @FXML
    private TableColumn<Cliente, String> colNombre;

    @FXML
    private TableColumn<Cliente, String> colTelefono;


    @FXML
    private TableColumn<Empleado, String> colApellidosEmpleado;

    @FXML
    private TableColumn<Empleado, String> colCargoEmpleado;

    @FXML
    private TableColumn<Empleado, String> colDireccionEmpleado;

    @FXML
    private TableColumn<Empleado, String> colEmpleado;

    @FXML
    private TableColumn<Empleado, String> colNombreEmpleado;

    @FXML
    private TableColumn<Empleado, String> colTelefonoEmpleado;

    @FXML
    private TextField txtDescuento;

    @FXML
    private TextField txtNombreEmpleado;

    @FXML
    private TextField txtIDEmpleado;

    @FXML
    private TextField txtDireccionEmpleado;

    @FXML
    private TextField txtApellidosEmpleado;

    @FXML
    private TextField txtCargoEmpleado;

    @FXML
    private TextField txtTelefonoEmpleado;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtidCliente;

    @FXML
    private Button btnAgregarTransaccion;

    @FXML
    private TextField txtNumPrestamo;

    @FXML
    private TextField txtFechaPrestamo;

    @FXML
    private TextField txtFechaEntrega;

    @FXML
    private TextField txtClienteT;

    @FXML
    private TextField txtEmpleadoCedulaT;

    @FXML
    private TextField txtEmpleadoT;

    @FXML
    private TextField txtNombreObjetoT;

    @FXML
    private TextField txtCodigoObjetoT;

    @FXML
    void onAgregarT(ActionEvent event) {

    }

    @FXML
    private TableColumn<?, ?> colNombreObjetoT;

    @FXML
    private TableColumn<?, ?> colFechaPrestamoT;

    @FXML
    private TableColumn<?, ?> colClienteCedulaT;

    @FXML
    private TableColumn<?, ?> colFechaEntregaT;

    @FXML
    private TableColumn<?, ?> colEmpleadoTransaccionT;

    @FXML
    private TableColumn<?, ?> colClienteTransaccionT;

    @FXML
    private TableColumn<?, ?> colCodigoObjetoT;

    @FXML
    private TableColumn<?, ?> colEmpleadoCedulaT;

    @FXML
    private TableColumn<?, ?> colNumeroPrestamoT;





    private void obtenerClientes() {
        listaClientes.clear();
        listaClientes.addAll(tiendaController.obtenerClientes());
    }

    private void obtenerEmpleados() {
        listaEmpleados.clear();
        listaEmpleados.addAll(tiendaController.obtenerEmpleados());
    }

    private void obtenerProductos() {
        listaProductos.clear();
        listaProductos.addAll(tiendaController.obtenerProductos());
    }



    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }

    private void limpiarCamposClientes() {
        txtidCliente.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }

    private void limpiarCamposEmpleados() {
        txtIDEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtApellidosEmpleado.setText("");
        txtCargoEmpleado.setText("");
        txtTelefonoEmpleado.setText("");
        txtDireccionEmpleado.setText("");
    }

    private void limpiarCamposProductos() {
        txtIDProducto.setText("");
        txtNombreProducto.setText("");
        txtDescripcion.setText("");
        txtPrecioProducto.setText("");
        txtStock.setText("");
    }

    @FXML
    void onCrearProducto(ActionEvent event) {
        if(validarFormularioProducto()){
            Producto producto = construirDatosProducto();
            if(tiendaController.CrearProducto(producto)){
                obtenerProductos();
                mostrarMensaje("Notificación Producto", "Producto creado", "El Producto se ha creado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposProductos();
            }else{
                mostrarMensaje("Notificación Producto", "Producto no creado", "El Producto no se ha creado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Producto", "Producto no creado", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void onEliminarProducto(ActionEvent event) {
        if(validarFormularioProducto()){
            Producto producto = construirDatosProducto();
            if(tiendaController.eliminarProducto(producto)){
                obtenerProductos();
                mostrarMensaje("Notificación Producto", "Producto eliminado", "El Producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposProductos();
            }else{
                mostrarMensaje("Notificación Producto", "Producto no eliminado", "El Producto no se ha eliminado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Producto", "Producto no eliminado", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void onActualizarProducto(ActionEvent event) {
        if(validarFormularioProducto()){
            Producto producto = construirDatosProducto();
            if(tiendaController.actualizarProducto(producto)){
                obtenerProductos();
                mostrarMensaje("Notificación Producto", "Producto actualizado", "El Producto se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposProductos();
            }else{
                mostrarMensaje("Notificación Producto", "Producto no actualizado", "El Producto no se ha actualizado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Producto", "Producto no actualizado", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void onActualizarEmpleado(ActionEvent event) {
        if(validarFormularioEmpleado()){
            Empleado empleado = construirDatosEmpleado();
            if(tiendaController.actualizarEmpleado(empleado)){
                obtenerEmpleados();
                mostrarMensaje("Notificación Empleado", "Empleado actualizado", "El Empleado se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposEmpleados();
            }else{
                mostrarMensaje("Notificación Empleado", "Empleado no actualizado", "El Empleado no se ha actualizado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Empleado", "Empleado no actualizado", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void onCrearEmpleado(ActionEvent event) {
        if(validarFormularioEmpleado()){
            Empleado empleado = construirDatosEmpleado();
            if(tiendaController.CrearEmpleado(empleado)){
                obtenerEmpleados();
                mostrarMensaje("Notificación Empleado", "Empleado creado", "El Empleado se ha creado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposEmpleados();
            }else{
                mostrarMensaje("Notificación Empleado", "Empleado no creado", "El Empleado no se ha creado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Empleado", "Empleado no creado", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void OnEliminarEmpleado(ActionEvent event) {
        if(validarFormularioEmpleado()){
            Empleado empleado = construirDatosEmpleado();
            if(tiendaController.eliminarEmpleado(empleado)){
                obtenerEmpleados();
                mostrarMensaje("Notificación Empleado", "Empleado eliminado", "El Empleado se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposEmpleados();
            }else{
                mostrarMensaje("Notificación Empleado", "Empleado no eliminado", "El Empleado no se ha eliminado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Empleado", "Empleado no eliminado", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void onCrearCliente(ActionEvent event) {
        if(validarFormularioCliente()){
            Cliente cliente = construirDatosCliente();
            if(tiendaController.CrearCliente(cliente)){
                obtenerClientes();
                mostrarMensaje("Notificación Cliente", "Cliente creado", "El Cliente se ha creado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposClientes();
            }else{
                mostrarMensaje("Notificación Cliente", "Cliente no creado", "El Cliente no se ha creado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Cliente", "Cliente no creado", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
        }


    }

    @FXML
    void onActualizarCliente(ActionEvent event) {
        if(validarFormularioCliente()){
            Cliente cliente = construirDatosCliente();
            if(tiendaController.actualizarCliente(cliente)){
                obtenerClientes();
                mostrarMensaje("Notificación Cliente", "Cliente actualizado", "El cliente se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposClientes();
            }else{
                mostrarMensaje("Notificación Cliente", "Cliente no actualizado", "El cliente no se ha actualizado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Cliente", "Cliente no actualizado", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void onEliminarCliente(ActionEvent event) {
        if(validarFormularioCliente()){
            Cliente cliente = construirDatosCliente();
            if(tiendaController.eliminarCliente(cliente)){
                obtenerClientes();
                mostrarMensaje("Notificación Cliente", "Cliente eliminado", "El Cliente se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposClientes();
            }else{
                mostrarMensaje("Notificación Cliente", "Cliente no eliminado", "El Cliente no se ha eliminado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Cliente", "Cliente no eliminado", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
        }
    }
    private boolean validarFormularioCliente() {
        if(txtNombre.getText().isEmpty()
                || txtidCliente.getText().isEmpty()
                || txtApellidos.getText().isEmpty()
                || txtTelefono.getText().isEmpty()
                || txtDireccion.getText().isEmpty()){
            return false;
        }

        return true;
    }
    private boolean validarFormularioEmpleado() {
        if(txtNombreEmpleado.getText().isEmpty()
                || txtIDEmpleado.getText().isEmpty()
                || txtApellidosEmpleado.getText().isEmpty()
                || txtTelefonoEmpleado.getText().isEmpty()
                || txtCargoEmpleado.getText().isEmpty()
                || txtDireccionEmpleado.getText().isEmpty()){
            return false;
        }

        return true;
    }

    private boolean validarFormularioProducto() {
        if(txtNombreProducto.getText().isEmpty()
                || txtIDProducto.getText().isEmpty()
                || txtDescripcion.getText().isEmpty()
                || txtPrecioProducto.getText().isEmpty()
                || txtStock.getText().isEmpty()){
            return false;
        }

        return true;
    }




    @FXML
    void initialize() {
        tiendaController = new TiendaController();
        initTableCliente();
        initTableEmpleado();
        initTableProducto();

    }


    private Cliente construirDatosCliente() {
        return Cliente.builder()
                .idCliente(txtidCliente.getText())
                .nombre(txtNombre.getText())
                .apellidos(txtApellidos.getText())
                .direccion(txtDireccion.getText())
                .telefonoCliente(txtTelefono.getText())
                .build();

    }

    private Empleado construirDatosEmpleado() {
        return Empleado.builder()
                .IdEmpleado(txtIDEmpleado.getText())
                .nombreEmpleado(txtNombreEmpleado.getText())
                .apellidos(txtApellidosEmpleado.getText())
                .cargo(txtCargoEmpleado.getText())
                .telefono(txtTelefonoEmpleado.getText())
                .direccion(txtDireccionEmpleado.getText())
                .build();
    }

    private Producto construirDatosProducto() {
        return Producto.builder()
                .idProducto(txtIDProducto.getText())
                .nombreProducto(txtNombreProducto.getText())
                .descripcion(txtDescripcion.getText())
                .precio(txtPrecioProducto.getText())
                .stock((txtStock.getText()))
                .build();
    }

    private void initTableCliente() {

        initDataBindingCliente();
        obtenerClientes();
        TableCliente.getItems().clear();
        TableCliente.setItems(listaClientes);
        listenerSelectionCliente();

    }

    private void initTableEmpleado() {

        initDataBindingEmpleado();
        obtenerEmpleados();
        TableEmpleado.getItems().clear();
        TableEmpleado.setItems(listaEmpleados);
        listenerSelectionEmpleado();

    }

    private void initTableProducto() {

        initDataBindingProducto();
        obtenerProductos();
        TableProducto.getItems().clear();
        TableProducto.setItems(listaProductos);
        listenerSelectionProducto();

    }

    private void initDataBindingCliente() {
        colCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdCliente()));
        colNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        colApellidos.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellidos()));
        colTelefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefonoCliente()));
        colDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
    }

    private void initDataBindingEmpleado() {
        colEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdEmpleado()));
        colNombreEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombreEmpleado()));
        colApellidosEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellidos()));
        colCargoEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCargo()));
        colTelefonoEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));
        colDireccionEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
    }

    private void initDataBindingProducto() {
        colProducto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdProducto()));
        colNombreProducto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombreProducto()));
        colDescripcion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDescripcion()));
        colPrecio.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPrecio()));
        colStock.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getStock()));
    }

    private void listenerSelectionCliente() {
        TableCliente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            clienteSeleccionado = newSelection;
            mostrarInformacionCliente(clienteSeleccionado);
        });
    }

    private void listenerSelectionEmpleado() {
        TableEmpleado.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            empleadoSeleccionado = newSelection;
            mostrarInformacionEmpleado(empleadoSeleccionado);
        });
    }

    private void listenerSelectionProducto() {
        TableProducto.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            productoSeleccionado = newSelection;
            mostrarInformacionProducto(productoSeleccionado);
        });
    }

    private void mostrarInformacionCliente(Cliente clienteSeleccionado) {
        if(clienteSeleccionado != null){

            txtidCliente.setText(clienteSeleccionado.getIdCliente());
            txtNombre.setText(clienteSeleccionado.getNombre());
            txtApellidos.setText(clienteSeleccionado.getApellidos());
            txtTelefono.setText(String.valueOf(clienteSeleccionado.getTelefonoCliente()));
            txtDireccion.setText(clienteSeleccionado.getDireccion());


        }
    }

    private void mostrarInformacionEmpleado(Empleado empleadoSeleccionado) {
        if(empleadoSeleccionado != null){

            txtIDEmpleado.setText(empleadoSeleccionado.getIdEmpleado());
            txtNombreEmpleado.setText(empleadoSeleccionado.getNombreEmpleado());
            txtApellidosEmpleado.setText(empleadoSeleccionado.getApellidos());
            txtCargoEmpleado.setText(empleadoSeleccionado.getCargo());
            txtTelefonoEmpleado.setText(String.valueOf(empleadoSeleccionado.getTelefono()));
            txtDireccionEmpleado.setText(empleadoSeleccionado.getDireccion());


        }
    }

    private void mostrarInformacionProducto(Producto productoSeleccionado) {
        if(productoSeleccionado != null){

            txtIDProducto.setText(productoSeleccionado.getIdProducto());
            txtNombreProducto.setText(productoSeleccionado.getNombreProducto());
            txtDescripcion.setText(productoSeleccionado.getDescripcion());
            txtPrecioProducto.setText(productoSeleccionado.getPrecio());
            txtStock.setText((productoSeleccionado.getStock()));


        }
    }

    @FXML
    void onAplicarDescuento(ActionEvent event) {
        Cliente cliente = TableCliente.getSelectionModel().getSelectedItem();
        if (cliente != null) {
            try {
                double descuento = Double.parseDouble((txtDescuento.getText()));
                ClienteConDescuento clienteConDescuento = new ClienteConDescuentoBuilder()
                        .idCliente(cliente.getIdCliente())
                        .nombre(cliente.getNombre())
                        .apellidos(cliente.getApellidos())
                        .direccion(cliente.getDireccion())
                        .telefonoCliente(cliente.getTelefonoCliente())
                        .descuento(descuento)
                        .build();

                double precioBase = 100.0; // Ejemplo de precio base
                double precioConDescuento = clienteConDescuento.calcularPrecio(precioBase);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Precio con Descuento");
                alert.setHeaderText("Precio final con descuento");
                alert.setContentText("El precio con descuento es: " + precioConDescuento);
                alert.showAndWait();
            } catch (NumberFormatException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Descuento inválido");
                alert.setContentText("Por favor, ingrese un valor numérico válido para el descuento.");
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText("Ningún cliente seleccionado");
            alert.setContentText("Por favor, seleccione un cliente de la tabla.");
            alert.showAndWait();
        }
    }
    }


