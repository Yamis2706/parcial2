package co.edu.uniquindio.parcial2.model;

import java.util.Date;

/**
 * Clase Tarea, es un Tipo de FincaUQ
 */
public class Tarea {

    /**
     * Atributos de la Clase
     */
    private int numeroTarea;
    private Date fechaInicio;
    private Date fechaFin;
    private double duracionTarea;
    private String descripcion;
    private Empleado empleadoAsociado;

    /**
     * Variable para Relacionar Padre
     */
    FincaUQ ownedByFincaUQ;

    /**
     * Constructor Vacío
     */
    public Tarea() {
    }

    /**
     * Constructor con Parámetros
     * @param numeroTarea
     * @param fechaInicio
     * @param fechaFin
     * @param duracionTarea
     * @param descripcion
     * @param empleadoAsociado
     */
    public Tarea(int numeroTarea, Date fechaInicio, Date fechaFin, double duracionTarea, String descripcion, Empleado empleadoAsociado) {
        this.numeroTarea = numeroTarea;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracionTarea = duracionTarea;
        this.descripcion = descripcion;
        this.empleadoAsociado = empleadoAsociado;
    }

    /**
     * Getters y Setters
     * @return
     */
    public int getNumeroTarea() {
        return numeroTarea;
    }

    public void setNumeroTarea(int numeroTarea) {
        this.numeroTarea = numeroTarea;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getDuracionTarea() {
        return duracionTarea;
    }

    public void setDuracionTarea(double duracionTarea) {
        this.duracionTarea = duracionTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FincaUQ getOwnedByFincaUQ() {
        return ownedByFincaUQ;
    }

    public void setOwnedByFincaUQ(FincaUQ ownedByFincaUQ) {
        this.ownedByFincaUQ = ownedByFincaUQ;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    /**
     * toString de la Clase
     * @return
     */
    @Override
    public String toString() {
        return "Tarea{" +
                "numeroTarea=" + numeroTarea +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", duracionTarea=" + duracionTarea +
                ", descripcion='" + descripcion + '\'' +
                ", empleadoAsociado=" + empleadoAsociado +
                '}';
    }

    /**
     *
     */
    public void calcularDuracion() {
        long duracionMili = fechaFin.getTime() - fechaInicio.getTime();
        this.duracionTarea = duracionMili;
        long minutos = convertirMiliAMinutos(duracionMili);
        long horas = convertirMiliAHoras(duracionMili);
        setDuracionTarea(minutos);
    }

    /**
     *
     * @param duracionMili
     * @return
     */
    private long convertirMiliAHoras(long duracionMili) {
        long horas = 0;
        horas = duracionMili / 3600000;
        return horas;
    }

    /**
     *
     * @param duracionMili
     * @return
     */
    private long convertirMiliAMinutos(long duracionMili) {
        long minutos = 0;
        minutos = duracionMili / 60000;
        return  minutos;
    }
}