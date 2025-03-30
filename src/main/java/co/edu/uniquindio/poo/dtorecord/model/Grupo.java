package co.edu.uniquindio.poo.dtorecord.model;

import java.util.LinkedList;

public class Grupo {
        static Grupo instance;
        int idGrupo;
        String nombre;
        LinkedList<Equipo> listaEquipos;

        private Grupo(int idGrupo, String nombre, LinkedList<Equipo> listaEquipos) {

        }

        public static Grupo getInsance(){
                if (instance == null){
                        instance = new Grupo(0,"GrupoA",new LinkedList<>());
                }
                return instance;
        }

        public static Grupo getInstance() {
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
                this.listaEquipos = listaEquipos;
        }
}
