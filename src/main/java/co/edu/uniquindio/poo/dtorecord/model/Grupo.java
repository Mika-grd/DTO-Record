package co.edu.uniquindio.poo.dtorecord.model;

import java.util.LinkedList;

public class Grupo {
        //Atributos
        private static Grupo instance; // Instancia única del grupo
        private int idGrupo;
        private String nombre;
        private LinkedList<Equipo> listaEquipos;

        // Constructor privado para evitar la creación de instancias fuera de la clase
        private Grupo(int idGrupo, String nombre, LinkedList<Equipo> listaEquipos) {
                this.idGrupo = idGrupo;
                this.nombre = nombre;
                this.listaEquipos = listaEquipos != null ? listaEquipos : new LinkedList<>();
        }

        // Gets y Sets
        public static Grupo getInstance() {
                if (instance == null) {
                        instance = new Grupo(0, "GrupoA", new LinkedList<>());
                }
                return instance;
        }

        public static void setInstance(Grupo instance) {
                Grupo.instance = instance;
        }

        public int getIdGrupo() {
                return idGrupo;
        }

        public void setIdGrupo(int idGrupo) {
                this.idGrupo = idGrupo;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public LinkedList<Equipo> getListaEquipos() {
                return listaEquipos;
        }

        public void setListaEquipos(LinkedList<Equipo> listaEquipos) {
                this.listaEquipos = listaEquipos != null ? listaEquipos : new LinkedList<>();
        }
}