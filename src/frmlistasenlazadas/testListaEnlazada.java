/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frmlistasenlazadas;

/**
 *
 * @author carlospalominovidal
 */
public class testListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                // Crear una lista enlazada vacía
        ListaEnlazada lista = new ListaEnlazada();

        // Crear algunos objetos Producto
        Producto producto1 = new Producto(1, "Producto 1", "Categoría A");
        Producto producto2 = new Producto(2, "Producto 2", "Categoría B");
        Producto producto3 = new Producto(3, "Producto 3", "Categoría A");

        // Agregar los productos a la lista
        lista.agregarNodo(producto1);
        lista.agregarNodo(producto2);
        lista.agregarNodo(producto3);

        // Imprimir los elementos de la lista
        lista.imprimir();
    }
    
}
