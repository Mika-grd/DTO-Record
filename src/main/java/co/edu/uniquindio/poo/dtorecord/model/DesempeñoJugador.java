package co.edu.uniquindio.poo.dtorecord.model;

record DesempeñoJugador(
        int idJugador,
        String nombre,
        Equipo equipo,
        int partidosJugados,
        int goles,
        int asistencias,
        int minutosJugados,
        int tarjetasAmarillas,
        int tarjetasRojas
) {
    public DesempeñoJugador(Jugador jugador, Equipo equipo) {
        this(
                jugador.getRjugador().idJugador(),
                jugador.getRjugador().nombre(),
                jugador.getEquipo(),
                jugador.getEquipo().getPartidosJugados(),
                jugador.getGoles(),
                jugador.getAsistencias(),
                jugador.getMinutosJugados(),
                jugador.getTarjetasAmarillas(),
                jugador.getTarjetasRojas()
        );
    }
}
