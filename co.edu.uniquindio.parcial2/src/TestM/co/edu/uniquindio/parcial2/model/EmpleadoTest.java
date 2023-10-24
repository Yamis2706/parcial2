package co.edu.uniquindio.parcial2.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static co.edu.uniquindio.parcial2.model.PersonaDTO.getNombre;
import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void ValidarDatosCompletos() {
       assertEquals("pepito", getNombre());
    }
}