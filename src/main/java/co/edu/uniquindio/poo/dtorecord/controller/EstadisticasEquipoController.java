package co.edu.uniquindio.poo.dtorecord.controller;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.dtorecord.model.DesempeñoEquipo;
import co.edu.uniquindio.poo.dtorecord.model.Equipo;
import co.edu.uniquindio.poo.dtorecord.model.Grupo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

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
    private TableColumn<DesempeñoEquipo, Integer> colGolesAFavor;

    @FXML
    private TableColumn<DesempeñoEquipo, Integer> colGolesEnContra;

    @FXML
    private TableColumn<DesempeñoEquipo, Integer> colPartidosEmpatados;

    @FXML
    private TableColumn<DesempeñoEquipo, Integer> colPartidosGanados;

    @FXML
    private TableColumn<DesempeñoEquipo, Integer> colPartidosJugados;

    @FXML
    private TableColumn<DesempeñoEquipo, Integer> colPartidosPerdidos;

    @FXML
    private TableColumn<DesempeñoEquipo, Integer> colPuntos;

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

        

        comboEquipos.setItems(listaEquipos);

        colPartidosJugados.setCellValueFactory(new PropertyValueFactory<>("partidosJugados"));
        colPartidosGanados.setCellValueFactory(new PropertyValueFactory<>("partidosGanados"));
        colPartidosEmpatados.setCellValueFactory(new PropertyValueFactory<>("partidosEmpatados"));
        colPartidosPerdidos.setCellValueFactory(new PropertyValueFactory<>("partidosPerdidos"));
        colGolesAFavor.setCellValueFactory(new PropertyValueFactory<>("golesAFavor"));
        colGolesEnContra.setCellValueFactory(new PropertyValueFactory<>("golesEnContra"));
        colPuntos.setCellValueFactory(new PropertyValueFactory<>("puntos"));

        listaEstadisticas = FXCollections.observableArrayList();
        tablaEstadisticas.setItems(listaEstadisticas);
    }

    
}

