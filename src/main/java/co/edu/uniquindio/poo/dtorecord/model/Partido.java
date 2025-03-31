package co.edu.uniquindio.poo.dtorecord.model;

import java.time.LocalDate;

public record Partido(
        // Atributos de la clase Partido
int idPartido,
LocalDate fecha,
Equipo equipoLocal,
Equipo equipoVisitante,
int golesLocal,
int golesVisitante
) {
}
