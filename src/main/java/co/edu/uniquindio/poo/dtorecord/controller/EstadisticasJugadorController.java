package co.edu.uniquindio.poo.dtorecord.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.dtorecord.model.DesempeñoJugador;
import co.edu.uniquindio.poo.dtorecord.model.Equipo;
import co.edu.uniquindio.poo.dtorecord.model.Grupo;
import co.edu.uniquindio.poo.dtorecord.model.Jugador;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
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
    private TableColumn<DesempeñoJugador, Double> colCalificacionPromedio;

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

    //Actualiza la tabla de estadísticas del jugador seleccionado
    @FXML
    void actualizarAccion(ActionEvent event) {
        Jugador jugadorSeleccionado = comboJugador.getValue();
        if (jugadorSeleccionado != null) {
            listaEstadisticas.setAll(new DesempeñoJugador(jugadorSeleccionado));
        }
    }

    //Cierra la ventana actual
    @FXML
    void atrasAccion(ActionEvent event) {
        Stage stageActual = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageActual.close();
    }

    // Inicializa los componentes de la vista
    @FXML
    void initialize() {
        // Inicializar listas
        listaEquipos = FXCollections.observableArrayList(Grupo.getInstance().getListaEquipos());
        listaJugadores = FXCollections.observableArrayList();
        listaEstadisticas = FXCollections.observableArrayList();

        // Configurar ComboBox de Equipos
        comboEquipo.setItems(listaEquipos);
        comboEquipo.setOnAction(e -> cargarJugadores());

        // Configurar cómo se muestra en el ComboBox
        comboEquipo.setConverter(new javafx.util.StringConverter<>() {
            @Override
            public String toString(Equipo equipo) {
                return equipo != null ? equipo.getEquipo().nombre() : "";
            }

            @Override
            public Equipo fromString(String string) {
                return null;
            }
        });

        comboJugador.setConverter(new javafx.util.StringConverter<>() {
            @Override
            public String toString(Jugador jugador) {
                return jugador != null ? jugador.getRjugador().nombre() : "";
            }

            @Override
            public Jugador fromString(String string) {
                return null;
            }
        });

        // Configurar columnas de la tabla
        colGoles.setCellValueFactory(cellData ->
                new SimpleIntegerProperty(cellData.getValue().goles()).asObject());

        colAsistencias.setCellValueFactory(cellData ->
                new SimpleIntegerProperty(cellData.getValue().asistencias()).asObject());

        colMinutosJugados.setCellValueFactory(cellData ->
                new SimpleIntegerProperty(cellData.getValue().minutosJugados()).asObject());

        colAmarillas.setCellValueFactory(cellData ->
                new SimpleIntegerProperty(cellData.getValue().tarjetasAmarillas()).asObject());

        colRojas.setCellValueFactory(cellData ->
                new SimpleIntegerProperty(cellData.getValue().tarjetasRojas()).asObject());

        colCalificacionPromedio.setCellValueFactory(cellData ->
                new SimpleDoubleProperty(cellData.getValue().calificacionPromedio()).asObject());


        // Asignar lista vacía a la tabla
        tablaEstadisticas.setItems(listaEstadisticas);
    }

    //cargar los jugadores para que se vean en las combo box
    private void cargarJugadores() {
        Equipo equipoSeleccionado = comboEquipo.getValue();
        if (equipoSeleccionado != null) {
            listaJugadores.setAll(equipoSeleccionado.getListaJugadores());
            comboJugador.setItems(listaJugadores);
        } else {
            listaJugadores.clear();
        }
    }
}
