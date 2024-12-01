package Controller;

public class Persona implements Comparable<Persona> {
    private int edad;
    private String nombre;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString(){
        return "Lista: {nombre= "+nombre+", edad= "+edad+"}";
    }

    @Override
    public int compareTo(Persona OtraPersona){
        return Integer.compare(this.edad, OtraPersona.getEdad());
    }
}
