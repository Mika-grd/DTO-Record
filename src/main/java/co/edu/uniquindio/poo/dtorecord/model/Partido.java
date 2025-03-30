package co.edu.uniquindio.poo.dtorecord.model;

import java.time.LocalDate;

public record Partido(
int idPartido,
LocalDate fecha,
Equipo idEquipoLocal,
Equipo idEquipoVisitante,
int golesLocal,
int golesVisitante
) {
}
