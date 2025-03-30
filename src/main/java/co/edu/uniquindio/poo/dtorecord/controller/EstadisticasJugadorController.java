package co.edu.uniquindio.poo.dtorecord.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.dtorecord.model.DesempeñoJugador;
import co.edu.uniquindio.poo.dtorecord.model.Equipo;
import co.edu.uniquindio.poo.dtorecord.model.Grupo;
import co.edu.uniquindio.poo.dtorecord.model.Jugador;
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
    private TableColumn<DesempeñoJugador, Integer> colAmarillas;

    @FXML
    private TableColumn<DesempeñoJugador, Integer> colAsistencias;

    @FXML
    private TableColumn<DesempeñoJugador, Integer> colCalificacionPromedio;

    @FXML
    private TableColumn<DesempeñoJugador, Integer> colGoles;

    @FXML
    private TableColumn<DesempeñoJugador, Integer> colMinutosJugados;

    @FXML
    private TableColumn<DesempeñoJugador, Integer> colRojas;

    @FXML
    private ComboBox<Equipo> comboEquipo;

    @FXML
    private ComboBox<Jugador> comboJugador;

    @FXML
    private TableView<DesempeñoJugador> tablaEstadisticas;

    private ObservableList<Equipo> listaEquipos;
    private ObservableList<Jugador> listaJugadores;
    private ObservableList<DesempeñoJugador> listaEstadisticas;

    @FXML
    void actualizarAccion(ActionEvent event) {
        Jugador jugadorSeleccionado = comboJugador.getValue();
        if (jugadorSeleccionado != null) {
            listaEstadisticas.setAll(new DesempeñoJugador(jugadorSeleccionado));
        }
    }

    @FXML
    void atrasAccion(ActionEvent event) {
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

        // Inicializar listas
        listaEquipos = FXCollections.observableArrayList(Grupo.getInstance().getListaEquipos());
        listaJugadores = FXCollections.observableArrayList();
        listaEstadisticas = FXCollections.observableArrayList();

        // Cargar equipos en el ComboBox
        comboEquipo.setItems(listaEquipos);

        // Configurar cambio de equipo para actualizar jugadores
        comboEquipo.setOnAction(e -> cargarJugadores());

        // Configurar columnas de la tabla
        colGoles.setCellValueFactory(new PropertyValueFactory<>("goles"));
        colAsistencias.setCellValueFactory(new PropertyValueFactory<>("asistencias"));
        colMinutosJugados.setCellValueFactory(new PropertyValueFactory<>("minutosJugados"));
        colAmarillas.setCellValueFactory(new PropertyValueFactory<>("tarjetasAmarillas"));
        colRojas.setCellValueFactory(new PropertyValueFactory<>("tarjetasRojas"));
        colCalificacionPromedio.setCellValueFactory(new PropertyValueFactory<>("calificacionPromedio"));

        // Asignar lista vacía a la tabla
        tablaEstadisticas.setItems(listaEstadisticas);
    }

    private void cargarJugadores() {
        Equipo equipoSeleccionado = comboEquipo.getValue();
        if (equipoSeleccionado != null) {
            listaJugadores.setAll(equipoSeleccionado.getListaJugadores());
            comboJugador.setItems(listaJugadores);
        }
    }
}


