package Controller;

import java.util.ArrayList;

public class ListaGeneral<T> {
    private ArrayList<T> lista = new ArrayList<>();

    public void agregarElemento(T elemento){
        lista.add(elemento);
    }

    public T obtenerElemento(int indice){
        return lista.get(indice);
    }
    public ArrayList<T> getLista(){
        return lista;
    }

    public void mostrarLista() {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
