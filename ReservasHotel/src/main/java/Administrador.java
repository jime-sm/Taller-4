
import com.mycompany.reservashotel.Habitación;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Administrador {
        private int id;
    private String nombre;

    public Administrador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void cambiarEstadoHabitacion(Habitación habitación,
                                        String nuevoEstado) {

        habitación.cambiarEstado(nuevoEstado);

        System.out.println(
                "El administrador " + nombre +
                " cambió el estado de la habitación " +
                habitación.getNumero()
        );
    }

    public void mostrarInformacion() {
        System.out.println("Administrador: " + nombre);
        System.out.println("ID: " + id);
    }
}
    
