package colas;

import listasEnlazadas.Lista;

public class MiColaProceso implements ColaProceso {
    private class NodoProceso {
        public Trabajo trabajo;
        public NodoProceso siguiente;

        public NodoProceso(Trabajo trabajo) {
            this.trabajo = trabajo;
        }
    }

    private NodoProceso cabeza;
    private NodoProceso ultimo;


    @Override
    public void encolar(Trabajo t) {
        NodoProceso newNodo = new NodoProceso(t);
        if (cabeza == null) {
            cabeza = newNodo;
        } else {
            ultimo.siguiente = newNodo;
        }
        ultimo = newNodo;
    }

    @Override
    public void eliminar() {
        if (cabeza != null) {
            NodoProceso eliminar = cabeza;
            cabeza = cabeza.siguiente;
            eliminar.siguiente = null;
            if(cabeza == null) {
                ultimo = null;
            }
        }
    }

    @Override
    public Trabajo obtener() {
        if (cabeza == null) {
            return null;
        } else {
            return cabeza.trabajo;
        }
    }

    public void mostrarEnConsola() {
        System.out.println("Mostrando lista");
        NodoProceso nodo = cabeza;

        while(nodo != null) {
            System.out.println(nodo.trabajo.getNombre());
            nodo = nodo.siguiente;
        }
    }
}
