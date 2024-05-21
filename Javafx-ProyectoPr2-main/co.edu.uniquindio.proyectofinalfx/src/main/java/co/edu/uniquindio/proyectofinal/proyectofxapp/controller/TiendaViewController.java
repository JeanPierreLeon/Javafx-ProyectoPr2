package co.edu.uniquindio.proyectofinal.proyectofxapp.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyectofinal.proyectofxapp.factory.ModelFactory;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Cliente;
import co.edu.uniquindio.proyectofinal.proyectofxapp.model.Empleado;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TiendaViewController {
    TiendaController tiendaController;
    Empleado empleadoSeleccionado;
    ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList();
    Cliente clienteSeleccionado;
    ModelFactory modelFactory;
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
    private Button btnFiltrarApellidos;

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
    private TextField txtFiltrarApellidos;

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



    private void obtenerClientes() {
        listaClientes.clear();
        listaClientes.addAll(tiendaController.obtenerClientes());
    }

    private void obtenerEmpleados() {
        listaEmpleados.clear();
        listaEmpleados.addAll(tiendaController.obtenerEmpleados());
    }




    @FXML
    void onFiltrar(ActionEvent event) {

        // Agregar un ChangeListener al texto del campo de filtro
        txtFiltrar.textProperty().addListener((observable, oldValue, newValue) -> {
            // Llamar al método de filtrado cada vez que el texto cambie
            filtrarTabla(newValue);
        });
    }

    private void filtrarTabla(String filtro) {
        // Obtener la lista de clientes
        List<Cliente> clientesList = modelFactory.ObtenerDatosClientes();

        // Crear una lista observable a partir de la lista de clientes
        ObservableList<Cliente> clientesObservableList = FXCollections.observableArrayList(clientesList);

        // Crear un FilteredList y configurar el predicado del filtro
        FilteredList<Cliente> filteredData = new FilteredList<>(clientesObservableList, p -> true);

        // Configurar el predicado del filtro para buscar en cualquier parte de los datos
        filteredData.setPredicate(cliente -> {
            // Si el campo de filtro está vacío, mostrar todos los clientes
            if (filtro == null || filtro.isEmpty()) {
                return true;
            }

            // Convertir el texto del filtro a minúsculas para una búsqueda insensible a mayúsculas
            String lowerCaseFilter = filtro.toLowerCase();

            // Verificar si algún atributo del cliente contiene el texto del filtro
            if (cliente.getIdCliente().toLowerCase().contains(lowerCaseFilter) ||
                    cliente.getNombre().toLowerCase().contains(lowerCaseFilter) ||
                    cliente.getApellidos().toLowerCase().contains(lowerCaseFilter) ||
                    cliente.getDireccion().toLowerCase().contains(lowerCaseFilter) ||
                    cliente.getTelefonoCliente().toLowerCase().contains(lowerCaseFilter)) {
                return true; // El filtro coincide con algún atributo del cliente
            }
            return false; // No hay coincidencia
        });

        // Envolver el FilteredList en un SortedList
        SortedList<Cliente> sortedData = new SortedList<>(filteredData);

        // Vincular el comparador del SortedList al comparador de la TableView para el ordenamiento
        sortedData.comparatorProperty().bind(TableCliente.comparatorProperty());

        // Establecer los datos filtrados (y ordenados) en la tabla
        TableCliente.setItems(sortedData);

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

    @FXML
    void onActualizarEmpleado(ActionEvent event) {
        if(validarFormularioEmpleado()){
            Empleado empleado = construirDatosEmpleado();
            if(tiendaController.actualizarEmpleado(empleado)){
                obtenerEmpleados();
                mostrarMensaje("Notificación Cliente", "Cliente actualizada", "El cliente se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposEmpleados();
            }else{
                mostrarMensaje("Notificación Cliente", "Cliente no actualizada", "El cliente no se ha actualizado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Cliente", "Cliente no actualizada", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
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
                mostrarMensaje("Notificación Cliente", "Cliente actualizada", "El cliente se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposClientes();
            }else{
                mostrarMensaje("Notificación Cliente", "Cliente no actualizada", "El cliente no se ha actualizado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Cliente", "Cliente no actualizada", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
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




    @FXML
    void initialize() {
        tiendaController = new TiendaController();
        initTableCliente();
        initTableEmpleado();

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

}
