package co.edu.uniquindio.poo.dtorecord.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class EstadisticasJugadorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button actualizarBoton;

    @FXML
    private Button atrasBoton;

    @FXML
    private TableColumn<?, ?> colAmarillas;

    @FXML
    private TableColumn<?, ?> colAsistencias;

    @FXML
    private TableColumn<?, ?> colCalificacionPromedio;

    @FXML
    private TableColumn<?, ?> colGoles;

    @FXML
    private TableColumn<?, ?> colMinutosJugados;

    @FXML
    private TableColumn<?, ?> colRojas;

    @FXML
    private ComboBox<?> comboEquipo;

    @FXML
    private ComboBox<?> comboJugador;

    @FXML
    private TableView<?> tablaEstadisticas;

    @FXML
    void actualizarAccion(ActionEvent event) {

    }

    @FXML
    void atrasAccion(ActionEvent event) {
        // Obtener la ventana actual (Pantalla de estadisticas jugador) y cerrarla
        Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageActual.close();
    }

    @FXML
    void initialize() {
        assert actualizarBoton != null : "fx:id=\"actualizarBoton\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";
        assert atrasBoton != null : "fx:id=\"atrasBoton\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";
        assert colAmarillas != null : "fx:id=\"colAmarillas\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";
        assert colAsistencias != null : "fx:id=\"colAsistencias\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";
        assert colCalificacionPromedio != null : "fx:id=\"colCalificacionPromedio\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";
        assert colGoles != null : "fx:id=\"colGoles\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";
        assert colMinutosJugados != null : "fx:id=\"colMinutosJugados\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";
        assert colRojas != null : "fx:id=\"colRojas\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";
        assert comboEquipo != null : "fx:id=\"comboEquipo\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";
        assert comboJugador != null : "fx:id=\"comboJugador\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";
        assert tablaEstadisticas != null : "fx:id=\"tablaEstadisticas\" was not injected: check your FXML file 'EstadisticasJugador.fxml'.";

    }

}

