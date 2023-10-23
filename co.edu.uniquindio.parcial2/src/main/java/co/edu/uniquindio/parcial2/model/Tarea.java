package co.edu.uniquindio.parcial2.model;

import java.util.Date;

public class Tarea {

    private int numeroTarea;
    private Date fechaInicio;
    private Date fechaFin;
    private double duracionTarea;
    private String descripcion;

    FincaUQ ownedByFincaUQ;


    public Tarea() {

    }

    public Tarea(int numeroTarea, Date fechaInicio, Date fechaFin,
                 double duracionTarea, String descripcion,
                 FincaUQ ownedByFincaUQ) {
        this.numeroTarea = numeroTarea;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracionTarea = duracionTarea;
        this.descripcion = descripcion;
        this.ownedByFincaUQ = ownedByFincaUQ;
    }
}
