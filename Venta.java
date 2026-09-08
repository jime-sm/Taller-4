/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendamusica;



import java.util.ArrayList;

public class Venta {

    private int numeroVenta;
    private Cliente cliente;
    private ArrayList<DetalleVenta> detalles;

    public Venta(int numeroVenta, Cliente cliente) {
        this.numeroVenta = numeroVenta;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<DetalleVenta> getDetalles() {
        return detalles;
    }

    public boolean agregarDetalle(Producto producto, int cantidad) {

        if (producto == null) {
            return false;
        }

        if (cantidad <= 0) {
            return false;
        }

        if (producto.getCantidadDisponible() < cantidad) {
            return false;
        }

        double precioPagado = producto.getPrecio();

        producto.disminuirInventario(cantidad);

        DetalleVenta detalle =
                new DetalleVenta(producto, cantidad, precioPagado);

        detalles.add(detalle);

        return true;
    }

    public double calcularTotal() {

        double total = 0;

        for (DetalleVenta detalle : detalles) {
            total += detalle.calcularSubtotal();
        }

        return total;
    }

    public void mostrarVenta() {

        System.out.println("------------------------------------");
        System.out.println("VENTA #" + numeroVenta);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("------------------------------------");

        if (detalles.isEmpty()) {
            System.out.println("La venta no tiene productos.");
        } else {

            for (DetalleVenta detalle : detalles) {
                System.out.println(detalle);
            }
        }

        
        System.out.println("TOTAL: $" + calcularTotal());
        
    }
}