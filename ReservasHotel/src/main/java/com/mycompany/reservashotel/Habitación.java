/*oooo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservashotel;

/**
 *
 * @author USUARIO
 */
public class Habitación {

    private int numero;
    private String tipo;
    private String estado;

    public Habitación(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = "Disponible";
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        if (nuevoEstado.equals("Disponible") ||
            nuevoEstado.equals("Ocupada") ||
            nuevoEstado.equals("Mantenimiento")) {

            this.estado = nuevoEstado;

        } else {
            System.out.println("Estado no válido.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Habitación: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado: " + estado);
    }
}