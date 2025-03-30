package co.edu.uniquindio.poo.dtorecord.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrincipalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button estadisticasEquiposBoton;

    @FXML
    private Button estadisticasJugadoresBoton;

    @FXML
    private Button tablaPosicionesBoton;

    @FXML
    void estadisticasEquiposAccion(ActionEvent event) {

    }

    @FXML
    void estadisticasJugadoresAccion(ActionEvent event) {

    }

    @FXML
    void tablaPosicionesAccion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert estadisticasEquiposBoton != null : "fx:id=\"estadisticasEquiposBoton\" was not injected: check your FXML file 'Principal.fxml'.";
        assert estadisticasJugadoresBoton != null : "fx:id=\"estadisticasJugadoresBoton\" was not injected: check your FXML file 'Principal.fxml'.";
        assert tablaPosicionesBoton != null : "fx:id=\"tablaPosicionesBoton\" was not injected: check your FXML file 'Principal.fxml'.";

    }

}
