package com.escuela;

import com.escuela.estudiantes.Estudiante;

import java.util.HashSet;
import java.util.Set;

public class Escuela {
    //Atributos
    Set<Estudiante> listaEstudiantes;

    //Constructores
    public Escuela(){
        this.listaEstudiantes = new HashSet<>();
    }

    //Métodos
    public void agregarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }
    public Estudiante buscarEstudiante(int id) {
        for (Estudiante alumno : listaEstudiantes) {
            if (alumno.getNumeroId() == id) {
                return alumno;
            }
        }
        return null;
    }
}
