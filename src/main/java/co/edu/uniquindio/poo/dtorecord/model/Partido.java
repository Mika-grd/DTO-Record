package co.edu.uniquindio.poo.dtorecord.model;

import java.time.LocalDate;

public record Partido(
int idPartido,
LocalDate fecha,
Equipo equipoLocal,
Equipo equipoVisitante,
int golesLocal,
int golesVisitante
) {
}
