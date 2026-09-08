/* holi karen
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendamusica;

import java.util.ArrayList;

public class TiendaMusica {

    public static void main(String[] args) {

       
        System.out.println("       TIENDA DE MÚSICA");
        
        

        Administrador administrador =
                new Administrador(1, "Carlos");

        System.out.println("\nADMINISTRADOR");
        System.out.println(administrador);

        
        Producto guitarra =
                new Producto("P001", "Guitarra Acústica", 850000, 10);

        Producto piano =
                new Producto("P002", "Piano Digital", 2500000, 5);

        Producto bateria =
                new Producto("P003", "Batería Musical", 3200000, 3);

        Producto microfono =
                new Producto("P004", "Micrófono Profesional", 450000, 15);

        
        
        System.out.println("PRODUCTOS DISPONIBLES");
        
        System.out.println(guitarra);
        System.out.println(piano);
        System.out.println(bateria);
        System.out.println(microfono);

        
        
        System.out.println("CAMBIOS DEL ADMINISTRADOR");
        

        administrador.modificarPrecio(
                microfono,
                500000
        );

        administrador.aumentarInventario(
                guitarra,
                5
        );

        System.out.println("Precio del micrófono actualizado.");
        System.out.println("Inventario de guitarra aumentado.");

        System.out.println("nProductos actualizados:");

        System.out.println(guitarra);
        System.out.println(microfono);

       
        Cliente cliente1 =
                new Cliente(
                        1,
                        "Ana García",
                        "ana@gmail.com"
                );

        Cliente cliente2 =
                new Cliente(
                        2,
                        "Juan Pérez",
                        "juan@gmail.com"
                );

        
       
        System.out.println("CLIENTE");
        

        System.out.println(cliente1);
        System.out.println(cliente2);

        
        Venta venta1 =
                new Venta(1001, cliente1);

        
        venta1.agregarDetalle(guitarra, 2);
        venta1.agregarDetalle(microfono, 1);

       

        
        System.out.println("VENTA REALIZADA");
        

        venta1.mostrarVenta();

        
        Venta venta2 =
                new Venta(1002, cliente2);

        venta2.agregarDetalle(piano, 1);
        venta2.agregarDetalle(bateria, 1);

        
       
        System.out.println("SEGUNDA VENTA");
        

        venta2.mostrarVenta();
        
        
        System.out.println("INVENTARIO FINAL");
        

        System.out.println(guitarra);
        System.out.println(piano);
        System.out.println(bateria);
        System.out.println(microfono);

        
        System.out.println("       FIN DEL PROGRAMA");
        
    }
}