package BTS;

import java.util.Arrays;

public class MainBTS {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(10, "Juan");
        Empleado empleado2 = new Empleado(2, "Pepe");
        Empleado empleado3 = new Empleado(32, "Jorge");
        Empleado empleado4 = new Empleado(4, "Carlos");
        Empleado empleado5 = new Empleado(15, "Andres");
        Empleado empleado6 = new Empleado(64, "Nicolas");
        Empleado empleado7 = new Empleado(5, "Nicolas");
        Empleado empleado8 = new Empleado(3, "Nicolas");

        BST bst = new BST();
//        System.out.println("Está vacio: " + bst.esVacio() + " - Es hoja: " + bst.esHoja());
//
//        bst.insertar(empleado1);
//        System.out.println("Está vacio: " + bst.esVacio() + " - Es hoja: " + bst.esHoja());
//
//        bst.insertar(empleado2);
//        System.out.println("Está vacio: " + bst.esVacio() + " - Es hoja: " + bst.esHoja());
//
//        localizar(bst, 2);
//        localizar(bst, 44);

        Arrays.asList(empleado1, empleado2, empleado3, empleado4, empleado5, empleado6, empleado7, empleado8)
                .forEach(bst::insertar);

        bst.preorden();

    }

    private static void localizar(BST bst, int id) {
        if (bst.existe(id)) {
            System.out.println(bst.obtener(id));
        } else {
            System.out.println("No se encuentró al emplicado con id " + id);
        }
    }
}
