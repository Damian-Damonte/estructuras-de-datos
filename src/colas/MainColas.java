package colas;

public class MainColas {
    public static void main(String[] args) {
        Trabajo trabajo1 = new Trabajo("trabajo 1");
        Trabajo trabajo2 = new Trabajo("trabajo 2");
        Trabajo trabajo3 = new Trabajo("trabajo 3");
        MiColaProceso miColaProceso = new MiColaProceso();

        miColaProceso.encolar(trabajo1);
        miColaProceso.encolar(trabajo2);
        miColaProceso.encolar(trabajo3);

        miColaProceso.eliminar();

        System.out.println(miColaProceso.obtener());


        miColaProceso.mostrarEnConsola();
    }
}
