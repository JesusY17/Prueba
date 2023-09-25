/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frmlistasenlazadas;

/**
 *
 * @author carlospalominovidal
 */
public class Producto {
    // Atributos
    private int codigo;
    private String descripcion;
    private String categoria;

    // Constructor
    public Producto(int codigo, String descripcion, String categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    // Métodos Getter y Setter para el código
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Métodos Getter y Setter para la descripción
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Métodos Getter y Setter para la categoría
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
