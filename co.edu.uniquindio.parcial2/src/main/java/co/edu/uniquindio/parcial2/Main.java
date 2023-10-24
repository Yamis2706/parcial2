package co.edu.uniquindio.parcial2;

import co.edu.uniquindio.parcial2.model.*;

public class Main {
    public static void main(String[] args) {

        FincaUQ fincaUQ = inicializarDatosPrueba();

        //mostrar los empleados
        fincaUQ.mostrarEmpleados();

        //mostrar empleados de un tipo
        fincaUQ.mostrarEmpleadosPorTipo(1);
        fincaUQ.crearTarea(1, "123");
    }

    private static FincaUQ inicializarDatosPrueba() {
        FincaUQ fincaUQ = new FincaUQ();
        fincaUQ.setNombre("Mi finca");


        Administrador administrador = new Administrador();
        administrador.setNombre("Juan");
        administrador.setTipoContrato(TipoContrato.HORAS);
        administrador.setCedula("123");

        Jornalero jornalero = new Jornalero();
        jornalero.setNombre("Daniel");
        jornalero.setTipoContrato(TipoContrato.MEDIO_TIEMPO);
        jornalero.setCedula("456");


        Recolector recolector = new Recolector();
        recolector.setNombre("Samuel");
        recolector.setTipoContrato(TipoContrato.TIEMPO_COMPLETO);
        recolector.setCedula("789");


        FincaUQ.getListaEmpleados().add(administrador);
        FincaUQ.getListaEmpleados().add(jornalero);
        FincaUQ.getListaEmpleados().add(recolector);

        return fincaUQ;
    }

}
