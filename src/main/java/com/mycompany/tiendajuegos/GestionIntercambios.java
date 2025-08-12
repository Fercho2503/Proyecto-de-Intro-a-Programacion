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
public class GestionIntercambios {
private GestionClientes gestionClientes;
    private GestionJuegos gestionJuegos;

    public GestionIntercambios(GestionClientes gestionClientes, GestionJuegos gestionJuegos) {
        this.gestionClientes = gestionClientes;
        this.gestionJuegos = gestionJuegos;
    }

    public void mostrarListaJuegos() {
        gestionJuegos.consultarProductos();
    }

    public void registrarIntercambio() {
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente: "));

        Clientes clienteEncontrado = null;
        for (int i = 0; i < gestionClientes.contador; i++) {
            if (gestionClientes.clientes[i].getCedula() == cedula) {
                clienteEncontrado = gestionClientes.clientes[i];
                break;
            }
        }

        if (clienteEncontrado == null) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            return;
        }

        mostrarListaJuegos();

        int idJuegoNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del juego que desea recibir: "));

        Juegos juegoNuevo = null;
        int indiceJuegoNuevo = -1;
        for (int i = 0; i < gestionJuegos.contador; i++) {
            if (gestionJuegos.juegos[i].getIdJuego() == idJuegoNuevo) {
                juegoNuevo = gestionJuegos.juegos[i];
                indiceJuegoNuevo = i;
                break;
            }
        }

        if (juegoNuevo == null) {
            JOptionPane.showMessageDialog(null, "El juego solicitado no está disponible.");
            return;
        }

        String nombreJuegoCliente = JOptionPane.showInputDialog("Ingrese el nombre del juego que está entregando: ");
        int idJuegoCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del juego que está entregando: "));
        double precioJuegoCliente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio estimado del juego que está entregando: "));
        String generoJuegoCliente = JOptionPane.showInputDialog("Ingrese el género del juego que está entregando: ");
        String plataformaJuegoCliente = JOptionPane.showInputDialog("Ingrese la plataforma del juego que está entregando: ");
        int lanzamientoJuegoCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de lanzamiento del juego que está entregando: "));

        gestionJuegos.juegos[indiceJuegoNuevo] = new Juegos(
                nombreJuegoCliente,
                idJuegoCliente,
                precioJuegoCliente,
                generoJuegoCliente,
                plataformaJuegoCliente,
                lanzamientoJuegoCliente
        );

        int comprobante = (int) (Math.random() * 1000000);
        String mensaje = "COMPROBANTE DE INTERCAMBIO\n" +
                         "Cliente: " + clienteEncontrado.getNombre() + "\n" +
                         "Cédula: " + clienteEncontrado.getCedula() + "\n" +
                         "Juego entregado: " + nombreJuegoCliente + "\n" +
                         "Juego recibido: " + juegoNuevo.getNombreJuego() + "\n" +
                         "Número de comprobante: " + comprobante;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

