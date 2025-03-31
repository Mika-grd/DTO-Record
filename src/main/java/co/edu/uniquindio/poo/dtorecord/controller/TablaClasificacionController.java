package co.edu.uniquindio.poo.dtorecord.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.dtorecord.model.Grupo;
import co.edu.uniquindio.poo.dtorecord.model.Equipo;
import co.edu.uniquindio.poo.dtorecord.model.TablaClasificacion;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class TablaClasificacionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<Integer, String> colNombreEquipo;

    @FXML
    private TableColumn<Integer, Integer> colPuntos;

    @FXML
    private TableView<Integer> tablaClasificacion;

    private TablaClasificacion tabla; // Se guarda la tabla para acceder a los datos

    @FXML
    void actualizarTabla(ActionEvent event) {
        // Obtener la lista de equipos
        List<Equipo> listaEquipos = Grupo.getInstance().getListaEquipos();

        if (listaEquipos != null && !listaEquipos.isEmpty()) {
            // Generar la tabla de clasificación
            tabla = TablaClasificacion.generarDesdeEquipos(listaEquipos);

            // Crear lista con índices (0, 1, 2...) para acceder a los valores
            ObservableList<Integer> indices = FXCollections.observableArrayList();
            for (int i = 0; i < tabla.getNombres().size(); i++) {
                indices.add(i);
            }

            // Refrescar la tabla en la UI
            tablaClasificacion.setItems(indices);
        }
    }

    @FXML
    void volverAlMenu(ActionEvent event) {
        Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageActual.close();
    }

    @FXML
    void initialize() {
        assert btnActualizar != null : "fx:id=\"btnActualizar\" was not injected: check your FXML file 'TablaClasificacion.fxml'.";
        assert btnRegresar != null : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'TablaClasificacion.fxml'.";
        assert colNombreEquipo != null : "fx:id=\"colNombreEquipo\" was not injected: check your FXML file 'TablaClasificacion.fxml'.";
        assert colPuntos != null : "fx:id=\"colPuntos\" was not injected: check your FXML file 'TablaClasificacion.fxml'.";
        assert tablaClasificacion != null : "fx:id=\"tablaClasificacion\" was not injected: check your FXML file 'TablaClasificacion.fxml'.";

        // Configurar las columnas para acceder a los valores de TablaClasificacion
        colNombreEquipo.setCellValueFactory(cellData ->
                new SimpleStringProperty(tabla.getNombres().get(cellData.getValue()))
        );
        colPuntos.setCellValueFactory(cellData ->
                new SimpleIntegerProperty(tabla.getPuntos().get(cellData.getValue())).asObject()
        );

        // Inicializar la tabla vacía
        tablaClasificacion.setItems(FXCollections.observableArrayList());
    }
}

