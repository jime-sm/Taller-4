package com.mycompany.tiendamusica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public Producto(String codigo, String nombre, double precio, int cantidadDisponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setCantidadDisponible(cantidadDisponible);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor que 0.");
        }
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        if (cantidadDisponible >= 0) {
            this.cantidadDisponible = cantidadDisponible;
        } else {
            System.out.println("La cantidad no puede ser negativa.");
        }
    }

    public void aumentarInventario(int cantidad) {
        if (cantidad > 0) {
            cantidadDisponible += cantidad;
        }
    }

    public boolean disminuirInventario(int cantidad) {
        if (cantidad > 0 && cantidad <= cantidadDisponible) {
            cantidadDisponible -= cantidad;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Código: " + codigo
                + " | Nombre: " + nombre
                + " | Precio: $" + precio
                + " | Disponible: " + cantidadDisponible;
    }
}
