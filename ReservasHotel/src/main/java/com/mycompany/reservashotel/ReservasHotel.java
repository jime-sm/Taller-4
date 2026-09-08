/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reservashotel;

/**
 *
 * @author USUARIO
 */
public class ReservasHotel {

    public static void main(String[] args) {

        Hotel hotel = new Hotel("Hotel Paraíso");

        Habitación h1 = new Habitación(101, "Sencilla");
        Habitación h2 = new Habitación(102, "Doble");
        Habitación h3 = new Habitación(201, "Suite");

        hotel.agregarHabitacion(h1);
        hotel.agregarHabitacion(h2);
        hotel.agregarHabitacion(h3);

        Huesped huesped = new Huesped(1, "María");

        hotel.registrarHuesped(huesped);

        Administrador administrador =
                new Administrador(100, "Carlos");

        hotel.mostrarHabitaciones();

        huesped.consultarHabitaciones(
                hotel.getHabitaciones()
        );

        huesped.realizarReserva(
                h2,
                "10/09/2026",
                "15/09/2026"
        );

        huesped.mostrarReservas();

        administrador.cambiarEstadoHabitacion(
                h3,
                "Mantenimiento"
        );

        hotel.mostrarHabitaciones();
    }
}
    

