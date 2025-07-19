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
        JOptionPane.showInputDialog(null, "****MENÚ****\n1-Clientes\n2-Productos\n3-Ventas\n4-Intercambios\n5-Salir del sistema");
        
        //Menu Clientes
        JOptionPane.showInputDialog(null, "CLIENTES\n1- Registrar cliente\n2-Modificar clientes\n3-Eliminar Cliente\n\n4-Volver al menu principal");
        
        //Menu PRODUCTOS
        JOptionPane.showInputDialog(null, "****PRODCUTOS****\n1-Registrar producto\n2-Consultar productos\n\n3-Volver al menu principal");
        
        
        //Menu Ventas
        JOptionPane.showInputDialog(null, "****VENTAS****\n1-Realizar venta\n\n2-Volver al menu principal");
        
        //Menu Intercambios
        JOptionPane.showInputDialog(null, "****INTERCAMBIOS****\n1-Lista de juegos\n2-Registro juego cliente\n3-Generar comprobante intercambio\n\n4-Volver al menu principal");


        
        
        
        
        
        
    }
}
