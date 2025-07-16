/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendajuegos;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author fcfca
 */
public class TiendaJuegos {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        ImageIcon marca = new ImageIcon("src/logo.jpg");
        
        JOptionPane.showMessageDialog(null, "BIENVENIDO A NUESTRA TIENDA DE VIDEOJUEGOS", "TIENDAS APACHE", 
                JOptionPane.INFORMATION_MESSAGE, marca);
        JOptionPane.showInputDialog(null, "Que desea hacer el dia de hoy?\n1-Clientes\n2-Videojuegos\n"
                + "3-Ventas\n4-Intercambios\n5-Salir del sistema");
        
        
        
        
    }
}
