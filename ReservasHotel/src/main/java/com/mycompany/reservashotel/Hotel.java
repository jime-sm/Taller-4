/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservashotel;

import java.util.ArrayList;

public class Hotel {

    private String nombre;
    private ArrayList<Habitación> habitaciones;
    private ArrayList<Huesped> huespedes;
    private ArrayList<Reserva> reservas;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        this.huespedes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitación habitacion) {
        habitaciones.add(habitacion);
    }

    public void registrarHuesped(Huesped huesped) {
        huespedes.add(huesped);
    }

    public ArrayList<Habitación> getHabitaciones() {
        return habitaciones;
    }

    public void mostrarHabitaciones() {

        System.out.println("\nHabitaciones del hotel:");

        for (Habitación habitación : habitaciones) {
            habitación.mostrarInformacion();
            System.out.println();
        }
    }
}
