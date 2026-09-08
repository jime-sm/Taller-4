package com.mycompany.reservashotel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;


/**
 *
 * @author USUARIO
 */
public class Huesped {
    



    private int id;
    private String nombre;
    private ArrayList<Reserva> reservas;

    public Huesped(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void consultarHabitaciones(ArrayList<Habitación> habitaciones) {

        System.out.println("\nHabitaciones disponibles:");

        for (Habitación habitación : habitaciones) {

            if (habitación.getEstado().equals("Disponible")) {
                habitación.mostrarInformacion();
                System.out.println();
            }
        }
    }

    public void realizarReserva(Habitación habitacion,
                                String fechaEntrada,
                                String fechaSalida) {

        if (habitacion.getEstado().equals("Disponible")) {

            Reserva reserva = new Reserva(
                    this,
                    habitacion,
                    fechaEntrada,
                    fechaSalida
            );

            reservas.add(reserva);

            habitacion.cambiarEstado("Ocupada");

            System.out.println("Reserva realizada correctamente.");

        } else {
            System.out.println("La habitación no está disponible.");
        }
    }

    public void mostrarReservas() {

        System.out.println("\nReservas de " + nombre + ":");

        for (Reserva reserva : reservas) {
            reserva.mostrarInformacion();
        }
    }
}

