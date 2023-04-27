package BTS;

public class MainBTS {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Juan");
        Empleado empleado2 = new Empleado(2, "Pepe");
        Empleado empleado3 = new Empleado(3, "Jorge");
        Empleado empleado4 = new Empleado(4, "Carlos");
        Empleado empleado5 = new Empleado(5, "Andres");
        Empleado empleado6 = new Empleado(6, "Nicolas");

        BST bst = new BST();
        System.out.println("Está vacio: " + bst.esVacio() + " - Es hoja: " + bst.esHoja());

        bst.insertar(empleado1);
        System.out.println("Está vacio: " + bst.esVacio() + " - Es hoja: " + bst.esHoja());

        bst.insertar(empleado2);
        System.out.println("Está vacio: " + bst.esVacio() + " - Es hoja: " + bst.esHoja());

    }
}
