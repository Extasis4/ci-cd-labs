package com.cicd.estructuras;

import java.util.LinkedList;
import java.util.Queue;

public class ColaTurnos {

    private Queue<String> turnos;

    public ColaTurnos() {
        turnos = new LinkedList<>();
    }

    public void agregarTurno(String nombre) {
        turnos.offer(nombre);
    }

    public String atenderSiguiente() {
        return turnos.poll();
    }

    public String verSiguiente() {
        return turnos.peek();
    }

    public int cantidadTurnos() {
        return turnos.size();
    }

    public boolean estaVacia() {
        return turnos.isEmpty();
    }
}