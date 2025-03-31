package co.edu.uniquindio.poo.dtorecord.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class TablaClasificacion {
    // Atributos de la clase TablaClasificacion
    private final List<String> nombres;
    private final List<Integer> puntos;

    // Constructor de la clase TablaClasificacion
    public TablaClasificacion(List<String> nombres, List<Integer> puntos) {
        this.nombres = nombres;
        this.puntos = puntos;
    }

    // Getters
    public List<String> getNombres() {
        return nombres;
    }

    public List<Integer> getPuntos() {
        return puntos;
    }

    //ToString
    @Override
    public String toString() {
        return "TablaClasificacion{" +
                "nombres=" + nombres +
                ", puntos=" + puntos + '}';
    }

    // Metodo para generar la tabla desde una lista de equipos
    public static TablaClasificacion generarDesdeEquipos(List<Equipo> listaEquipos) {
        if (listaEquipos == null || listaEquipos.isEmpty()) {
            throw new IllegalArgumentException("La lista de equipos no puede ser nula o vacía");
        }

        List<Equipo> equiposOrdenados = new ArrayList<>(listaEquipos);

        // Ordenar por puntos (descendente)
        equiposOrdenados.sort(Comparator.comparingInt(Equipo::getPuntos).reversed());

        // Extraer nombres y puntos en listas separadas
        List<String> nombres = new ArrayList<>();
        List<Integer> puntos = new ArrayList<>();

        equiposOrdenados.forEach(equipo -> {
            if (equipo.getEquipo() != null && equipo.getEquipo().nombre() != null) {
                nombres.add(equipo.getEquipo().nombre());
            } else {
                nombres.add("Desconocido");
            }
            puntos.add(equipo.getPuntos());
        });

        return new TablaClasificacion(nombres, puntos);
    }
}