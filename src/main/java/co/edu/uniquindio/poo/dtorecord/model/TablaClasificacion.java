package co.edu.uniquindio.poo.dtorecord.model;

import java.util.List;
import java.util.Comparator;

public class TablaClasificacion {
    private final List<DesempeñoEquipo> equipos;

    // Constructor que recibe la lista YA ORDENADA
    public TablaClasificacion(List<DesempeñoEquipo> equipos) {
        this.equipos = equipos;
    }

    // Getter
    public List<DesempeñoEquipo> getEquipos() {
        return equipos;
    }

    // Metodo para generar una TablaClasificacion desde una lista de Equipos
    public static TablaClasificacion fromEquipos(List<Equipo> equipos) {
        List<DesempeñoEquipo> listaOrdenada = equipos.stream()
                .map(DesempeñoEquipo::new)
                .sorted(Comparator.comparingInt(DesempeñoEquipo::puntos).reversed()) // Ordena de mayor a menor
                .toList();

        return new TablaClasificacion(listaOrdenada);
    }

    @Override
    public String toString() {
        return "TablaClasificacion{" + "equipos=" + equipos + '}';
    }
}