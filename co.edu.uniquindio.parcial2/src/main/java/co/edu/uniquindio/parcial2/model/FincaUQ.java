package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.model.enumeracion.TipoContrato;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase Padre FincaUQ
 */
public class FincaUQ {

    /**
     * Atributos de la Clase
     */
    private String nombre;

    public List<Empleado> listaEmpleados = new ArrayList<>();
    public List<Tarea> listaTareas = new ArrayList<>();

    /**
     * Constructor Vacío
     */
    public FincaUQ() {
    }

    /**
     * Constructor con Parámetros
     * @param nombre
     */
    public FincaUQ(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    /**
     * toString de la Clase
     * @return
     */
    @Override
    public String toString() {
        return "FincaUQ{" +
                "nombre='" + nombre + '\'' +
                ", listaEmpleados=" + listaEmpleados +
                ", listaTareas=" + listaTareas +
                '}';
    }

    public void crearEmpleado( int tipoEmpleado, String nombre, String apellido,
                               String cedula, int edad, double salario,
                               int numeroHorasTrabajo, TipoContrato tipoContrato) {

        int resultadoBusqueda = devolverPosicionEmpleado(cedula);
        if (resultadoBusqueda == -1){
            if (tipoEmpleado == 1){
                Jornalero jornalero = new Jornalero();
                jornalero.setNombre(nombre);
                jornalero.setApellido(apellido);
                jornalero.setCedula(cedula);
                jornalero.setEdad(edad);
                jornalero.setSalario(salario);
                jornalero.setNumeroHorasTrabajo(numeroHorasTrabajo);
                jornalero.setTipoContrato(tipoContrato);
                getListaEmpleados().add(jornalero);
                System.out.println("Empleado creado exitosamente");


            } else if (tipoEmpleado == 2) {
                Recolector recolector = new Recolector();
                recolector.setNombre(nombre);
                recolector.setApellido(apellido);
                recolector.setCedula(cedula);
                recolector.setEdad(edad);
                recolector.setSalario(salario);
                recolector.setNumeroHorasTrabajo(numeroHorasTrabajo);
                recolector.setTipoContrato(tipoContrato);
                getListaEmpleados().add(recolector);
                System.out.println("Empleado creado exitosamente");


            }
            else if (tipoEmpleado == 3){
                Administrador administrador = new Administrador();
                administrador.setNombre(nombre);
                administrador.setApellido(apellido);
                administrador.setCedula(cedula);
                administrador.setEdad(edad);
                administrador.setSalario(salario);
                administrador.setNumeroHorasTrabajo(numeroHorasTrabajo);
                administrador.setTipoContrato(tipoContrato);
                getListaEmpleados().add(administrador);
                System.out.println("Empleado creado exitosamente");

            }
            else
                System.out.println("Ingrese un valor valido");


        }else {
            System.out.println("El empleado ya esta creado en el sistema");
        }
    }

    public List<Empleado> obtenerEmpleados() {
        return getListaEmpleados();
    }

    public int devolverPosicionEmpleado(String cedula) {
        int posicion = -1;
        boolean bandera = false;
        for(int i = 0; i < listaEmpleados.size() && bandera == false; i++) {
            if(listaEmpleados.get(i).getCedula().equalsIgnoreCase(cedula)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }

    public void eliminarEmpleado(String cedula) {
        for (Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equalsIgnoreCase(cedula)){
                getListaEmpleados().remove(empleado);
                break;
            }
        }
    }

    public void actualizarEmpleado(String cedula, String nuevoNombre, String nuevoApellido, int nuevaEdad, double nuevoSalario, int nuevoNumeroHoras, TipoContrato tipoContrato) {

        for (Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equals(cedula)){
                empleado.setNombre(nuevoNombre);
                empleado.setApellido(nuevoApellido);
                empleado.setEdad(nuevaEdad);
                empleado.setSalario(nuevoSalario);
                empleado.setNumeroHorasTrabajo(nuevoNumeroHoras);
                empleado.setTipoContrato(tipoContrato);
                break;
            }
        }
    }

    public void mostrarInformacionTipoEmpleado(int tipoEmpleado) {

        for (Empleado empleado : getListaEmpleados() ) {
            if (tipoEmpleado == 0){
                System.out.println(empleado.toString());
            }
            if (tipoEmpleado == 1 && empleado instanceof Jornalero){
                System.out.println(empleado);
            } else if (tipoEmpleado == 2 && empleado instanceof Recolector) {
                System.out.println(empleado);
            } else if (tipoEmpleado == 3 && empleado instanceof Administrador) {
                System.out.println(empleado);

            }
        }
    }

    public void crearTarea(int numeroTarea, String cedulaEmpleado, Date fechaInicio, Date fechaFin) {
        Tarea tarea = new Tarea();
        tarea.setNumeroTarea(numeroTarea);
        tarea.setFechaInicio(fechaInicio);
        tarea.setFechaFin(fechaFin);

        tarea.calcularDuracion();

        Empleado empleado = obtenerEmpleado(cedulaEmpleado);

        if (empleado != null){
            tarea.setEmpleadoAsociado(empleado);
        }
        getListaTareas().add(tarea);
    }

    private Empleado obtenerEmpleado(String cedulaEmpleado) {
        Empleado empleadoEncontrado = null;
        for (Empleado empleado : getListaEmpleados()) {
            if (empleado.getCedula().equals(cedulaEmpleado)) {
                empleadoEncontrado = empleado;
                break;
            }
        }
        return empleadoEncontrado;

    }
}