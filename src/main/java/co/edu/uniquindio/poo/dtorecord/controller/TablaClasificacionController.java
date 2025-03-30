package co.edu.uniquindio.poo.dtorecord.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.dtorecord.HelloApplication;
import co.edu.uniquindio.poo.dtorecord.model.Grupo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import co.edu.uniquindio.poo.dtorecord.model.Equipo;
import co.edu.uniquindio.poo.dtorecord.model.TablaClasificacion;
import co.edu.uniquindio.poo.dtorecord.model.DesempeñoEquipo;
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
    private TableColumn<DesempeñoEquipo, String> colNombreEquipo;

    @FXML
    private TableColumn<DesempeñoEquipo, Integer> colPuntos;

    @FXML
    private TableView<DesempeñoEquipo> tablaClasificacion;

    private ObservableList<DesempeñoEquipo> listaEquipos;

    @FXML
    void actualizarTabla(ActionEvent event) {
        // Obtener la lista de equipos
        List<Equipo> listaEquipos = Grupo.getInstance().getListaEquipos(); // Ajusta según cómo obtienes los equipos

        if (listaEquipos != null && !listaEquipos.isEmpty()) {
            // Generar la tabla de clasificación
            TablaClasificacion tabla = TablaClasificacion.fromEquipos(listaEquipos);

            // Refrescar la tabla en la UI
            tablaClasificacion.setItems(FXCollections.observableArrayList(tabla.getEquipos()));
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

        colNombreEquipo.setCellValueFactory(new PropertyValueFactory<>("nombreEquipo"));
        colPuntos.setCellValueFactory(new PropertyValueFactory<>("puntos"));

        listaEquipos = FXCollections.observableArrayList();
        tablaClasificacion.setItems(listaEquipos);
    }
}
