
import Controller.BurbujaYBInariaGeneral;
import Controller.ListaGeneral;
import Controller.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        BurbujaYBInariaGeneral ordenarYBusqueda = new BurbujaYBInariaGeneral();

        ListaGeneral<Integer> listaNumeros = new ListaGeneral<>();
        listaNumeros.agregarElemento(3);
        listaNumeros.agregarElemento(6);
        listaNumeros.agregarElemento(-6);
        listaNumeros.agregarElemento(2);
        listaNumeros.agregarElemento(-1);

        ListaGeneral<String> listaPalabras = new ListaGeneral<>();
        listaPalabras.agregarElemento("Casa");
        listaPalabras.agregarElemento("perro");
        listaPalabras.agregarElemento("elemento");

        ListaGeneral<Persona> listaPersona = new ListaGeneral<>();
        listaPersona.agregarElemento(new Persona("pablo", 10));
        listaPersona.agregarElemento(new Persona("maria", 70));
        listaPersona.agregarElemento(new Persona("juan", 14));
        listaPersona.agregarElemento(new Persona("carla", 35));
        listaPersona.agregarElemento(new Persona("rober", 40));

        System.out.println("Lista de números:");
        listaNumeros.mostrarLista();

        System.out.println("Lista de palabras:");
        listaPalabras.mostrarLista();

        System.out.println("Lista de personas:");
        listaPersona.mostrarLista();
        System.out.println("Lista de datos generales ordenados");
        System.out.println("Lista de números:");
        ordenarYBusqueda.ordenarBurbuja(listaNumeros);
        listaNumeros.mostrarLista();
        ordenarYBusqueda.buscarBinaria(listaNumeros, 3);
        ordenarYBusqueda.buscarBinaria(listaNumeros, 9);

        System.out.println("Lista de palabras:");
        ordenarYBusqueda.ordenarBurbuja(listaPalabras);
        listaPalabras.mostrarLista();
        ordenarYBusqueda.buscarBinaria(listaPalabras, "Carro");
        ordenarYBusqueda.buscarBinaria(listaPalabras, "casa");

        System.out.println("Lista de personas por edad:");
        ordenarYBusqueda.ordenarBurbuja(listaPersona);
        listaPersona.mostrarLista();
    }
}