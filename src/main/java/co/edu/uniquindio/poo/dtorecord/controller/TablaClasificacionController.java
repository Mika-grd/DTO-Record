package co.edu.uniquindio.poo.dtorecord.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import javax.swing.table.TableColumn;
import java.net.URL;
import java.util.ResourceBundle;

public class TablaClasificacionController {

    
        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnRegresar;

        @FXML
        private TableColumn<?, ?> colNombreEquipo;

        @FXML
        private TableColumn<?, ?> colPuntos;

        @FXML
        private TableView<?> tablaClasificacion;

        @FXML
        void volverAlMenu(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert btnRegresar != null : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'TablaClasificacion.fxml'.";
            assert colNombreEquipo != null : "fx:id=\"colNombreEquipo\" was not injected: check your FXML file 'TablaClasificacion.fxml'.";
            assert colPuntos != null : "fx:id=\"colPuntos\" was not injected: check your FXML file 'TablaClasificacion.fxml'.";
            assert tablaClasificacion != null : "fx:id=\"tablaClasificacion\" was not injected: check your FXML file 'TablaClasificacion.fxml'.";

        }

    }


