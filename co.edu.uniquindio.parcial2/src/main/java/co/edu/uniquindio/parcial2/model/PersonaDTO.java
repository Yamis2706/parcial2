package co.edu.uniquindio.parcial2.model;

import java.util.Objects;

public record PersonaDTO() {
    private static String nombre;
    private static String apellido;
    private static String cedula;
    private static int edad;
    private static double salario;
    private static int numeroHorasTrabajo;

    public class PersonaDTO ( nombre,  apellido,  cedula,
                        edad,  salario,  numeroHorasTabajo) {
        public static String nombre;super ();
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        PersonaDTO.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        PersonaDTO.apellido = apellido;
    }

    public static String getCedula() {
        return cedula;
    }

    public static void setCedula(String cedula) {
        PersonaDTO.cedula = cedula;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        PersonaDTO.edad = edad;
    }

    public static double getSalario() {
        return salario;
    }

    public static void setSalario(double salario) {
        PersonaDTO.salario = salario;
    }

    public static int getNumeroHorasTrabajo() {
        return numeroHorasTrabajo;
    }

    public static void setNumeroHorasTrabajo(int numeroHorasTrabajo) {
        PersonaDTO.numeroHorasTrabajo = numeroHorasTrabajo;
    }

    public int hashCode(){
        Objects objects = null;
        return objects.hash(nombre, apellido, cedula, edad, salario,
                numeroHorasTrabajo);
    }
    public boolean equals (Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        personaDTO other = (personaDTO) obj;
        return Objects.equals(nombre, other.nombre) && apellido == other.apellido
                && Objects.equals (cedula, other.cedula);
    }

}
