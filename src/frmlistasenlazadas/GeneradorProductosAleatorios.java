/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frmlistasenlazadas;

/**
 *
 * @author carlospalominovidal
 */
import java.util.Random;

public class GeneradorProductosAleatorios {

    public static ListaEnlazada generarProductosAleatorios(int cantidad) {
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        Random rand = new Random();

        for (int i = 0; i < cantidad; i++) {
            int codigo = rand.nextInt(1000); // Código aleatorio entre 0 y 999
            String descripcion = generarDescripcionAleatoria();
            String categoria = generarCategoriaAleatoria();

            Producto producto = new Producto(codigo, descripcion, categoria);
            listaEnlazada.agregarNodo(producto);
        }

        return listaEnlazada;
    }

    private static String generarDescripcionAleatoria() {
        // Implementa la lógica para generar descripciones aleatorias aquí.
        // Puedes utilizar un array de palabras y seleccionar aleatoriamente para formar la descripción.
        // Por ejemplo:
        String[] palabras = {"Producto", "Artículo", "Objeto", "Artículo de lujo", "Producto esencial"};
        Random rand = new Random();
        int indice = rand.nextInt(palabras.length);
        return palabras[indice];
    }

    private static String generarCategoriaAleatoria() {
        // Implementa la lógica para generar categorías aleatorias aquí.
        // Puedes definir un conjunto de categorías y seleccionar una al azar.
        // Por ejemplo:
        String[] categorias = {"Electrónica", "Ropa", "Hogar", "Alimentos", "Juguetes"};
        Random rand = new Random();
        int indice = rand.nextInt(categorias.length);
        return categorias[indice];
    }
}
