/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendamusica;

public class Administrador {

    private int id;
    private String nombre;

    public Administrador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void modificarPrecio(Producto producto, double nuevoPrecio) {

        if (producto != null) {
            producto.setPrecio(nuevoPrecio);
        }
    }

    public void aumentarInventario(Producto producto, int cantidad) {

        if (producto != null) {
            producto.aumentarInventario(cantidad);
        }
    }

    public void disminuirInventario(Producto producto, int cantidad) {

        if (producto != null) {
            producto.disminuirInventario(cantidad);
        }
    }

    @Override
    public String toString() {
        return "Administrador: " + nombre
                + " | ID: " + id;
    }
}