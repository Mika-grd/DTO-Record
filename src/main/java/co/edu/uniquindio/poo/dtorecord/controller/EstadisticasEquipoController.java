package co.edu.uniquindio.poo.dtorecord.controller;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.dtorecord.model.DesempeñoEquipo;
import co.edu.uniquindio.poo.dtorecord.model.Equipo;
import co.edu.uniquindio.poo.dtorecord.model.Grupo;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class EstadisticasEquipoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<DesempeñoEquipo, Number> colGolesAFavor;

    @FXML
    private TableColumn<DesempeñoEquipo, Number> colGolesEnContra;

    @FXML
    private TableColumn<DesempeñoEquipo, Number> colPartidosEmpatados;

    @FXML
    private TableColumn<DesempeñoEquipo, Number> colPartidosGanados;

    @FXML
    private TableColumn<DesempeñoEquipo, Number> colPartidosJugados;

    @FXML
    private TableColumn<DesempeñoEquipo, Number> colPartidosPerdidos;

    @FXML
    private TableColumn<DesempeñoEquipo, Number> colPuntos;
    @FXML
    private ComboBox<Equipo> comboEquipos;

    @FXML
    private TableView<DesempeñoEquipo> tablaEstadisticas;

    private ObservableList<Equipo> listaEquipos;

    private ObservableList<DesempeñoEquipo> listaEstadisticas;

    //Action para el boton de actualizar
    @FXML
    void actualizarTabla(ActionEvent event) {
        Equipo equipoSeleccionado = comboEquipos.getValue();
        if (equipoSeleccionado != null) {
            listaEstadisticas.setAll(new DesempeñoEquipo(equipoSeleccionado));
        }
    }

    //Action para el boton de regresar
    @FXML
    void volverAlMenu(ActionEvent event) {
        Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageActual.close();
    }

    // Inicializa los componentes de la vista
    @FXML
    void initialize() {
        assert btnActualizar != null : "fx:id=\"btnActualizar\" was not injected: check your FXML file 'EstadisticasEquipo.fxml'.";
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

        // Obtener la lista de equipos desde el singleton Grupo
        listaEquipos = FXCollections.observableArrayList(Grupo.getInstance().getListaEquipos());

        // Asignar la lista de equipos al ComboBox
        comboEquipos.setItems(listaEquipos);
        // Configurar cómo se muestra cada equipo en la lista desplegable
        comboEquipos.setCellFactory(lv -> new ListCell<Equipo>() {
            @Override
            protected void updateItem(Equipo equipo, boolean empty) {
                super.updateItem(equipo, empty);
                setText((equipo == null || empty) ? "" : equipo.getEquipo().nombre());
            }
        });

// Configurar cómo se muestra el equipo seleccionado en el ComboBox
        comboEquipos.setConverter(new StringConverter<Equipo>() {
            @Override
            public String toString(Equipo equipo) {
                return (equipo != null) ? equipo.getEquipo().nombre() : "";
            }

            @Override
            public Equipo fromString(String string) {
                return null; // No necesitas esta conversión en este caso
            }
        });

        // Inicializar la lista de estadísticas
        listaEstadisticas = FXCollections.observableArrayList();
        tablaEstadisticas.setItems(listaEstadisticas);

        // Configurar columnas de la tabla

        colPartidosJugados.setCellValueFactory(cellData ->
                new ReadOnlyObjectWrapper<>(cellData.getValue().partidosJugados())
        );
        colPartidosGanados.setCellValueFactory(cellData ->
                new ReadOnlyObjectWrapper<>(cellData.getValue().partidosGanados())
        );
        colPartidosEmpatados.setCellValueFactory(cellData ->
                new ReadOnlyObjectWrapper<>(cellData.getValue().partidosEmpatados())
        );
        colPartidosPerdidos.setCellValueFactory(cellData ->
                new ReadOnlyObjectWrapper<>(cellData.getValue().partidosPerdidos())
        );
        colGolesAFavor.setCellValueFactory(cellData ->
                new ReadOnlyObjectWrapper<>(cellData.getValue().golesAFavor())
        );
        colGolesEnContra.setCellValueFactory(cellData ->
                new ReadOnlyObjectWrapper<>(cellData.getValue().golesEnContra())
        );
        colPuntos.setCellValueFactory(cellData ->
                new ReadOnlyObjectWrapper<>(cellData.getValue().puntos())
        );
    }

    
}

