package com.escuela;

import com.escuela.estudiantes.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto
        Escuela miEscuela = new Escuela();

        //Agregar estudiantes
        Estudiante estudiante1 = new Estudiante("Pepito", 123, 3.45);
        Estudiante estudiante2 = new Estudiante("Carlitos", 456, 5);
        Estudiante estudiante3 = new Estudiante("Pepita", 789, 4.2);

        miEscuela.agregarEstudiante(estudiante1);
        miEscuela.agregarEstudiante(estudiante2);
        miEscuela.agregarEstudiante(estudiante3);

        //Comprobaciones
//        for (Estudiante alumno : miEscuela.listaEstudiantes){
//            System.out.println("Nombre: " + alumno.getNombre() + "\nIdentificacion: " + alumno.getNumeroId() + "\nCalificación: " + alumno.getCalificacion());
//        }

        //Punto 4
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;

        do {
            System.out.println("Menú");
            System.out.println("1. Agregar Estudiante \n2. Buscar estudiante por identificación \n3. Salir");
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Número de identificación estudiante: ");
                    int numId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Calificación estudiante: ");
                    double calificacion = Double.parseDouble(scanner.nextLine());

                    Estudiante estudianteBase = new Estudiante();

                    estudianteBase.setNombre(nombre);
                    estudianteBase.setCalificacion(calificacion);
                    estudianteBase.setNumeroId(numId);

                    if (miEscuela.buscarEstudiante(numId) == null){
                        if (estudianteBase.getCalificacion() != -1){
                            miEscuela.agregarEstudiante(estudianteBase);
                            System.out.println("Estudiante Agregado");
                        }
                    } else {
                        System.out.println("El número de Identificacion ya se encuentra registrado");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la identificación del estudiante: ");
                    int idBusqueda = Integer.parseInt(scanner.nextLine());

                    if (miEscuela.buscarEstudiante(idBusqueda) != null){
                        System.out.println("Estudiante encontrado: " + miEscuela.buscarEstudiante(idBusqueda).getNombre());
                    } else {
                        System.out.println("El estudiante no se encuentra registrado");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del registro de estudiantes");
                    bandera = false;
                    break;
                default:
                    System.out.println("Ingrese un valor válido");
            }
        } while (bandera);

        //Comprobaciones
        for (Estudiante alumno : miEscuela.listaEstudiantes){
            System.out.println(alumno.getNombre());
        }
    }
}