public class Lista {
    private Nodo cabeza;
//  puedo agregarle atributos a la lista
    private int longitud = 0;

    private class Nodo {
        public Libro libro;
        public Nodo siguiente = null;

        public Nodo(Libro libro) {
            this.libro = libro;
        }
    }

    public void insertarPrincipio(Libro libro) {
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public void insertarFinal(Libro libro) {
        Nodo newNodo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = newNodo;
        } else {
            Nodo puntero = cabeza;
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = newNodo;
        }
        longitud++;
    }

    //   Ej insertar este libro despues del quinto libro
    public void insertarDespues(int n, Libro libro) {
        Nodo newNodo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = newNodo;
        } else {
            int contador = 0;
            Nodo puntero = cabeza;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }

            newNodo.siguiente = puntero.siguiente;
            puntero.siguiente = newNodo;
        }
        longitud++;
    }

    //   Ej obtener el tercer libro de la lista
    public Libro obtener(int n) {
        if (cabeza == null) {
            return null;
        } else {

            int contador = 0;
            Nodo puntero = cabeza;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }

            if (contador != n) {
                return null;
            } else {
                return puntero.libro;
            }

        }
    }

    //    Saber cuantos libros hay en nuestra lista
    public int contar() {
        return longitud;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void eliminarPrincipio() {
        if(cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            longitud--;
        }
    }

    public void eliminarUltimo() {
        if (cabeza != null) {
//          en caso de que la lista tenga un solo elemento
            if (cabeza.siguiente == null) {
                cabeza = null;
                longitud--;
            }
            Nodo puntero = cabeza;
            while (puntero.siguiente.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = null;
            longitud--;
        }
    }

    public void eliminarPosicion(int n) {
        if(cabeza != null) {
//          si quiero eliminar el primer libro, mismo codigo que eliminar principio
            if(n == 0) {
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;
                longitud--;
            } else if (n < longitud){
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (n - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
            }
        }
    }
}
