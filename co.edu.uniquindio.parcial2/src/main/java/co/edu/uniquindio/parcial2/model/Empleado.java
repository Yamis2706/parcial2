package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.model.enumeracion.TipoContrato;

/**
 * Clase Empleado, es un Tipo de FincaUQ
 */
public class Empleado {

    /**
     * Atributos de la Clase
     */
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private double salario;
    private int numeroHorasTrabajo;
    private TipoContrato tipoContrato;

    /**
     * Variable para Relacionar Padre
     */
    FincaUQ ownedByFincaUQ;

    /**
     * Constructor Vacío
     */
    public Empleado() {
    }

    /**
     * Constructor con Parámetros
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @param salario
     * @param numeroHorasTrabajo
     * @param tipoContrato
     */
    public Empleado(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo, TipoContrato tipoContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.salario = salario;
        this.numeroHorasTrabajo = numeroHorasTrabajo;
        this.tipoContrato = tipoContrato;
    }

    /**
     * Getters y Setters
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroHorasTrabajo() {
        return numeroHorasTrabajo;
    }

    public void setNumeroHorasTrabajo(int numeroHorasTrabajo) {
        this.numeroHorasTrabajo = numeroHorasTrabajo;
    }

    public FincaUQ getOwnedByFincaUQ() {
        return ownedByFincaUQ;
    }

    public void setOwnedByFincaUQ(FincaUQ ownedByFincaUQ) {
        this.ownedByFincaUQ = ownedByFincaUQ;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * toString de la Clase
     * @return
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", numeroHorasTrabajo=" + numeroHorasTrabajo +
                ", tipoContrato=" + tipoContrato +
                '}';
    }
}