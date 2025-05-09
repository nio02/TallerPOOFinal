package com.escuela.estudiantes;

public class Estudiante {
    //Atributos
    private String nombre;
    private int numeroId;
    private double calificacion;

    //Constructores
    public Estudiante(){
    }
    public Estudiante(String nombre, int numeroId, double calificacion) {
        this.nombre = nombre;
        this.numeroId = numeroId;
        this.calificacion = calificacion;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroId() {
        return numeroId;
    }
    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
