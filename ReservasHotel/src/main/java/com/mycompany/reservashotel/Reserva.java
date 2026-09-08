/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservashotel;

/**
 *
 * @author USUARIO
 */
public class Reserva {

    private Huesped huesped;
    private Habitación habitación;
    private String fechaEntrada;
    private String fechaSalida;

    public Reserva(Huesped huesped,
                   Habitación habitación,
                   String fechaEntrada,
                   String fechaSalida) {

        this.huesped = huesped;
        this.habitación = habitación;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public Habitación getHabitacion() {
        return habitación;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void mostrarInformacion() {

        
        System.out.println("Reserva");
        System.out.println("Huésped: " + huesped.getNombre());
        System.out.println("Habitación: " + habitación.getNumero());
        System.out.println("Tipo: " + habitación.getTipo());
        System.out.println("Entrada: " + fechaEntrada);
        System.out.println("Salida: " + fechaSalida);
        
    }
}