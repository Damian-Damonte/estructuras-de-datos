package pilas;

public class MainPila {
    public static void main(String[] args) {
        Url url1 = new Url("url1");
        Url url2 = new Url("url2");
        Url url3 = new Url("url3");

        Pila pila = new MiPila();

        System.out.println(pila.vacia());

        pila.apilar(url1);
        pila.apilar(url2);
        pila.apilar(url3);
        System.out.println(pila.obtener());
        System.out.println(pila.longitud());

        pila.desapilar();
        pila.desapilar();
        System.out.println(pila.obtener());
    }

}
