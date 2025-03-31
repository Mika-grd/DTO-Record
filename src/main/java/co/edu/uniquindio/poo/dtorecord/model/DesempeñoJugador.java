package co.edu.uniquindio.poo.dtorecord.model;

public record DesempeñoJugador(
        int idJugador,
        String nombre,
        Equipo equipo,
        int partidosJugados,
        int goles,
        int asistencias,
        int minutosJugados,
        int tarjetasAmarillas,
        int tarjetasRojas,
        double calificacionPromedio
) {
    // Constructor que recibe un objeto Jugador
    public DesempeñoJugador(Jugador jugador) {
        this(
                jugador.getRjugador().idJugador(),
                jugador.getRjugador().nombre(),
                jugador.getEquipo(),
                jugador.getEquipo().getPartidosJugados(),
                jugador.getGoles(),
                jugador.getAsistencias(),
                jugador.getMinutosJugados(),
                jugador.getTarjetasAmarillas(),
                jugador.getTarjetasRojas(),
                jugador.getCalificacionPromedio()
        );
    }
}
