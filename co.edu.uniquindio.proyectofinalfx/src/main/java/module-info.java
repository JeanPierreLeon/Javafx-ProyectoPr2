module co.edu.uniquindio.proyectofinal.proyectofxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.proyectofinal.proyectofxapp to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal.proyectofxapp;


    exports co.edu.uniquindio.proyectofinal.proyectofxapp.controller;
    opens co.edu.uniquindio.proyectofinal.proyectofxapp.controller;
}