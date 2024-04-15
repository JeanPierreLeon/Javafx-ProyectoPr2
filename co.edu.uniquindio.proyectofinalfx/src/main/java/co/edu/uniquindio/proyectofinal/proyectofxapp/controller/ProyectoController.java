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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ProyectoController {

    ModelFactory modelFactory;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Cliente> TableCliente;

    @FXML
    private TableView<Empleado> TableEmpleado;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private Button btnActualizarEmpleado;

    @FXML
    private Button btnCearCliente;

    @FXML
    private Button btnCrearEmpleado;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private TableColumn<Cliente, String> colApellidos;

    @FXML
    private TableColumn<Empleado, String> colApellidosEmpleado;

    @FXML
    private TableColumn<Empleado, String> colCargoEmpleado;

    @FXML
    private TableColumn<Cliente, String> colCliente;

    @FXML
    private TableColumn<Cliente, String> colDireccion;

    @FXML
    private TableColumn<Empleado, String> colDireccionEmpleado;

    @FXML
    private TableColumn<Empleado, String> colEmpleado;

    @FXML
    private TableColumn<Cliente, String> colNombre;

    @FXML
    private TableColumn<Empleado, String> colNombreEmpleado;

    @FXML
    private TableColumn<Cliente, String> colTelefono;

    @FXML
    private TableColumn<Empleado, String> colTelefonoEmpleado;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtApellidos1;

    @FXML
    private TextField txtCargo1;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtDireccion1;

    @FXML
    private TextField txtIDEmpleado1;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNombre1;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtTelefono1;

    @FXML
    private TextField txtidCliente;

    @FXML
    void onActualizarCliente(ActionEvent event) {
        modelFactory.actualizarCliente(txtidCliente.getText()
                ,txtNombre.getText()
                ,txtApellidos.getText()
                ,txtDireccion.getText()
                ,txtTelefono.getText());

        insertarDatos();
    }

    @FXML
    void onActualizarEmpleado(ActionEvent event) {

    }

    @FXML
    void onCrearCliente(ActionEvent event) {
        modelFactory.actualizarCliente(txtidCliente.getText()
                ,txtNombre.getText()
                ,txtApellidos.getText()
                ,txtDireccion.getText()
                ,txtTelefono.getText());

        insertarDatos();


    }

    @FXML
    void onCrearEmpleado(ActionEvent event) {

    }

    @FXML
    void onEliminarCliente(ActionEvent event) {
        modelFactory.eliminarClientes(txtTelefono.getText());

        insertarDatos();
    }

    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstance();

        // Configurar las celdas de las columnas para que muestren los valores de los atributos
        colCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdCliente()));
        colNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        colApellidos.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellidos()));
        colTelefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefonoCliente()));
        colDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));

        insertarDatos();
    }

    private void insertarDatos() {
        List<Cliente> ListaClientes = modelFactory.ObtenerDatosClientes();
        ObservableList<Cliente> ClientesObservableList = FXCollections.observableArrayList(ListaClientes);
        TableCliente.setItems(ClientesObservableList);
    }
}
