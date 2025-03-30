package co.edu.uniquindio.poo.dtorecord.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;



public class EstadisticasEquipoController {




        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnRegresar;

        @FXML
        private TableColumn<?, ?> colGolesAFavor;

        @FXML
        private TableColumn<?, ?> colGolesEnContra;

        @FXML
        private TableColumn<?, ?> colPartidosEmpatados;

        @FXML
        private TableColumn<?, ?> colPartidosGanados;

        @FXML
        private TableColumn<?, ?> colPartidosJugados;

        @FXML
        private TableColumn<?, ?> colPartidosPerdidos;

        @FXML
        private TableColumn<?, ?> colPuntos;

        @FXML
        private ComboBox<?> comboEquipos;

        @FXML
        private TableView<?> tablaEstadisticas;

        @FXML
        void volverAlMenu(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert btnRegresar != null : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";
            assert colGolesAFavor != null : "fx:id=\"colGolesAFavor\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";
            assert colGolesEnContra != null : "fx:id=\"colGolesEnContra\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";
            assert colPartidosEmpatados != null : "fx:id=\"colPartidosEmpatados\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";
            assert colPartidosGanados != null : "fx:id=\"colPartidosGanados\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";
            assert colPartidosJugados != null : "fx:id=\"colPartidosJugados\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";
            assert colPartidosPerdidos != null : "fx:id=\"colPartidosPerdidos\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";
            assert colPuntos != null : "fx:id=\"colPuntos\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";
            assert comboEquipos != null : "fx:id=\"comboEquipos\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";
            assert tablaEstadisticas != null : "fx:id=\"tablaEstadisticas\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";

        }

    }


