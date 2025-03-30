package co.edu.uniquindio.poo.dtorecord;

import co.edu.uniquindio.poo.dtorecord.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        //Creación de equipos:

        Grupo grupoA = Grupo.getInsance();
        LinkedList<Equipo> listaEquipos = grupoA.getListaEquipos();

        if (listaEquipos == null) {
            listaEquipos = new LinkedList<>();
        }

        Equipo barcelona = new Equipo(new REquipo(1, "FC Barcelona", "Joan Laporta"), "España",
                new LinkedList<>(), new LinkedList<>(), 0, 0, 0, 0, 0, 0, 0);

        Equipo realMadrid = new Equipo(new REquipo(2, "Real Madrid", "Florentino Pérez"), "España",
                new LinkedList<>(), new LinkedList<>(), 0, 0, 0, 0, 0, 0, 0);

        Equipo manCity = new Equipo(new REquipo(3, "Manchester City", "Sheikh Mansour"), "Inglaterra",
                new LinkedList<>(), new LinkedList<>(), 0, 0, 0, 0, 0, 0, 0);

        Equipo bayern = new Equipo(new REquipo(4, "Bayern Múnich", "Herbert Hainer"), "Alemania",
                new LinkedList<>(), new LinkedList<>(), 0, 0, 0, 0, 0, 0, 0);

        Equipo juventus = new Equipo(new REquipo(5, "Juventus", "John Elkann"), "Italia",
                new LinkedList<>(), new LinkedList<>(), 0, 0, 0, 0, 0, 0, 0);

        listaEquipos.add(barcelona);
        listaEquipos.add(realMadrid);
        listaEquipos.add(manCity);
        listaEquipos.add(bayern);
        listaEquipos.add(juventus);

        //Creacion Jugadores:


        // Jugadores del FC Barcelona
        Jugador messi = new Jugador(new RJugador(1, "Lionel", "Messi"), 36, "Delantero", barcelona, 20, 10, 1500, 2, 0, 8.9f);
        Jugador pedri = new Jugador(new RJugador(2, "Pedri", "González"), 21, "Mediocampista", barcelona, 5, 7, 1400, 3, 0, 7.5f);
        Jugador araujo = new Jugador(new RJugador(3, "Ronald", "Araújo"), 25, "Defensa", barcelona, 2, 1, 1600, 5, 0, 7.2f);
        Jugador terStegen = new Jugador(new RJugador(4, "Marc-André", "ter Stegen"), 32, "Portero", barcelona, 0, 0, 1800, 1, 0, 7.8f);
        Jugador deJong = new Jugador(new RJugador(5, "Frenkie", "de Jong"), 27, "Mediocampista", barcelona, 3, 4, 1500, 2, 0, 7.4f);

        barcelona.getListaJugadores().add(messi);
        barcelona.getListaJugadores().add(pedri);
        barcelona.getListaJugadores().add(araujo);
        barcelona.getListaJugadores().add(terStegen);
        barcelona.getListaJugadores().add(deJong);

// Jugadores del Real Madrid
        Jugador benzema = new Jugador(new RJugador(6, "Karim", "Benzema"), 35, "Delantero", realMadrid, 18, 8, 1450, 1, 0, 8.5f);
        Jugador modric = new Jugador(new RJugador(7, "Luka", "Modric"), 38, "Mediocampista", realMadrid, 4, 10, 1600, 2, 0, 7.8f);
        Jugador vinicius = new Jugador(new RJugador(8, "Vinícius", "Júnior"), 24, "Delantero", realMadrid, 12, 5, 1550, 4, 0, 8.0f);
        Jugador courtois = new Jugador(new RJugador(9, "Thibaut", "Courtois"), 32, "Portero", realMadrid, 0, 0, 1800, 0, 0, 8.1f);
        Jugador alaba = new Jugador(new RJugador(10, "David", "Alaba"), 31, "Defensa", realMadrid, 2, 3, 1700, 3, 0, 7.6f);

        realMadrid.getListaJugadores().add(benzema);
        realMadrid.getListaJugadores().add(modric);
        realMadrid.getListaJugadores().add(vinicius);
        realMadrid.getListaJugadores().add(courtois);
        realMadrid.getListaJugadores().add(alaba);

// Jugadores del Manchester City
        Jugador haaland = new Jugador(new RJugador(11, "Erling", "Haaland"), 23, "Delantero", manCity, 22, 6, 1600, 3, 0, 9.0f);
        Jugador deBruyne = new Jugador(new RJugador(12, "Kevin", "De Bruyne"), 32, "Mediocampista", manCity, 6, 14, 1550, 2, 0, 8.7f);
        Jugador foden = new Jugador(new RJugador(13, "Phil", "Foden"), 24, "Mediocampista", manCity, 10, 8, 1500, 3, 0, 8.3f);
        Jugador ederson = new Jugador(new RJugador(14, "Ederson", "Moraes"), 31, "Portero", manCity, 0, 0, 1800, 1, 0, 7.9f);
        Jugador dias = new Jugador(new RJugador(15, "Rúben", "Dias"), 27, "Defensa", manCity, 2, 2, 1700, 4, 0, 7.5f);

        manCity.getListaJugadores().add(haaland);
        manCity.getListaJugadores().add(deBruyne);
        manCity.getListaJugadores().add(foden);
        manCity.getListaJugadores().add(ederson);
        manCity.getListaJugadores().add(dias);

// Jugadores del Bayern Múnich
        Jugador muller = new Jugador(new RJugador(16, "Thomas", "Müller"), 34, "Mediocampista", bayern, 7, 10, 1600, 2, 0, 8.0f);
        Jugador kimmich = new Jugador(new RJugador(17, "Joshua", "Kimmich"), 29, "Mediocampista", bayern, 5, 9, 1550, 2, 0, 7.9f);
        Jugador sane = new Jugador(new RJugador(18, "Leroy", "Sané"), 28, "Delantero", bayern, 13, 6, 1500, 3, 0, 8.2f);
        Jugador neuer = new Jugador(new RJugador(19, "Manuel", "Neuer"), 38, "Portero", bayern, 0, 0, 1800, 1, 0, 8.3f);
        Jugador upamecano = new Jugador(new RJugador(20, "Dayot", "Upamecano"), 25, "Defensa", bayern, 1, 1, 1700, 4, 0, 7.4f);

        bayern.getListaJugadores().add(muller);
        bayern.getListaJugadores().add(kimmich);
        bayern.getListaJugadores().add(sane);
        bayern.getListaJugadores().add(neuer);
        bayern.getListaJugadores().add(upamecano);

// Jugadores de la Juventus
        Jugador vlahovic = new Jugador(new RJugador(21, "Dusan", "Vlahovic"), 24, "Delantero", juventus, 15, 5, 1600, 2, 0, 8.4f);
        Jugador chiesa = new Jugador(new RJugador(22, "Federico", "Chiesa"), 26, "Mediocampista", juventus, 8, 7, 1500, 3, 0, 7.8f);
        Jugador pogba = new Jugador(new RJugador(23, "Paul", "Pogba"), 31, "Mediocampista", juventus, 4, 6, 1550, 2, 0, 7.5f);
        Jugador szczesny = new Jugador(new RJugador(24, "Wojciech", "Szczęsny"), 34, "Portero", juventus, 0, 0, 1800, 1, 0, 8.0f);
        Jugador bonucci = new Jugador(new RJugador(25, "Leonardo", "Bonucci"), 36, "Defensa", juventus, 2, 2, 1700, 4, 0, 7.6f);

        juventus.getListaJugadores().add(vlahovic);
        juventus.getListaJugadores().add(chiesa);
        juventus.getListaJugadores().add(pogba);
        juventus.getListaJugadores().add(szczesny);
        juventus.getListaJugadores().add(bonucci);



        //Creacion de los partidos:


        // Partido 1: Barcelona vs Real Madrid
        Partido partido1 = new Partido(1, LocalDate.of(2024, 3, 1), barcelona, realMadrid, 2, 3);
        barcelona.getListaPartidos().add(partido1);
        realMadrid.getListaPartidos().add(partido1);
        barcelona.registrarPartido(2, 3);
        realMadrid.registrarPartido(3, 2);

// Partido 2: Barcelona vs Manchester City
        Partido partido2 = new Partido(2, LocalDate.of(2024, 3, 5), barcelona, manCity, 1, 1);
        barcelona.getListaPartidos().add(partido2);
        manCity.getListaPartidos().add(partido2);
        barcelona.registrarPartido(1, 1);
        manCity.registrarPartido(1, 1);

// Partido 3: Barcelona vs Bayern Múnich
        Partido partido3 = new Partido(3, LocalDate.of(2024, 3, 10), barcelona, bayern, 3, 2);
        barcelona.getListaPartidos().add(partido3);
        bayern.getListaPartidos().add(partido3);
        barcelona.registrarPartido(3, 2);
        bayern.registrarPartido(2, 3);

// Partido 4: Barcelona vs Juventus
        Partido partido4 = new Partido(4, LocalDate.of(2024, 3, 15), barcelona, juventus, 2, 0);
        barcelona.getListaPartidos().add(partido4);
        juventus.getListaPartidos().add(partido4);
        barcelona.registrarPartido(2, 0);
        juventus.registrarPartido(0, 2);

// Partido 5: Real Madrid vs Manchester City
        Partido partido5 = new Partido(5, LocalDate.of(2024, 3, 2), realMadrid, manCity, 3, 1);
        realMadrid.getListaPartidos().add(partido5);
        manCity.getListaPartidos().add(partido5);
        realMadrid.registrarPartido(3, 1);
        manCity.registrarPartido(1, 3);

// Partido 6: Real Madrid vs Bayern Múnich
        Partido partido6 = new Partido(6, LocalDate.of(2024, 3, 7), realMadrid, bayern, 2, 2);
        realMadrid.getListaPartidos().add(partido6);
        bayern.getListaPartidos().add(partido6);
        realMadrid.registrarPartido(2, 2);
        bayern.registrarPartido(2, 2);

// Partido 7: Real Madrid vs Juventus
        Partido partido7 = new Partido(7, LocalDate.of(2024, 3, 12), realMadrid, juventus, 4, 1);
        realMadrid.getListaPartidos().add(partido7);
        juventus.getListaPartidos().add(partido7);
        realMadrid.registrarPartido(4, 1);
        juventus.registrarPartido(1, 4);

// Partido 8: Manchester City vs Bayern Múnich
        Partido partido8 = new Partido(8, LocalDate.of(2024, 3, 3), manCity, bayern, 2, 2);
        manCity.getListaPartidos().add(partido8);
        bayern.getListaPartidos().add(partido8);
        manCity.registrarPartido(2, 2);
        bayern.registrarPartido(2, 2);

// Partido 9: Manchester City vs Juventus
        Partido partido9 = new Partido(9, LocalDate.of(2024, 3, 8), manCity, juventus, 3, 0);
        manCity.getListaPartidos().add(partido9);
        juventus.getListaPartidos().add(partido9);
        manCity.registrarPartido(3, 0);
        juventus.registrarPartido(0, 3);

// Partido 10: Bayern Múnich vs Juventus
        Partido partido10 = new Partido(10, LocalDate.of(2024, 3, 4), bayern, juventus, 1, 1);
        bayern.getListaPartidos().add(partido10);
        juventus.getListaPartidos().add(partido10);
        bayern.registrarPartido(1, 1);
        juventus.registrarPartido(1, 1);

// Partido 11: Barcelona vs Real Madrid (Vuelta)
        Partido partido11 = new Partido(11, LocalDate.of(2024, 4, 1), realMadrid, barcelona, 1, 2);
        barcelona.getListaPartidos().add(partido11);
        realMadrid.getListaPartidos().add(partido11);
        barcelona.registrarPartido(2, 1);
        realMadrid.registrarPartido(1, 2);

// Partido 12: Barcelona vs Manchester City (Vuelta)
        Partido partido12 = new Partido(12, LocalDate.of(2024, 4, 5), manCity, barcelona, 2, 2);
        barcelona.getListaPartidos().add(partido12);
        manCity.getListaPartidos().add(partido12);
        barcelona.registrarPartido(2, 2);
        manCity.registrarPartido(2, 2);

// Partido 13: Barcelona vs Bayern Múnich (Vuelta)
        Partido partido13 = new Partido(13, LocalDate.of(2024, 4, 10), bayern, barcelona, 1, 3);
        barcelona.getListaPartidos().add(partido13);
        bayern.getListaPartidos().add(partido13);
        barcelona.registrarPartido(3, 1);
        bayern.registrarPartido(1, 3);

// Partido 14: Barcelona vs Juventus (Vuelta)
        Partido partido14 = new Partido(14, LocalDate.of(2024, 4, 15), juventus, barcelona, 0, 2);
        barcelona.getListaPartidos().add(partido14);
        juventus.getListaPartidos().add(partido14);
        barcelona.registrarPartido(2, 0);
        juventus.registrarPartido(0, 2);

// Partido 15: Real Madrid vs Manchester City (Vuelta)
        Partido partido15 = new Partido(15, LocalDate.of(2024, 4, 2), manCity, realMadrid, 1, 3);
        realMadrid.getListaPartidos().add(partido15);
        manCity.getListaPartidos().add(partido15);
        realMadrid.registrarPartido(3, 1);
        manCity.registrarPartido(1, 3);

// Partido 16: Real Madrid vs Bayern Múnich (Vuelta)
        Partido partido16 = new Partido(16, LocalDate.of(2024, 4, 7), bayern, realMadrid, 2, 2);
        realMadrid.getListaPartidos().add(partido16);
        bayern.getListaPartidos().add(partido16);
        realMadrid.registrarPartido(2, 2);
        bayern.registrarPartido(2, 2);

// Partido 17: Real Madrid vs Juventus (Vuelta)
        Partido partido17 = new Partido(17, LocalDate.of(2024, 4, 12), juventus, realMadrid, 1, 4);
        realMadrid.getListaPartidos().add(partido17);
        juventus.getListaPartidos().add(partido17);
        realMadrid.registrarPartido(4, 1);
        juventus.registrarPartido(1, 4);

// Partido 18: Manchester City vs Bayern Múnich (Vuelta)
        Partido partido18 = new Partido(18, LocalDate.of(2024, 4, 3), bayern, manCity, 1, 1);
        manCity.getListaPartidos().add(partido18);
        bayern.getListaPartidos().add(partido18);
        manCity.registrarPartido(1, 1);
        bayern.registrarPartido(1, 1);

// Partido 19: Manchester City vs Juventus (Vuelta)
        Partido partido19 = new Partido(19, LocalDate.of(2024, 4, 8), juventus, manCity, 0, 3);
        manCity.getListaPartidos().add(partido19);
        juventus.getListaPartidos().add(partido19);
        manCity.registrarPartido(3, 0);
        juventus.registrarPartido(0, 3);

// Partido 20: Bayern Múnich vs Juventus (Vuelta)
        Partido partido20 = new Partido(20, LocalDate.of(2024, 4, 4), juventus, bayern, 1, 1);
        bayern.getListaPartidos().add(partido20);
        juventus.getListaPartidos().add(partido20);
        bayern.registrarPartido(1, 1);
        juventus.registrarPartido(1, 1);


        launch();

    }
}