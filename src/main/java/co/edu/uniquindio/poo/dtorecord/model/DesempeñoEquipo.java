package co.edu.uniquindio.poo.dtorecord.model;

public record DesempeñoEquipo(
        // Atributos de la clase DesempeñoEquipo
        int idEquipo,
        String nombre,
        int partidosJugados,
        int partidosGanados,
        int partidosEmpatados,
        int partidosPerdidos,
        int golesAFavor,
        int golesEnContra,
        int diferenciaGoles,
        int puntos
) {

    // Constructor que recibe un objeto Equipo
    public DesempeñoEquipo(Equipo equipo) {
        this(
                equipo.getEquipo().idEquipo(),
                equipo.getEquipo().nombre(),
                equipo.getPartidosJugados(),
                equipo.getPartidosGanados(),
                equipo.getPartidosEmpatados(),
                equipo.getPartidosPerdidos(),
                equipo.getGolesAFavor(),
                equipo.getGolesEnContra(),
                equipo.getGolesAFavor() - equipo.getGolesEnContra(),
                equipo.getPuntos()
        );
    }
}
