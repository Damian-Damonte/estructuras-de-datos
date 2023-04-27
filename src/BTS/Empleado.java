package BTS;

public class Empleado implements Comparable<Empleado>{
    private int id;
    private String nombre;

    public Empleado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int compareTo(Empleado empl) {
        if(id == empl.getId()) {
            return 0;
        } else if (id < empl.getId()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Empleado " + id;
    }
}
