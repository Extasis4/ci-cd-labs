package com.cicd.estructuras;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaTurnosTest {

    private ColaTurnos cola;

    @BeforeEach
    void prepararCola() {
        cola = new ColaTurnos();
    }

    @Test
    void colaNuevaDebeEstarVacia() {
        assertTrue(cola.estaVacia());
        assertEquals(0, cola.cantidadTurnos());
    }

    @Test
    void agregarTurnoDebeIncrementarCantidad() {
        cola.agregarTurno("Juan");

        assertEquals(1, cola.cantidadTurnos());
        assertFalse(cola.estaVacia());
    }

    @Test
    void verSiguienteNoDebeEliminarTurno() {
        cola.agregarTurno("Maria");

        assertEquals("Maria", cola.verSiguiente());
        assertEquals(1, cola.cantidadTurnos());
    }

    @Test
    void atenderSiguienteDebeRespetarOrdenFIFO() {
        cola.agregarTurno("Juan");
        cola.agregarTurno("Maria");
        cola.agregarTurno("Pedro");

        assertEquals("Juan", cola.atenderSiguiente());
        assertEquals("Maria", cola.atenderSiguiente());
        assertEquals("Pedro", cola.atenderSiguiente());
    }

    @Test
    void atenderColaVaciaDebeRetornarNull() {
        assertNull(cola.atenderSiguiente());
    }
}