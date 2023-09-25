/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frmlistasenlazadas;

/**
 *
 * @author carlospalominovidal
 */
public class ListaEnlazada {
    Nodo nodoInicial; // Primer nodo de la lista
    int numElementos; // Número de elementos en la lista

    // Constructor para crear una lista enlazada vacía
    public ListaEnlazada() {
        nodoInicial = null; // Inicialmente, no hay nodos
        numElementos = 0;  // Inicialmente, el contador es 0
    }

    // Método para agregar un nuevo nodo al final de la lista
    public void agregarNodo(Producto producto) {
        Nodo nuevoNodo = new Nodo(producto);

        // Si la lista está vacía, el nuevo nodo se convierte en el nodo inicial
        if (nodoInicial == null) {
            nodoInicial = nuevoNodo;
        } else {
            // Si la lista no está vacía, recorremos la lista hasta llegar al último nodo
            Nodo nodoActual = nodoInicial;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }

            // Enlazamos el último nodo con el nuevo nodo
            nodoActual.setSiguiente(nuevoNodo);
        }

        numElementos++; // Incrementamos el contador de elementos
    }

    // Método para imprimir los elementos de la lista
    public void imprimir() {
        Nodo nodoActual = nodoInicial;

        System.out.println("Elementos de la lista enlazada:");

        while (nodoActual != null) {
            System.out.println("Código: " + nodoActual.getValor().getCodigo());
            System.out.println("Descripción: " + nodoActual.getValor().getDescripcion());
            System.out.println("Categoría: " + nodoActual.getValor().getCategoria());
            System.out.println();

            nodoActual = nodoActual.getSiguiente();
        }
    }
    
    public boolean remover(int codigo) {
    if (nodoInicial == null) {
        // La lista está vacía, no hay elementos para eliminar
        return false;
    }
    
    if (nodoInicial.getValor().getCodigo() == codigo) {
        // El primer nodo contiene el producto a eliminar
        nodoInicial = nodoInicial.getSiguiente();
        numElementos--;
        return true;
    }
    
    Nodo nodoActual = nodoInicial;
    while (nodoActual.getSiguiente() != null) {
        if (nodoActual.getSiguiente().getValor().getCodigo() == codigo) {
            // El siguiente nodo contiene el producto a eliminar
            nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
            numElementos--;
            return true;
        }
        nodoActual = nodoActual.getSiguiente();
    }
    
    // No se encontró el producto con el código especificado
    return false;
}
    
    public Producto buscar(int codigo) {
    Nodo nodoActual = nodoInicial;
    
    while (nodoActual != null) {
        if (nodoActual.getValor().getCodigo() == codigo) {
            // Se encontró el producto con el código especificado
            return nodoActual.getValor();
        }
        nodoActual = nodoActual.getSiguiente();
    }
    
    // No se encontró el producto con el código especificado
    return null;
}


}
