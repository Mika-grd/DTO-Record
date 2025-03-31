package co.edu.uniquindio.poo.dtorecord.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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

    // Accion del boton de estadisticas de equipos
    @FXML
    void estadisticasEquiposAccion(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/dtorecord/EstadisticasEquipo.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Estadisticas de Equipos");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Accion del boton de estadisticas de jugadores
    @FXML
    void estadisticasJugadoresAccion(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/dtorecord/EstadisticasJugador.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Estadisticas de Jugadores");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Accion del boton de tabla de posiciones
    @FXML
    void tablaPosicionesAccion(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/dtorecord/TablaClasificacion.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Tabla de Clasificacion");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Inicializador
    @FXML
    void initialize() {
        assert estadisticasEquiposBoton != null : "fx:id=\"estadisticasEquiposBoton\" was not injected: check your FXML file 'Principal.fxml'.";
        assert estadisticasJugadoresBoton != null : "fx:id=\"estadisticasJugadoresBoton\" was not injected: check your FXML file 'Principal.fxml'.";
        assert tablaPosicionesBoton != null : "fx:id=\"tablaPosicionesBoton\" was not injected: check your FXML file 'Principal.fxml'.";

    }

}
