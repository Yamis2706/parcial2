package co.edu.uniquindio.parcial2.model;


        import co.edu.uniquindio.parcial2.model.CuentaBancaria;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

  CuentaBancaria cuentaBancaria;

  @BeforeEach
  public void init(){
    cuentaBancaria = new CuentaBancaria("andres", 50000, "1016");
  }

  @Test
  public void cuentaExistenteTest(){
    String numeroCuentaValidar = "1016";
    String numeroCuenta = cuentaBancaria.numeroReferencia();
    assertEquals(numeroCuenta, numeroCuentaValidar);

  }

  @Test
  public void retirarDineroTest(){
    double montoARetirar = 140000;
    double saldoCuenta = cuentaBancaria.saldo();
    assertFalse(montoARetirar > saldoCuenta);
  }

  @Test
  public void depositoTest(){
    double saldo = cuentaBancaria.saldo();
    assertTrue(saldo != 0);
  }
}
