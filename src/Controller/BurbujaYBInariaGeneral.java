package Controller;

import java.util.ArrayList;

public class BurbujaYBInariaGeneral {

    public <T extends Comparable<T>> void ordenarBurbuja(ListaGeneral<T> lista) {
        ArrayList<T> elementos = lista.getLista();
        for (int i = 0; i < elementos.size(); i++) {
            for (int j = 0; j < elementos.size() - 1; j++) {
                if (elementos.get(j).compareTo(elementos.get(j + 1)) > 0) {
                    T temp = elementos.get(j);
                    elementos.set(j, elementos.get(j + 1));
                    elementos.set(j + 1, temp);
                }
            }
        }
    }


    public <T extends Comparable<T>> int buscarBinaria(ListaGeneral<T> lista, T elemento){
        ArrayList<T> listElemento = lista.getLista();
        int izquierda = 0;
        int derecha = listElemento.size()-1;

        while(izquierda<=derecha){
            int medio = (izquierda+derecha)/2;
            if(listElemento.get(medio).compareTo(elemento) == 0){
                System.out.println("El elemento: "+elemento+", se encuentra en la posicion: "+medio);
                return medio;
            }
            if(listElemento.get(medio).compareTo(elemento) < 0){
                izquierda = medio+1;
            }else{
                derecha = medio-1;
            }
        }
        System.out.println("El elemento: "+elemento+" no se encuentra en la lista.");
        return -1;
    }

}
