package listasEnlazadas;

import listasEnlazadas.Libro;
import listasEnlazadas.Lista;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("libro1", "autor1", "1");
        Libro libro2 = new Libro("libro2", "autor2", "2");
        Libro libro3 = new Libro("libro3", "autor3", "3");
        Libro libro4 = new Libro("libro4", "autor4", "3");

        Lista lista = new Lista();

        lista.insertarFinal(libro1);
        lista.insertarFinal(libro3);


        lista.insertarEn(1, libro2);
        lista.insertarEn(3, libro4);

        lista.eliminarPosicion(1);

        lista.eliminarUltimo();
        lista.eliminarPrincipio();

        lista.mostrarPorConsola();
    }
}