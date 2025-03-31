package co.edu.uniquindio.poo.dtorecord.model;

import java.util.LinkedList;

public class Equipo {
    // Atributos
    REquipo equipo;
    String pais;
    LinkedList<Jugador> listaJugadores;
    LinkedList<Partido> listaPartidos;

    // Estadísticas para DTO
    int partidosJugados;
    int partidosGanados;
    int partidosEmpatados;
    int partidosPerdidos;
    int golesAFavor;
    int golesEnContra;
    int puntos;

    // Metodo para registrar un partido jugado y actualizar estadísticas
    public void registrarPartido(int golesAnotados, int golesRecibidos) {
        this.partidosJugados++;
        this.golesAFavor += golesAnotados;
        this.golesEnContra += golesRecibidos;

        if (golesAnotados > golesRecibidos) {
            this.partidosGanados++;
            this.puntos += 3;  // Victoria suma 3 puntos
        } else if (golesAnotados == golesRecibidos) {
            this.partidosEmpatados++;
            this.puntos += 1;  // Empate suma 1 punto
        } else {
            this.partidosPerdidos++;
        }
    }

    // Constructor
    public Equipo(REquipo equipo, String pais, LinkedList<Jugador> listaJugadores, LinkedList<Partido> listaPartidos, int partidosJugados, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int golesAFavor, int golesEnContra, int puntos) {
        this.equipo = equipo;
        this.pais = pais;
        this.listaJugadores = listaJugadores;
        this.listaPartidos = listaPartidos;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
        this.puntos = puntos;
    }

    // Getters y Setters
    public REquipo getEquipo() {
        return equipo;
    }


    public void setEquipo(REquipo equipo) {
        this.equipo = equipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LinkedList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(LinkedList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public LinkedList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(LinkedList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    // Metodo toString para mostrar información del equipo
    @Override
    public String toString() {
        return "Equipo{" +
                "equipo=" + equipo +
                ", pais='" + pais + '\'' +
                ", listaJugadores=" + (listaJugadores != null ? listaJugadores.size() + " jugadores" : "N/A") +
                ", listaPartidos=" + (listaPartidos != null ? listaPartidos.size() + " partidos" : "N/A") +
                ", partidosJugados=" + partidosJugados +
                ", partidosGanados=" + partidosGanados +
                ", partidosEmpatados=" + partidosEmpatados +
                ", partidosPerdidos=" + partidosPerdidos +
                ", golesAFavor=" + golesAFavor +
                ", golesEnContra=" + golesEnContra +
                ", puntos=" + puntos +
                '}';
    }
}
