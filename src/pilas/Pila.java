package pilas;

public interface Pila {
    void apilar(Url url);
    void desapilar();
    Url obtener();
    int longitud();
    boolean vacia();
}
