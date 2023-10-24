package co.edu.uniquindio.parcial2.ejercicio2;

import co.edu.uniquindio.parcial2.model.*;
import co.edu.uniquindio.parcial2.model.enumeracion.TipoContrato;

import java.util.Date;
import java.util.List;

public class MainEjercicio2 {
    public static void main(String[] args){
        FincaUQ fincaUQ = inicializarDatosPrueba();

        //Crud Empleado

        //Crear
        crearEmpleado(1,"Yamis", "Londoño",
                "1094881192", 53, 1150000, 8,
                TipoContrato.MEDIO_TIEMPO, fincaUQ);
        crearEmpleado(2,"Esteban", "Quintero",
                "1061724266", 18, 800000, 10,
                TipoContrato.HORAS, fincaUQ);
        crearEmpleado(3,"Fabián", "Gallego",
                "1033710688", 34, 2500000, 8,
                TipoContrato.TIEMPO_COMPLETO, fincaUQ);
        crearEmpleado(4, "Emily", "Londoño",
                "1090273121", 18, 1500000, 8,
                TipoContrato.HORAS, fincaUQ);
        crearEmpleado(5,"Juliana", "Ramírez",
                "1024490348", 20, 900000, 10,
                TipoContrato.MEDIO_TIEMPO, fincaUQ);

        //Read
        fincaUQ.mostrarInformacionTipoEmpleado(0);
        System.out.println("Informacion empleados:");
        mostrarInformacionEmpleados(fincaUQ);

        //Delate
        eliminarEmpleado("1090273121", fincaUQ);
        System.out.println("-----> Información luego de eliminar:");
        mostrarInformacionEmpleados(fincaUQ);

        //update
        actualizarEmpleado("1094881193", "Sofía",
                "Arias", 19, 1550000, 10,
                TipoContrato.TIEMPO_COMPLETO , fincaUQ);
        System.out.println("-----> Información luego de actualizar");
        mostrarInformacionEmpleados(fincaUQ);

        Date fechaInicio = new Date(23,10,15,07,01);
        Date fechaFin = new Date(23,10,24,20,01);

        fincaUQ.crearTarea(1, "1016874393", fechaInicio, fechaFin);

    }

    private static FincaUQ inicializarDatosPrueba() {
        FincaUQ fincaUq = new FincaUQ();
        fincaUq.setNombre("Mi finca");

        return fincaUq;
    }

    private static void crearEmpleado(int tipoEmpleado, String nombre,
                                      String apellido, String cedula,
                                      int edad, double salario,
                                      int numeroHorasTrabajo,
                                      TipoContrato tipoContrato, FincaUQ fincaUQ) {
        fincaUQ.crearEmpleado(tipoEmpleado,nombre,apellido,cedula,edad,
                salario,numeroHorasTrabajo,tipoContrato);
    }

    private static void mostrarInformacionEmpleados(FincaUQ fincaUQ) {
        List<Empleado> listaEmpleados = fincaUQ.obtenerEmpleados();
        int tamanoLista = listaEmpleados.size();
        for (int i = 0; i < tamanoLista; i ++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.toString());
        }
    }

    private static void eliminarEmpleado(String cedula, FincaUQ fincaUQ) {

        fincaUQ.eliminarEmpleado(cedula);
    }

    private static void actualizarEmpleado(String cedula,String nuevoNombre,
                                           String nuevoApellido,
                                           int nuevaEdad, double nuevoSalario ,
                                           int nuevoNumeroHoras,
                                           TipoContrato nuevoContrato, FincaUQ fincaUQ) {

        fincaUQ.actualizarEmpleado(cedula, nuevoNombre, nuevoApellido,
                nuevaEdad, nuevoSalario, nuevoNumeroHoras, nuevoContrato);
    }
}