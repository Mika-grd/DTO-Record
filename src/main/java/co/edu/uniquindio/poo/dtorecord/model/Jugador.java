package co.edu.uniquindio.poo.dtorecord.model;

public class Jugador {
    RJugador rjugador;
    int edad;
    String posicion;
    Equipo equipo;  // Relación con el equipo

    // Estadísticas para DTO
    int goles;
    int asistencias;
    int minutosJugados;
    int tarjetasAmarillas;
    int tarjetasRojas;
    float calificacionPromedio;

    public Jugador(RJugador rjugador, int edad, String posicion, Equipo equipo, int goles, int asistencias, int minutosJugados, int tarjetasAmarillas, int tarjetasRojas, float calificacionPromedio) {
        this.rjugador = rjugador;
        this.edad = edad;
        this.posicion = posicion;
        this.equipo = equipo;
        this.goles = goles;
        this.asistencias = asistencias;
        this.minutosJugados = minutosJugados;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.calificacionPromedio = calificacionPromedio;
    }

    public RJugador getRjugador() {
        return rjugador;
    }

    public void setRjugador(RJugador rjugador) {
        this.rjugador = rjugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public float getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void setCalificacionPromedio(float calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "rjugador=" + rjugador +
                ", edad=" + edad +
                ", posicion='" + posicion + '\'' +
                ", equipo=" + equipo +
                ", goles=" + goles +
                ", asistencias=" + asistencias +
                ", minutosJugados=" + minutosJugados +
                ", tarjetasAmarillas=" + tarjetasAmarillas +
                ", tarjetasRojas=" + tarjetasRojas +
                ", calificacionPromedio=" + calificacionPromedio +
                '}';
    }
}
