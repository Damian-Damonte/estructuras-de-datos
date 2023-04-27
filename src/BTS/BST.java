package BTS;

public class BST implements IBST<Empleado> {

    private Empleado valor;
    private BST izdo;
    private BST dcho;

    @Override
    public boolean esHoja() {
        return valor != null && izdo == null && dcho == null;
    }

    @Override
    public boolean esVacio() {
        return valor == null;
    }

    @Override
    public void insertar(Empleado empl) {
        if (valor == null) {
            valor = empl;
        } else {

            if (empl.compareTo(valor) < 0) { // Si el valor el emp es menor al valor de este nodo, recorremos el subarbol izquierdo

                if (izdo == null) izdo = new BST();
                izdo.insertar(empl);

            } else if (empl.compareTo(valor) > 0) { // Si el valor del emp es mayor al valor de este nodo, recorremos el subarbol derecho

                if (dcho == null) dcho = new BST();
                dcho.insertar(empl);

            } else {

//            El compareTo da 0, por lo tanto el empleado es duplicado podemos lanzar un error
                System.out.println("Empleado duplicado");
            }
        }
    }

    @Override
    public boolean existe(int id) {
        return false;
    }

    @Override
    public Empleado obtener(int id) {
        return null;
    }

    @Override
    public void preorden() {

    }

    @Override
    public void inorden() {

    }

    @Override
    public void postorden() {

    }

    @Override
    public void eliminar(int id) {

    }
}
