package pilas;

public class MiPila implements Pila{

    private class Nodo {
        public  Url ulr;
        public Nodo siguiente = null;

        public Nodo(Url ulr) {
            this.ulr = ulr;
        }
    }

    private Nodo cima = null;
    private int longitud = 0;

    @Override
    public void apilar(Url url) {
        Nodo newNodo = new Nodo(url);
        newNodo.siguiente = cima;
        cima = newNodo;
        longitud++;
    }

    @Override
    public void desapilar() {
        if (cima != null) {
            Nodo eliminar = cima;
            cima = cima.siguiente;
            eliminar.siguiente = null;
            longitud--;
        }
    }

    @Override
    public Url obtener() {
        if(cima == null) {
            return null;
        } else {
            return cima.ulr;
        }
    }

    @Override
    public int longitud() {
        return longitud;
    }

    @Override
    public boolean vacia() {
        return longitud == 0;
    }
}
