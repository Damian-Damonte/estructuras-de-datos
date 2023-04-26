package colas;

public class Trabajo {
    private String nombre;

    public Trabajo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
