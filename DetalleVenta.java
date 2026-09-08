/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendamusica;

public class DetalleVenta {

    private Producto producto;
    private int cantidad;
    private double precioPagado;

    public DetalleVenta(Producto producto, int cantidad, double precioPagado) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioPagado = precioPagado;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioPagado() {
        return precioPagado;
    }

    public double calcularSubtotal() {
        return cantidad * precioPagado;
    }

    @Override
    public String toString() {
        return "Producto: " + producto.getNombre()
                + " | Cantidad: " + cantidad
                + " | Precio pagado: $" + precioPagado
                + " | Subtotal: $" + calcularSubtotal();
    }
}