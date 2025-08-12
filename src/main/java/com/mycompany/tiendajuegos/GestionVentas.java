/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendajuegos;

import javax.swing.JOptionPane;

/**
 *
 * @author fcfca
 */
public class GestionVentas {

    Ventas[] ventas = new Ventas[100];
    int contadorVentas = 0;

    GestionJuegos gestionJuegos;

    public GestionVentas(GestionJuegos juegos) {
        this.gestionJuegos = juegos;
    }

    public void realizarVenta() {
        String nombreCliente = JOptionPane.showInputDialog(null, "Digite el nombre del cliente para la venta");
        if (nombreCliente == null || nombreCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre para continuar.");
            return;
        }
        String listaJuegos = "Juegos disponibles:\n\n";
        for (int i = 0; i < gestionJuegos.contador; i++) {
            listaJuegos += (i + 1) + ". " + gestionJuegos.juegos[i].getNombreJuego()
                    + " - ID: " + gestionJuegos.juegos[i].getIdJuego()
                    + " - Precio: ₡" + gestionJuegos.juegos[i].getPrecioJuego() + "\n";
        }
        int numeroJuego = Integer.parseInt(JOptionPane.showInputDialog(listaJuegos + "\nSeleccione el número del juego:")) - 1;

        if (numeroJuego < 0 || numeroJuego >= gestionJuegos.contador) {
            JOptionPane.showMessageDialog(null, "Juego invalido");
            return;
        }

        double precio = gestionJuegos.juegos[numeroJuego].getPrecioJuego();
        int idProducto = gestionJuegos.juegos[numeroJuego].getIdJuego();
        String nombreJuego = gestionJuegos.juegos[numeroJuego].getNombreJuego();

        String factura = "= FACTURA DE JUEGO =\n"
                + "Cliente: " + nombreCliente + "\n"
                + "Juego Seleccionado: " + gestionJuegos.juegos[numeroJuego].getNombreJuego() + "\n"
                + "ID del juego: " + idProducto + "\n"
                + "Precio total: ₡" + precio + "\n"
                + "===================\nGracias por su compra!";

        ventas[contadorVentas++] = new Ventas(nombreCliente, idProducto, precio, 1, factura);

        for (int i = numeroJuego; i < gestionJuegos.contador - 1; i++) {
            gestionJuegos.juegos[i] = gestionJuegos.juegos[i + 1];
        }
        gestionJuegos.juegos[--gestionJuegos.contador] = null;

        JOptionPane.showMessageDialog(null, factura);
        JOptionPane.showMessageDialog(null, "El juego '" + nombreJuego + "' ha sido retirado del inventario.");

    }
}
