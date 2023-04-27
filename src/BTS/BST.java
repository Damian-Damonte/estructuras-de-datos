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
        if (valor != null) { // Comprobar que el arbol no esté vacio

            if (id == valor.getId()) { // El elemento buscado es la raíz
                return true;

            } else if (id < valor.getId() && izdo != null) { // el id es menor al valor actual, me voy por el subarbol izq
                return izdo.existe(id);

            } else if(id > valor.getId() && dcho != null) { // el id es mayor al valor actual, me voy por el subarbol dcho
                return dcho.existe(id);

            } else {
                return false;
            }

        } else { // El arbol está vacio
            return false;
        }
    }

    @Override
    public Empleado obtener(int id) {
//      Es similar al existe() solo que en este caso devuelve el valor

        if (valor != null) { // Comprobar que el arbol no esté vacio

            if (id == valor.getId()) { // El elemento buscado es la raíz
                return valor;

            } else if (id < valor.getId() && izdo != null) { // el id es menor al valor actual, me voy por el subarbol izq
                return izdo.obtener(id);

            } else if(id > valor.getId() && dcho != null) { // el id es mayor al valor actual, me voy por el subarbol dcho
                return dcho.obtener(id);

            } else {
                return  null;
            }

        } else { // El arbol está vacio
            return null;
        }
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
