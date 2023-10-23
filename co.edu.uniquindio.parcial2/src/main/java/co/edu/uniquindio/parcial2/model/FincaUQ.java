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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public static void setListaTareas(List<Tarea> listaTareas) {
        FincaUQ.listaTareas = listaTareas;
    }

    public static List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public static void setListaEmpleados(List<Empleado> listaEmpleados) {
        FincaUQ.listaEmpleados = listaEmpleados;

    }
    public static <integer> integer buscarEmpleado(String cedula) {
        int tamanioLista = getListaEmpleados().size();
        integer empleadoExiste = null;
        int i = 0 ;
        for (i = 0; i < tamanioLista; i++) {
            Empleado empleado = getListaEmpleados().get(i);
            if (empleado.getCedula().equalsIgnoreCase(cedula)) {
                empleadoExiste = i;
                System.out.println("El cliente con cédula" + cedula +
                        "ya existe, no es posible crearlo de nuevo");
                break;
            }

        }
        return empleadoExiste;
    }
    
}
