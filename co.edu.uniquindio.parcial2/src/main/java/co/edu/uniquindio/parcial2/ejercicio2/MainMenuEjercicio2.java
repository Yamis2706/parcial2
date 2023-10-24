package co.edu.uniquindio.parcial2.ejercicio2;

import co.edu.uniquindio.parcial2.model.FincaUQ;
import co.edu.uniquindio.parcial2.model.enumeracion.TipoContrato;
import co.edu.uniquindio.parcial2.util.CapturaDatosUtil;

import java.util.Scanner;

public class MainMenuEjercicio2 {
    public static void main(String[] args) {

        FincaUQ fincaUq = new FincaUQ();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = CapturaDatosUtil.leerIntConsola("");

            switch (opcion) {
                case 1:
                    int tipoEmpleado = CapturaDatosUtil.leerIntConsola(
                            "Ingrese el tipo de empleado: Ingrese" +
                                    " 1 - para crear un jornalero, " +
                                    "2 - para crear un recolector, " +
                                    "3 - para crear un administrador");
                    String nombre = CapturaDatosUtil.leerStringConsola(
                            "Ingresa el nombre del empleado: ");
                    String apellido = CapturaDatosUtil.leerStringConsola(
                            "Ingresa el apellido del empleado: ");
                    String cedula = CapturaDatosUtil.leerStringConsola(
                            "Ingresa la cedula del empleado: ");
                    int edad = CapturaDatosUtil.leerIntConsola(
                            "Ingresa la edad del empleado: ");
                    double salario = CapturaDatosUtil.leerDoubleConsola(
                            "Ingresa el salario del empleado: ");
                    int numeroHorasTrabajo = CapturaDatosUtil.leerIntConsola(
                            "Ingresa la cantidad de horas de trabajo del " +
                                    "empleado: ");
                    System.out.println("Ingrese un tipo de contrato valido: " +
                            "HORAS, MEDIO_TIEMPO, TIEMPO_COMPLETO");
                    System.out.print("\n");
                    TipoContrato tipoContrato =
                            TipoContrato.valueOf(CapturaDatosUtil.leerStringConsola(
                                    "Ingrese el tipo de contrato del empleado: "));
                    fincaUq.crearEmpleado(tipoEmpleado, nombre, apellido, cedula,
                            edad, salario, numeroHorasTrabajo, tipoContrato);

                    break;

                case 2:
                    cedula = CapturaDatosUtil.leerStringConsola(
                            "Ingresa la cedula para actualizar el empleado: ");
                    nombre = CapturaDatosUtil.leerStringConsola(
                            "Ingresa el nuevo nombre del empleado: ");
                    apellido = CapturaDatosUtil.leerStringConsola(
                            "Ingresa el nuevo apellido del empleado: ");
                    edad = CapturaDatosUtil.leerIntConsola(
                            "Ingresa la nueva edad del empleado: ");
                    salario = CapturaDatosUtil.leerDoubleConsola(
                            "Ingresa el nuevo salario del empleado: ");
                    numeroHorasTrabajo = CapturaDatosUtil.leerIntConsola(
                            "Ingresa la nueva cantidad de horas de trabajo " +
                                    "del empleado: ");
                    System.out.println("Ingrese un tipo de contrato valido: " +
                            "HORAS, MEDIO_TIEMPO, TIEMPO_COMPLETO");
                    tipoContrato =
                            TipoContrato.valueOf(CapturaDatosUtil.leerStringConsola(
                                    "Ingrese el nuevo contrato del empleado: "));
                    fincaUq.actualizarEmpleado(cedula, nombre, apellido, edad, salario,
                            numeroHorasTrabajo, tipoContrato);

                    break;

                case 3:
                    int tipoEmpleadoImpresion = CapturaDatosUtil.leerIntConsola(
                            "Ingrese 0- para mostrar a todos los empleados," +
                                    " 1 - para mostrar a los Jornaleros," +
                                    " 2 - para mostrar a los recolectores, " +
                                    "3 - para mostrar a los administradores");
                    fincaUq.mostrarInformacionTipoEmpleado(tipoEmpleadoImpresion);
                    break;

                case 4:
                    cedula = CapturaDatosUtil.leerStringConsola(
                            "Ingrese la cedula del empleado para eliminarlo: ");
                    fincaUq.eliminarEmpleado(cedula);
                    break;

                case 5:
                    System.out.println("El usuario ha salido del sistema.");
                    break;

            }
            if (opcion == 5) {
                break;
            }

        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de CRUD:");
        System.out.println("1. Crear Empleado");
        System.out.println("2. Actualizar Empleado");
        System.out.println("3. Leer Empleado");
        System.out.println("4. Eliminar Empleado");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
}