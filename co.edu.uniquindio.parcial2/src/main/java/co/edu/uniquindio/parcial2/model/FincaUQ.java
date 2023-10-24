package co.edu.uniquindio.parcial2.model;

import java.util.ArrayList;
import java.util.List;

public class FincaUQ {
private String nombre;
public static List<Tarea> listaTareas = new ArrayList<>();
public static List<Empleado> listaEmpleados = new ArrayList<>();
public FincaUQ (){};
public FincaUQ(String nombre) {this.nombre = nombre;}

    public String getNombre() {
        return nombre;
    }

    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  List <Tarea> getListaTareas() {
        return listaTareas;
    }

    public  void setListaTareas(List<Tarea> listaTareas) {
        FincaUQ.listaTareas = listaTareas;
    }

    public static List <Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public  void setListaEmpleados(List<Empleado> listaEmpleados) {
        FincaUQ.listaEmpleados = listaEmpleados;

    }

    public boolean crearEmpleado(String nombre, String apellido, String cedula,
                                 int edad, double salario, int numeroHorasTrabajo) {
        Empleado empleado = new Empleado();
        boolean cedulaExistente = false;
        Empleado[] getListaEmpleados = new Empleado[0];
        for (Empleado empleado1 : getListaEmpleados){
            if (empleado1.getCedula().equalsIgnoreCase(cedula)) {
                cedulaExistente = true;
                break;
            }
        }
        if (cedulaExistente) {
            imprimir("El número de cédula" + cedula +  "ya existe, " +
                    "digite un número diferente");
        } else {
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setCedula(cedula);
            empleado.setEdad(edad);
            empleado.setSalario(salario);
            getListaEmpleados().add((Empleado) listaEmpleados);
        }
        return true;
    }

    private void imprimir(String mensaje) {
    }

    /**
     *
     */
    public void getmostrarLosEmpleados() {
        for (Empleado miEmpleado : getListaEmpleados() ) {
            System.out.println(miEmpleado.toString());
        }
    }

    public void mostrarEmpleadosPorTipo(int valorTipo) {
        for (Empleado miEmpleado : getListaEmpleados()) {

            if (valorTipo == 1 && miEmpleado instanceof Administrador) {
                System.out.println(miEmpleado.toString());
            }
            if (valorTipo == 2 && miEmpleado instanceof Jornalero) {
                System.out.println(miEmpleado.toString());
            }
            if (valorTipo == 3 && miEmpleado instanceof Recolector) {
                System.out.println(miEmpleado.toString());
            }
        }
    }

    public void crearTarea(int numeroTarea, String cedulaEmpleado) {
        Tarea tarea = new Tarea();
        tarea.setNumeroTarea(numeroTarea);

        Empleado empleado = obtenerEmpleado (cedulaEmpleado);
        if (empleado != null){
            tarea.setEmpleadoAsociado();
        }

        getListaTareas().add(tarea);
    }

    private Empleado obtenerEmpleado(String cedulaEmpleado) {
        Empleado empleadoEncontrado = null;
        for ( Empleado empleado : getListaEmpleados()) {
            if (empleado.getCedula().equals(cedulaEmpleado)){
                empleadoEncontrado = empleado;
                break;
            }

        }
        return empleadoEncontrado;
    }

    public void mostrarEmpleados() {
    }
}
